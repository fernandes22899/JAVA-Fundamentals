import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;

/** 
 * Sun.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #6
 * 6P
 */

public class Sun extends ShapeGroup implements Seasonal
{
    private Ellipse s, c1 , c2 , c3;
    private Rectangle l1, l2;
    private Color winter = new Color( 156, 159, 163, 80 );
    private Color fall = new Color( 156, 159, 163, 40 );
    private Point lastMousePosition;
    private int x1, y1, x2, y2;
    
    /**Sun constructor.
     * @param x int
     * @param y int
     */
    
    public Sun( int x, int y )
    {
        sun( x, y );
        winter();
    }
    
    /**Mathod for winter from seasonal.
     */
    
    public void winter()
    {
        l1.hide();
        l2.hide();
        c1.setSize( 80, 50 );
        c2.setSize( 60, 40 );
        c3.setSize( 50, 30 );
    }
    
    /**Mathod for spring from seasonal.
     */
    
    public void spring()
    {
        
        c1.hide();
        c2.hide();
        c3.hide();
        l1.hide();
        l2.hide();
    }
    
    /**Mathod for summer from seasonal.
     */
    
    public void summer()
    {
        
        c1.hide();
        c2.hide();
        c3.hide();
        l1.show();
        l2.show();
    }
    
    /**Mathod for fall from seasonal.
     */
    
    public void fall()
    {
        c1.show();
        c2.show();
        c3.show();
        c1.setColor( fall );
        c2.setColor( fall );
        c3.setColor( fall );
        c1.setSize( 50, 20 );
        c2.setSize( 30, 10 );
        c3.setSize( 20, 5 );
        l1.hide();
        l2.hide();
    }
    
    /**Method that finds first point.
     * @param e java.awt.event.MouseEvent
     */
    
    public void mousePressed ( java.awt.event.MouseEvent e )
    {
        lastMousePosition = e.getPoint();
        x1 = getXLocation();
        y1 = getYLocation();
    }
    
    /**Method that finds last point.
     * @param e java.awt.event.MouseEvent
     */
    
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        x2 = getXLocation();
        y2 = getYLocation();
    }
    
    /**Method that allows it to move.
     * @param e java.awt.event.MouseEvent
     */
    
    public void mouseDragged( java.awt.event.MouseEvent e )
    {
        Point currentPoint = e.getPoint();
        int diffX = currentPoint.x - lastMousePosition.x;
        int diffY = currentPoint.y - lastMousePosition.y;
        setLocation( getLocation().x + diffX, getLocation().y + diffY );
        lastMousePosition = currentPoint;
    }
    
    /**Method that makes sun.
     * @param x int
     * @param y int
     */
    
    public void sun( int x, int y )
    {
        s = new Ellipse( x + 15, y + 15 );
        s.setColor( Color.YELLOW );
        s.setSize( 60, 60 );
        add( s );
        
        c1 = new Ellipse( x + 15, y + 30 );
        c1.setColor( winter );
        c1.setSize( 80, 50 );
        add( c1 );
        
        c2 = new Ellipse( x + 10, y + 25 );
        c2.setColor( winter );
        c2.setSize( 60, 40 );
        add( c2 );
        
        c3 = new Ellipse( x + 25, y + 15 );
        c3.setColor( winter );
        c3.setSize( 50, 30 );
        add( c3 );
        
        l1 = new Rectangle( x + 45, y + 15 );
        l1.setColor( Color.YELLOW );
        l1.setSize( 3, 70 );
        l1.setRotation( 90 );
        add( l1 );
        
        l2 = new Rectangle( x + 40, y + 10 );
        l2.setColor( Color.YELLOW );
        l2.setSize( 3, 70 );
        add( l2 );
        
    }
    
    /**Start the program.
     * @param args String[]
     */
    
    public static void main( String[]args )
    {
        new Frame();
        Sun s = new Sun( 300, 10 );
    }
}