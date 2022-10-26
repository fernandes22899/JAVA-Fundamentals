import wheelsunh.users.*;
import java.awt.Color;

/** 
 * AvatarSoccer.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #5
 * 5P
 */
public class AvatarSoccer extends Avatar
{
    protected Ellipse sball;
    protected Rectangle r1, r2, r3, r4;
    
    /**Method that makes avatar with soccer ball.
     * @param x int
     * @param y int
     */ 
    public AvatarSoccer( int x, int y )
    {
        super( x, y );
        
        sball = new Ellipse( x + 20, y + 85 );
        sball.setSize( 30, 30 );
        sball.setFillColor( Color.WHITE );
        sball.setFrameColor( Color.BLACK );
        sball.hide();
        this.add( sball );
        r1 = new Rectangle( x + 24, y + 89 );
        r1.setSize( 10, 10 );
        r1.setColor( Color.BLACK );
        r1.setRotation( 45 );
        r1.hide();
        this.add( r1 );
        r2 = new Rectangle( x + 24, y + 102 );
        r2.setSize( 10, 10 );
        r2.setColor( Color.BLACK );
        r2.setRotation( 45 );
        r2.hide();
        this.add( r2 );
        r3 = new Rectangle( x + 36, y + 89 );
        r3.setSize( 10, 10 );
        r3.setColor( Color.BLACK );
        r3.setRotation( 45 );
        r3.hide();
        this.add( r3 );
        r4 = new Rectangle( x + 36, y + 102 );
        r4.setSize( 10, 10 );
        r4.setColor( Color.BLACK );
        r4.setRotation( 45 );
        r4.hide();
        this.add( r4 );
    }
    
    /**Method that activates certain instance variables.
     */ 
    public void activate()
    {
        super.activate();
        sball.show();
        r1.show();
        r2.show();
        r3.show();
        r4.show();
    }
    
    /**Method that deactivates certain instance variables.
     */ 
    public void deactivate()
    {
        super.deactivate();
        sball.hide();
        r1.hide();
        r2.hide();
        r3.hide();
        r4.hide();
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
    
    /**Main method tests constructor.
     * @param args String
     */
    public static void main( String[]args )
    {
        new Frame();
        AvatarSoccer as = new AvatarSoccer( 100, 100 );
        
    }
} //End of AvatarSoccer class