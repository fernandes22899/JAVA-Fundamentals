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
public class DealButton extends ShapeGroup
{
    private int id, current, stake, playerScore, compScore;
    private boolean dBool, hBool, sBool;
    private RoundedRectangle dB, hB, sB;
    private TextBox dealText, hitText, standText;
    private Board _board;
    protected Game g;
    
    /**Constructor dealbutton calls to make button.
     * @param x int
     * @param y int
     * @param g1 Game
     */
    public DealButton( int x, int y, Game g1 )
    {
        makeDeal( x, y );
        g = g1;
    }
    
    /**Method makes button.
     * @param x int
     * @param y int
     */
    public void makeDeal( int x, int y )
    {
        
        dB = new RoundedRectangle( x + 36, y + 380 );
        dB.setSize( 18, 18 );
        dB.setColor( Color.WHITE );
        add( dB );
            
        dealText = new TextBox( x + 56, y + 377 );
        dealText.setColor( new Color( 0, 0, 0, 0 ) );
        dealText.setText( " Deal" );
        
    }
    
    
    /**This mousePressed changes buttons to black when pressed.
     * @param e MouseEvent
     */
    public void mousePressed( MouseEvent e )
    {
        dB.setColor( Color.BLUE );
        g.dealPlayer();
    }
    
    /**This mouseReleased changes buttons to white when released.
     * @param e MouseEvent
     */
    public void mouseReleased( MouseEvent e )
    {
        dB.setColor( Color.WHITE );
    }
    
    /**Method makes dealbutton hidden and the text.
     */
    public void hide()
    {
        dB.hide();
        dealText.hide();
    }
    
    /**Method makes dealbutton seen and the text.
     */
    public void show()
    {
        dB.show();
        dealText.show();
    }
        
    /**Main method that runs and tests contructor and methods.
     * @param a String
     */
    public static void main( String[]a )
    {
        new Frame();
        Board b = new Board( 1 );
        Game g = new Game( b );
        DealButton h = new DealButton( 0, 0, g );
        
    }
}