import wheelsunh.users.*;
import java.awt.Point;
import java.awt.Color;

/**Class that makes button that changes with clicks.
  * @author Jeffrey Fernandes
  * 9L
  * 9/26/17
  */

public class DrawButton extends Ellipse
{
    //--Instance Variables--
    protected Snake _snake;
    
    /**Constructor modifies the button and allows it to be accessed.
      * @param x int
      * @param y int
      * @param s Snake
      */
    
    public DrawButton ( int x, int y, Snake s )
    {
        super( x, y );
        this.setSize( 20, 20 );
        this.setColor( Color.BLUE );
        _snake = s;
    }
    
    /**Method changes snake color when pressed.
      * @param e java.awt.event.MouseEvent
      * 
      */
    
    public void mousePressed ( java.awt.event.MouseEvent e )
    {
        this.setColor( Color.RED );
        
    }
    
    /**Method changes color back to blue when released.
      * @param e java.awt.event.MouseEvent 
      */ 
    
    public void mouseReleased ( java.awt.event.MouseEvent e )
    {
        this.setColor( Color.BLUE );
    }
    
    /**Main method that runs constructor, makes snake, and draws button.
     * @param args String
     */
    
    public static void main ( String[]args )
    {
        new Frame();
        Snake s = new Snake( 50, 50 );
        DrawButton d = new DrawButton( 50, 100, s );
    }
    
}