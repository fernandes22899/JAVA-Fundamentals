import wheelsunh.users.*;
import java.awt.Point;
import java.awt.Color;

/**Class that turns snake right.
  * @author Jeffrey Fernandes
  * 9L
  * 9/26/17
  */

public class RightButton extends DrawButton
{
    /**Contructor gets super command that allows it to control snake.
     * @param x int
     * @param y int
     * @param s Snake
     */
    
    public RightButton( int x, int y, Snake s )
    {
        super( x, y, s );
    }
    
    /**Method changes snake color when pressed.
      * @param e java.awt.event.MouseEvent
      * 
      */
    
    public void mousePressed ( java.awt.event.MouseEvent e )
    {
        this.setColor( Color.RED );
        _snake.turnRight();
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
        RightButton right = new RightButton( 70, 70, s );
    }
}