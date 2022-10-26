import wheelsunh.users.*;
import java.awt.Color;
import java.util.*;

/**
 * Board, generate a BlackJack board.
 * 
 * public methods
 * ---------------
 *   void clear() 
 *         Clear the board ready for the next hand
 *   int hitDealer() 
 *         Deal a card to the dealer and return the card rank (1-13)
 *   int hitPlayer() 
 *         Deal a card to the player and return the card rank (1-13)
 *   void showDealer() 
 *         Uncover dealers cards at end of game
 *   Board(int mode) 
 *        Construct a blackJack game board. If mode equals 1 then 
 *        cards are dealt in prearranged order for testing, otherwise
 *         card are random    
 * 
 * @author mlb   
 */
public class Board
{ 
    //----------------- instance variables ------------------------
    //  private Vector < Card > downDeck;
    private boolean testMode = false;
    private Rectangle back;
    private Vector < Card > cards;
    private Vector < Card > dealer;
    private Vector < Card > player;
    
    private  int dealerX = 250, dealerY = 130, playerX = 250;
    private int playerY = 330, offset = 75;
    
    private int cardIndex = 0;
    private Image edge;
    private Image lastDown;
    
    private Rectangle down[];
    
    //-------------------- constructor -------------------------
    /**
     * Construct a blackJack game board. 
     * If mode equals 1 then a test set of cards is dealt, otherwise 
     * cards are random.
     * 
     * @param mode int
     */
    public Board( int mode )
    {
        player = new Vector< Card >();
        dealer = new Vector < Card >();
        
        // Create Background
        back = new Rectangle( 0, 0 );
        back.setColor( new Color( 0, 66, 0 ) );
        back.setSize( 700, 500 );
        
        // Create Empty Card Locations
        down = new Rectangle[ 4 ];
        for ( int r = 0; r < 4; r++ ) 
        {
            down[ r ] = new Rectangle( Color.gray );
            down[ r ].setSize( 70, 95 );
        }
        
        down[ 0 ].setLocation( playerX, playerY );
        down[ 1 ].setLocation( dealerX, dealerY );
        down[ 2 ].setLocation( playerX + offset, playerY );
        down[ 3 ].setLocation( dealerX + offset , dealerY );
        
        
        // If in test mode set the cards to a standard test sequence
        if( mode == 1 )
            testMode = true;
        
        
        // Create the deck of cards
        cards = new Vector < Card >();
        
        if( !testMode ) // shuffle cards
        {
            for ( int r = 1 ; r < 14 ; r++ )
            {
                for ( int s = 1; s < 5 ; s++ )
                {
                    Card c = new Card( r, s );
                    c.setLocation(  ( r * s - 1 ) * 6, 10 );
                    cards.add( c ); 
                }
            }
            reShuffle();
        }
        else  //set up cards
        {
            createTest();   
        }
    }
    
    //------------------------------------------------------------------
    /**
     *   Get the number of cards remaining in the down deck.
     * 
     * @return int
     */
    private int getDeckCount()
    {
        return cards.size() - cardIndex;   
    }
    
    
    //------------------------------------------------------------------
    /** Deal a card to the player and return the card rank (1-13).
      * 
      * @return int
      */
    public int hitPlayer()
    {   
        Card next;
        int count = player.size( );

        next = cards.get( cardIndex++ );
        next.setLocation( playerX + offset * count, playerY );
        next.showFace( );
        //updateDownDeck( );
        player.add( next );

        return next.getRank();
    }
    
    //------------------------------------------------------------------
    /**  Deal a card to the dealer and return the card rank (1-13).
      * 
      * @return int
      */
    public int hitDealer()
    {   
        Card next;
        int count = dealer.size( );

        next = cards.get( cardIndex++ );
        next.setLocation( dealerX + offset * count, dealerY );
        
        // keep card 0 hidden during game
        if( count > 0 )
            next.showFace( );
        
        //updateDownDeck( );
        dealer.add( next );
        
        return next.getRank();
    }
    
    //------------------------------------------------------------------
    /**  Uncover dealers cards at end of game.
      * 
      */
    public void showDealer()
    {   
        dealer.get( 0 ).showFace();
    }
    
    
    //-----------------------------------------------------------------
    /**     Clear the board ready for the next hand.
      * 
      */
    public void clear()
    {
        for( int i = 0; i < player.size(); i++ )
        {
            player.get( i ).setLocation( -200, -200 );
        }
        
        for( int i = 0; i < dealer.size(); i++ )
        {
            dealer.get( i ).setLocation( -200, -200 );
        }
        
        player.clear();
        dealer.clear(); 
        // reshuffle if needed
        
        if( getDeckCount() < 10 )
            reShuffle();
    }
    
    
    
    //------------------------------------------------------------------
    /**
     *  Creates a testing hand, see comments for sequence.
     */
    private void createTest()
    {
        // dealer blackj
        cards.add( new Card( 5, 1 ) ); 
        cards.add( new Card( 1, 1 ) ); 
        cards.add( new Card( 5, 1 ) ); 
        cards.add( new Card( 12, 1 ) ); 
        
        // player blackj
        cards.add( new Card( 1, 1 ) ); 
        cards.add( new Card( 4, 1 ) ); 
        cards.add( new Card( 12, 1 ) ); 
        cards.add( new Card( 3, 1 ) ); 
        
        // both blackj
        cards.add( new Card( 1, 1 ) ); 
        cards.add( new Card( 1, 1 ) ); 
        cards.add( new Card( 12, 1 ) ); 
        cards.add( new Card( 13, 1 ) ); 
        
        // player wins with stand
        cards.add( new Card( 10, 1 ) ); 
        cards.add( new Card( 11, 1 ) ); 
        cards.add( new Card( 9, 1 ) ); 
        cards.add( new Card( 8, 1 ) ); 
        
        // dealer wins with stand
        cards.add( new Card( 10, 1 ) ); 
        cards.add( new Card( 11, 1 ) ); 
        cards.add( new Card( 9, 1 ) ); 
        cards.add( new Card( 13, 1 ) ); //20
        
        // player bust with hit
        cards.add( new Card( 10, 1 ) ); 
        cards.add( new Card( 11, 1 ) ); 
        cards.add( new Card( 2, 1 ) ); 
        cards.add( new Card( 6, 1 ) ); 
        cards.add( new Card( 10, 1 ) ); 
        
        
        // dealer bust with stand
        cards.add( new Card( 10, 1 ) ); 
        cards.add( new Card( 11, 1 ) ); 
        cards.add( new Card( 13, 1 ) ); 
        cards.add( new Card( 2, 1 ) ); 
        cards.add( new Card( 10, 1 ) ); //30
        
        
        // push with stand
        cards.add( new Card( 10, 1 ) ); 
        cards.add( new Card( 11, 1 ) ); 
        cards.add( new Card( 10, 1 ) ); 
        cards.add( new Card( 11, 1 ) ); //34

        // Player ace wins with hit
        cards.add( new Card( 1, 1 ) ); 
        cards.add( new Card( 11, 1 ) ); 
        cards.add( new Card( 5, 1 ) ); 
        cards.add( new Card( 2, 1 ) ); 
        cards.add( new Card( 5, 1 ) ); //44
        
        // end of deck reshuffle
        // after hit
        cards.add( new Card( 10, 1 ) ); 
        cards.add( new Card( 11, 1 ) ); 
        cards.add( new Card( 2, 1 ) ); 
        cards.add( new Card( 6, 1 ) ); 
        cards.add( new Card( 10, 1 ) ); 
    }
    
    
    //-----------------------------------------------------------------
    /**
     *  reshuffle the down deck.
     */  
    public  void reShuffle()
    {
        Collections.shuffle( cards );  
        cardIndex = 0;

        for ( int i = 51; i >= 0 ; i-- )
        {
            Card c = cards.get( i );
            c.hide();
            c.show();
            c.hideFace();
            c.setLocation( 20 + ( 51 - i ) * 8, 10 );
        }
    }
    
        //----------------------------------------------------------
    /**
     * Main.
     * 
     * @param a String
     */
    public static void main( String a[] )
    {
        new wheelsunh.users.Frame();
        new BlackJackApp( a ); 
    } 
    
}
