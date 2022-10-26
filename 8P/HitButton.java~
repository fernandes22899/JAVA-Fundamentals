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
public class HitButton extends ShapeGroup
{
    private int id, current, stake;
    private boolean dBool, hBool, sBool;
    private RoundedRectangle dB, hB, sB;
    private TextBox dealText, hitText, standText;
    private Board _board;
    protected Game g;
    
    /**Constructor hitbutton calls to make button.
     * @param x int
     * @param y int
     * @param g1 Game
     */
    public HitButton( int x, int y, Game g1 )
    {
        makeHit( x, y );
        g = g1;
    }
    
    /**Method makes button.
     * @param x int
     * @param y int
     */
    public void makeHit( int x, int y )
    {
        
        hB = new RoundedRectangle( x + 36, y + 410 );
        hB.setSize( 18, 18 );
        hB.setColor( Color.WHITE );
        add( hB );
        
        hitText = new TextBox( 56, 407 );
        hitText.setColor( new Color( 0, 0, 0, 0 ) );
        hitText.setText( " Hit" );
        
    }
    
    /**This mousePressed changes buttons to black when pressed.
     * @param e MouseEvent
     */
    public void mousePressed( MouseEvent e )
    {
        hB.setColor( Color.BLACK );
        g.hitPlayer();
    }
    
    /**This mouseReleased changes buttons to white when released.
     * @param e MouseEvent
     */
    public void mouseReleased( MouseEvent e )
    {
        hB.setColor( Color.WHITE );
    }
    
    /**Method makes dealbutton hidden and the text.
     */
    public void hide()
    {
        hB.hide();
        hitText.hide();
    }
    
    /**Method makes dealbutton shown and the text.
     */
    public void show()
    {
        hB.show();
        hitText.show();
    }
    
    /**Main method that runs and tests contructor and methods.
     * @param args String
     */
    public static void main( String[]args )
    {
        new Frame();
        Board b = new Board( 1 );
        Game a = new Game( b );
        HitButton h = new HitButton( 0, 0, a );
    }
}