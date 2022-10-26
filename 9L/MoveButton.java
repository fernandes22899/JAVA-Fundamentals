import wheelsunh.users.*;
import java.awt.Point;
import java.awt.Color;

/**Class that makes snake move.
  * @author Jeffrey Fernandes
  * 9L
  * 9/26/17
  */

public class MoveButton extends DrawButton
{
    /**Contructor gets super command that allows it to control snake.
     * @param x int
     * @param y int
     * @param s Snake
     */
    
    public MoveButton( int x, int y, Snake s )
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
        _snake.move( 10 );
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
        MoveButton mb = new MoveButton( 200, 200, s );
        
    }
}