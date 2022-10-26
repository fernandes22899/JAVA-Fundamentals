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
public class Button extends RoundedRectangle
{
    protected DealButton _dealButton;
    
    /**This constructor calls super and cals a protected dealbutton.
     * @param a DealButton
     */
    public Button( DealButton a )
    {
        super();
        _dealButton = a;
    }
    
    /**This mousepressed changes buttons to black when pressed.
     * @param a MouseEvent
     */
    public void mousePressed( MouseEvent a )
    {
        this.setColor( Color.BLACK );
    }
    
    /**This mouseReleased changes buttons to white when released.
     * @param a MouseEvent
     */
    public void mouseReleased( MouseEvent a )
    {
        this.setColor( Color.WHITE );
    }
}