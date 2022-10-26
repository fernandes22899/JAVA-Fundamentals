import wheelsunh.users.*;
import java.awt.event.*;
import java.awt.Color;

/**Models a game of BlackJack (just a skeleton now).
 * 
 *  @author cs415
 * 
 * This is a skeleton, complete the code  and add methods etc. 
 * to implement your game of  blackjack.
 */
public class Game extends ShapeGroup
{
    private Board _board;
    private int money = 500, playerScore = 0, compScore = 0, current,
    compHitTimes, hitTimes, test = 0;
    private RoundedRectangle deal, hit, stand;
    public DealButton dB, hB, sB;
    private boolean dBool, hBool, sBool, check;
    private Rectangle active, info;
    private TextBox infoText;
    private DealButton dButton;
    private HitButton hButton;
    private StandButton sButton;
    
    //--------------------------------------------------------------
    /**Constuct a game of Blackjack.
     * @param b Board
     */
    public Game( Board b )
    {
        // save the board as a peer
        _board = b;
        box( 0, 0 );
        
        //playGame(b);
        
        dButton = new DealButton( 0, 0, this );
        hButton = new HitButton( 0, 0, this );
        sButton = new StandButton( 0, 0, this );
        
        hButton.hide();
        sButton.hide();
        //dealPlayer();
    }
    
    /**Method runs board and cards are on table after button deal is pressed.
     */
    public void dealPlayer()
    {
        if( money <= 0 )
        {
            infoText.setText( "   You have ran out of money \nand you are no" 
                              + " longer \nallowed to play, sorry." );
            
            dButton.hide();
            hButton.hide();
            sButton.hide();
        }
        else
        {
            _board.clear();
            hitTimes = 0;
            compHitTimes = 0;
            money -= 50;
            current = _board.hitPlayer();
            if( current >= 11 )
                current = 10;
            else if( current == 1 )
                current = 11;
            System.out.println( "Player gets " + current );
            playerScore = current;
            
            current = _board.hitDealer(); 
            if( current >= 11 )
                current = 10;
            else if( current == 1 )
                current = 11;
            System.out.println( "Dealer gets " + current );
            compScore = current;
            
            current = _board.hitPlayer();
            if( current >= 11 )
                current = 10;
            else if( current == 1 )
                current = 11;
            System.out.println( "Player gets " + current );
            playerScore += current;
            
            current = _board.hitDealer();
            if( current >= 11 )
                current = 10;
            else if( current == 1 )
                current = 11;
            System.out.println( "Dealer gets " + current );
            compScore += current;
            
            System.out.println( "Player: " + playerScore 
                                   + " Dealer: " + compScore );
            
            infoText.setText( "    Welcome to Blackjack!" 
                                 + "\n\n=================="
                                 + "\nPlayer Stake: " + money 
                                 + "\n\n==============="
                                 + "\nMessage: " + "\nCount: " + playerScore
                                 + " \nHit or Stand? " );
            
            dButton.hide();
            hButton.show();
            sButton.show();
        }
    }
    
    /**Method deals more cards when button is pressed.
     */
    public void hitPlayer()
    {
        if( hitTimes < 3 )
        {
            current = _board.hitPlayer();
            if( current >= 11 )
                current = 10;
            else if( current == 1 )
                current = 11;
            System.out.println( "Player gets " + current );
            playerScore += current;
            
            infoText.setText( "    Welcome to Blackjack!" 
                             + "\n\n=================="
                             + "\nPlayer Stake: " + money 
                             + "\n\n==============="
                             + "\nMessage: " + "\nCount: " + playerScore
                             + " \nHit or Stand? " );
            
            if( playerScore > 21 )
                standPlayer();
                
            hitTimes++;
        }
        
    }
    
    /**Button ends game when pressed.
     */
    public void standPlayer()
    {   
        while( compScore < 17 && compHitTimes < 3 )
        {
            current = _board.hitDealer(); 
            if( current >= 11 )
            current = 10;
            else if( current == 1 )
            current = 11;
            System.out.println( "Dealer gets " + current );
            compScore += current;
            compHitTimes++;
        }
        
        if( playerScore > compScore && playerScore < 21 )
        {
            money += 100;
            infoText.setText( "    Welcome to Blackjack!" 
                             + "\n\n=================="
                             + " Player Stake: " + money + "\n\n==============="
                             + "Message: " + "\nPlayer has " + playerScore
                             + "\nDealer has " + compScore
                             + "\nPlayer Wins!!!" );
        }
        else if( playerScore > 21 && compScore > 21 )
        {
            money += 50;
            infoText.setText( "    Welcome to Blackjack!" 
                             + "\n\n=================="
                             + " Player Stake: " + money + "\n\n==============="
                             + "Message: " + "\nPlayer has " + playerScore
                             + "\nDealer has " + compScore
                             + "\nYou and the Dealer BUST" );
        }
        else if( playerScore == 21 && compScore == 21 )
        {
            money += 50;
            infoText.setText( "    Welcome to Blackjack!" 
                             + "\n\n=================="
                             + " Player Stake: " + money + "\n\n==============="
                             + "Message: " + "\nPlayer has " + playerScore
                             + "\nDealer has " + compScore
                             + "\nYou and the Dealer got BlackJack and tie" );
        }
        else if( compScore > playerScore && compScore < 21 )
        {
            infoText.setText( "    Welcome to Blackjack!" 
                             + "\n\n=================="
                             + " Player Stake: " + money + "\n\n==============="
                             + "Message: " + "\nPlayer has " + playerScore
                             + "\nDealer has " + compScore
                             + "\nDealer Wins" );
        }
        else if( playerScore > 21 )
        {
            infoText.setText( "    Welcome to Blackjack!" 
                             + "\n\n=================="
                             + " Player Stake: " + money 
                             + "\n\n==============="
                             + "Message: " + "\nPlayer busted with " 
                             + playerScore
                             + "\nDealer Wins" );
        }
        else if( playerScore == compScore && compScore == playerScore )
        {
            money += 50;
            infoText.setText( "    Welcome to Blackjack!" 
                                 + "\n\n=================="
                             + " Player Stake: " + money + "\n\n==============="
                             + "Message: " + "\nPlayer has " + playerScore
                             + "\nDealer has " + compScore
                             + "\nYou and the Dealer tie" );
        }
        else if( playerScore == 21 && compScore != 21 )
        {
            money += 150;
            infoText.setText( "    Welcome to Blackjack!" 
                                 + "\n\n=================="
                             + " Player Stake: " + money + "\n\n==============="
                             + "Message: " + "\nPlayer has " + playerScore
                             + "\nDealer has " + compScore
                             + "\nYou get BlackJack!!" );
        }
        else if( compScore == 21 && playerScore != 21 )
        {
            infoText.setText( "    Welcome to Blackjack!" 
                                 + "\n\n=================="
                             + " Player Stake: " + money + "\n\n==============="
                             + "Message: " + "\nPlayer has " + playerScore
                             + "\nDealer has " + compScore
                             + "\nDealer gets BlackJack" );
        }
        else if( playerScore < 21 && compScore > 21 )
        {
            money += 100;
            infoText.setText( "    Welcome to Blackjack!" 
                                 + "\n\n=================="
                             + " Player Stake: " + money + "\n\n==============="
                             + "Message: " + "\nPlayer has " + playerScore
                             + "\nDealer has " + compScore
                             + "\nPlayer Wins!" );
        }
        
        _board.showDealer();
        dButton.show();
        hButton.hide();
        sButton.hide();
        
    }
    
    /**Makes grey box and textbox.
      * @param x int
      * @param y int
     */
    public void box( int x, int y )
    {
        active = new Rectangle( x + 30, y + 370 );
        active.setColor( new Color( 150, 153, 158 ) );
        active.setSize( 85, 100 );
        info = new Rectangle( x + 30, y + 170 );
        info.setColor( new Color( 150, 153, 158 ) );
        info.setSize( 190, 160 );
        infoText = new TextBox( x + 33, y + 173 );
        infoText.setColor( new Color( 0, 0, 0, 0 ) );
        infoText.setText( "    Welcome to Blackjack!" + "\n\n=================="
                             + "\nPlayer Stake: " + money 
                             + "\n\n==============="
                             + "\nMessage: " 
                             + "You start with $500, it \ncosts $50 to play" );
    }
    
    
    //----------------------------------------------------------
    /**Starts the main app.
     * @param a String
     */
    public static void main( String a[] )
    {
        new Frame();
        new BlackJackApp( a );
        
    }
}