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
public class StandButton extends ShapeGroup
{
    private int id, current, stake;
    private boolean dBool, hBool, sBool;
    private RoundedRectangle dB, hB, sB;
    private TextBox dealText, hitText, standText;
    protected Game g;
    
    /**Constructor hitbutton calls to make button.
     * @param x int
     * @param y int
     * @param g1 Game
     */
    public StandButton( int x, int y, Game g1 )
    {
        makeStand( x, y );
        g = g1;
    }
    
    /**Method makes button.
     * @param x int
     * @param y int
     */
    public void makeStand( int x, int y )
    {
        sB = new RoundedRectangle( x + 36, y + 440 );
        sB.setSize( 18, 18 );
        sB.setColor( Color.WHITE );
        add( sB );
        
        standText = new TextBox( 56, 437 );
        standText.setColor( new Color( 0, 0, 0, 0 ) );
        standText.setText( " Stand" );
        
    }
    
    /**This mousePressed changes buttons to black when pressed.
     * @param e MouseEvent
     */
    public void mousePressed ( MouseEvent e )
    {
        sB.setColor( Color.BLACK );
        g.standPlayer();
    }
    
    /**This mouseReleased changes buttons to white when released.
     * @param e MouseEvent
     */
    public void mouseReleased ( MouseEvent e )
    {
        sB.setColor( Color.WHITE );
    }
    
    /**Method makes dealbutton hidden and the text.
     */
    public void hide()
    {
        sB.hide();
        standText.hide();
    }
    
    /**Method makes dealbutton shown and the text.
     */
    public void show()
    {
        sB.show();
        standText.show();
    }
    
    /**Main method that runs and tests contructor and methods.
     * @param args String
     */
    public static void main( String[]args )
    {
        new Frame();
        Board b = new Board( 1 );
        Game a = new Game( b );
        StandButton s = new StandButton( 0, 0, a );
    }   
}