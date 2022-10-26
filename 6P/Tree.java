import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;

/** 
 * Tree.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #6
 * 6P
 */

public class Tree extends ShapeGroup implements Seasonal
{
    private Rectangle trunk, b1, b2, b3;
    private Ellipse l1, l2, l3;
    private Color treeColor = new Color( 114, 49, 3 );
    private Color springTree = new Color( 27, 130, 44 );
    private Point lastMousePosition;
    private int x1, y1, x2, y2;
    
    /**Contructor for tree.
     * @param x int
     * @param y int
     */
    
    public Tree( int x, int y )
    {
        tree( x, y );
        winter();
    }
    
    /**Mathod for summer from seasonal.
     */
    
    public void summer()
    {
        l1.show();
        l2.show();
        l3.show();
        l1.setColor( springTree );
        l2.setColor( springTree );
        l3.setColor( springTree );
    }
    
    /**Mathod for winter from seasonal.
     */
    
    public void winter()
    {
        
        l1.hide();
        l2.hide();
        l3.hide();
    }
    
    /**Mathod for fall from seasonal.
     */
    
    public void fall()
    {
        l1.show();
        l2.show();
        l3.show();
        l1.setColor( Color.RED );
        l2.setColor( Color.RED );
        l3.setColor( Color.RED );
    }
    
    /**Mathod for spring from seasonal.
     */
    
    public void spring()
    {
        l1.show();
        l2.show();
        l3.show();
        l1.setColor( Color.GREEN );
        l2.setColor( Color.GREEN );
        l3.setColor( Color.GREEN );
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
    
    /**Method that makes avatar draggable.
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
    
    /**Method that makes tree.
     * @param x int
     * @param y int
     */
    
    public void tree( int x, int y )
    {
        trunk = new Rectangle( x + 70, y + 90 );
        trunk.setColor( treeColor );
        trunk.setSize( 35, 95 );
        add( trunk );
        
        b1 = new Rectangle( x + 40, y + 20 );
        b1.setColor( treeColor );
        b1.setSize( 15, 90 );
        b1.setRotation( -45 );
        add( b1 );
        
        b2 = new Rectangle( x + 100, y + 30 );
        b2.setColor( treeColor );
        b2.setSize( 11, 75 );
        b2.setRotation( 20 );
        add( b2 );
        
        b3 = new Rectangle( x + 50, y + 30 );
        b3.setColor( treeColor );
        b3.setSize( 8, 40 );
        b3.setRotation( 45 );
        add( b3 );
        
        l1 = new Ellipse( x + 5, y + 10 );
        l1.setColor( Color.RED );
        l1.setSize( 100, 60 );
        add( l1 );
        
        l2 = new Ellipse( x + 30, y + 55 );
        l2.setColor( Color.RED );
        l2.setSize( 80, 40 );
        add( l2 );
        
        l3 = new Ellipse( x + 50, y + 25 );
        l3.setColor( Color.RED );
        l3.setSize( 100, 60 );
        add( l3 );
    }
    
    /**Start the program.
     * @param args String[]
     */
    
    public static void main( String[]args )
    {
        new Frame();
        Tree t = new Tree( 100, 300 );
    }
}