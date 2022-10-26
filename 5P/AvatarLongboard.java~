import wheelsunh.users.*;
import java.awt.Color;

/** 
 * AvatarBasketball.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #5
 * 5P
 */
public class AvatarLongboard extends Avatar
{
    
    protected Ellipse w1, w2, w3, w4;
    protected RoundedRectangle rr1, rr2, b;
    
    /**Constructor calls methods.
     * @param x int
     * @param y int
     */
    public AvatarLongboard( int x, int y )
    {
        super( x, y );
        
        b = new RoundedRectangle();
        b.setLocation( x + 52, y + 70 );
        b.setColor( Color.BLACK );
        b.setSize( 2, 80 );
        b.setRotation( 90 );
        b.hide();
        this.add( b );
        w1 = new Ellipse();
        w1.setLocation( x + 20, y + 110 );
        w1.setSize( 10, 10 );
        w1.setColor( Color.RED );
        w1.hide();
        this.add( w1 );
        w2 = new Ellipse();
        w2.setLocation( x + 74, y + 110 );
        w2.setSize( 10, 10 );
        w2.setColor( Color.RED );
        w2.hide();
        this.add( w2 );
       
    }
    
    /**Method that activates certain instance variables.
     */ 
    public void activate()
    {
        super.activate();
        b.show();
        w1.show();
        w2.show();
    }
    
    /**Method that deactivates certain instance variables.
     */ 
    public void deactivate()
    {
        super.deactivate();
        b.hide();
        w1.hide();
        w2.hide();
    }
    
    /**Method when mouse is pressed.
     * @param e java.awt.event.MouseEvent
     */
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        super.mousePressed( e );
    }
    
    /**Method when mouse is released.
     * @param e java.awt.event.MouseEvent
     */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        super.mouseReleased( e );
    }
    
    /**Main method that tests constructor.
     * @param args String
     */ 
    public static void main( String[] args )
    {
        new Frame();
        AvatarLongboard ab = new AvatarLongboard( 100, 100 );
    }
}