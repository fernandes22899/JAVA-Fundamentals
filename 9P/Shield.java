import wheelsunh.users.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Point;

/**Makes shield that is called by AsteroidApp.
  * 
  * CS415
  * @author Jeffrey Fernandes
  * Project #9
  * 9P
  */
public class Shield extends ShapeGroup
{
    private Ellipse shield;
    private Point lastMousePosition;
    private int x1, y1;
    
    /**Constructor makes a shield.
     * @param x int
     * @param y int
     */
    public Shield( int x, int y )
    {
        makeShield( x, y );
        
    }
    
    /**Method makes a shield and adds to ShapeGroup.
     * @param x int
     * @param y int
     */
    public void makeShield( int x, int y )
    {
        shield = new Ellipse( x + 340, y + 300 );
        shield.setSize( 40, 15 );
        shield.setColor( Color.YELLOW );
        add( shield );
        
    }
    
    /**MousePressed picks up location of shield.
     * @param e MouseEvent
     */
    public void mousePressed ( MouseEvent e )
    {
        lastMousePosition = e.getPoint();
        x1 = getXLocation();
        y1 = getYLocation();
    }
    
    /**MouseDragged allows user to drag shield and block asteroids.
     * @param e MouseEvent
     */
    public void mouseDragged( MouseEvent e )
    {
        Point currentPoint = e.getPoint();
        int diffX = currentPoint.x - lastMousePosition.x;
        int diffY = currentPoint.y - lastMousePosition.y;
        
        setLocation( getLocation().x + diffX, 300 );
        if( getLocation().x + diffX >= 660 )
            setLocation( 660, 300 );
        else if( getLocation().x + diffX <= 0 )
            setLocation( 0, 300 );
        
        lastMousePosition = currentPoint;
    }
    
    /**Main method tests the building class.
     * @param args String
     */
    public static void main( String[]args )
    {
        new Frame( 700, 400 );
        Shield s = new Shield( 0, 0 );
    }
    
}