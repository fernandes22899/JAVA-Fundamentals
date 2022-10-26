
import wheelsunh.users.*;
import java.awt.Point;
import java.awt.Color;

/**Class that turns snake left.
  * @author Jeffrey Fernandes
  * 9L
  * 9/26/17
  */

public class LeftButton extends DrawButton
{
    /**Contructor gets super command that allows it to control snake.
     * @param x int
     * @param y int
     * @param s Snake
     */
    public LeftButton( int x, int y, Snake s )
    {
        super( x, y, s );
    }
    
    /**Method turns snake left and makes button red.
     * @param e java.awt.event.MouseEvent
     */
    
    public void mousePressed ( java.awt.event.MouseEvent e )
    {
        this.setColor( Color.RED );
        _snake.turnLeft();
    }
    
    /**Method turns color back to blue when released.
     * @param e java.awt.event.MouseEvent
     */
    
    public void mouseReleased ( java.awt.event.MouseEvent e )
    {
        this.setColor( Color.BLUE );
    }
    
    /**Main method that runs constructor, makes snake, and makes a Frame.
     * @param args String
     */

    public static void main ( String[]args )
    {
        new Frame();
        Snake s = new Snake( 100, 100 );
        LeftButton left = new LeftButton( 200, 200, s );
    }
}
