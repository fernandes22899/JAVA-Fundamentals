import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.*;

/** 
 * Crosshair.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #7
 * 7P
 */

public class Crosshair extends ShapeGroup
{
    protected Ellipse c;
    private Line l1, l2;
    private Color color = new Color( 0, 0, 0, 0 );
    
    // ----------------------------------------------------------
    /** Constructor for the Crosshair class.
     */
    public Crosshair()
    {
        
    }
    
    /**Method that makes Crosshair.
     * @param x int
     * @param y int
     */
    public void makeCross( int x, int y )
    {
        c = new Ellipse( x + 5, y + 5 );
        c.setFillColor( color );
        c.setFrameColor( Color.BLACK );
        c.setFrameThickness( 5 );
        c.setSize( 20, 20 );
        add( c );
        
        l1 = new Line( x + 15, y + 0, x + 15, y + 30 );
        l1.setColor( Color.BLACK );
        l1.setThickness( 2 );
        add( l1 );
        
        l2 = new Line( x + 0, y + 15, x + 30, y + 15 );
        l2.setColor( Color.BLACK );
        l2.setThickness( 2 );
        add( l2 );
        
    }
    
    /**Accessor that returns center of Crosshair.
      * @return center
     */
    public Point getPoint()
    {
        Point center = c.getCenter();
        return center;
    }
    
    /** main program creates a frame and invokes the class constructor.
      * @param args String
     */
    public static void main( String[]args )
    {
        new Frame();
        Crosshair c = new Crosshair();
        
    }    
}