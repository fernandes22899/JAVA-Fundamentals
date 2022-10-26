/**
 * BlackJackApp. 
 * 
 * Starts the game of Blackjack creates a Board (written by us) and a 
 * Game written by the student and makes them peers.
 * 
 * @author cs415
 */
public class BlackJackApp
{  
    //-------------------- constructor -------------------------
    /**
     * Starts a game of Blackjack.
     *
     * @param a String
     */
    public BlackJackApp( String [] a )
    {
        Board board;
        if( a.length > 0 )
            board = new Board( 1 );  //test mode
        else
            board = new Board( 0 );  //normal game mode
        
        Game game = new Game( board ); // make board a peer of the game
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
