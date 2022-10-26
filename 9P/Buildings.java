import wheelsunh.users.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Point;

/**Makes buildings and windows that are called by AsteroidApp.
  * 
  * CS415
  * @author Jeffrey Fernandes
  * Project #9
  * 9P
  */
public class Buildings extends ShapeGroup
{
    private Random r;
    private Rectangle b, w1, w2, w3, w4, w5, w7, w8, w9;
    
    /**Buildings constructor calls methods and makes building.
     * @param width int
     * @param height int
     * @param x int
     */
    public Buildings( int width, int height, int x )
    {
        b = new Rectangle();
        
        b.setSize( width, height );
        
        b.setLocation( x, 400 - height );
        
        b.setFillColor( Color.BLACK );
        b.setFrameColor( Color.YELLOW );
        
        add( b );
        windows( x, height );
        
        
    }
    
    /**Windows method makes windows in random places.
     * @param x int
     * @param height int
     */
    public void windows( int x, int height )
    {
        r = new Random();
        int wid = r.nextInt( 4 ) + 2;
        int hei = r.nextInt( 5 ) + 3;
        
        if( b.getHeight() > 25 )
        {
            w1 = new Rectangle();
            w2 = new Rectangle();
            
            w1.setSize( wid, hei );
            w2.setSize( wid, hei );
            
            w1.setLocation( x + 5, 412 - height );
            w2.setLocation( x + 18, 412 - height );
            
            w1.setColor( Color.YELLOW );
            w2.setColor( Color.YELLOW );
            
            add( w1 );
            add( w2 );
            
            if( b.getHeight() > 50 && b.getWidth() > 58 )
            {
                System.out.println( this + "Made 4 windows" );
                w3 = new Rectangle();
                w4 = new Rectangle();
                
                w3.setSize( wid, hei );
                w4.setSize( wid, hei );
                
                w3.setLocation( x + 5, 430 - height );
                w4.setLocation( x + 18, 430 - height );
                
                w3.setColor( Color.YELLOW );
                w4.setColor( Color.YELLOW );
                
                //add( w3 );
                //add( w4 );
                
                if( b.getHeight() > 68 && b.getWidth() > 58 )
                {
                    System.out.println( this + "Made 6 windows" );
                    w8 = new Rectangle();
                    w9 = new Rectangle();
                    
                    w8.setSize( wid, hei );
                    w9.setSize( wid, hei );
                    
                    w8.setLocation( x + 5, 448 - height );
                    w9.setLocation( x + 38, 448 - height );
                    
                    w8.setColor( Color.YELLOW );
                    w9.setColor( Color.YELLOW );
                    
                    add( w8 );
                    add( w9 );
                }
            }
        }
        
        if( b.getWidth() > 38 )
        {
            w5 = new Rectangle();
            w5.setSize( wid, hei );
            w5.setLocation( x + 31, 412 - height );
            w5.setColor( Color.YELLOW );
            //add( w5 );
            
            if( b.getWidth() > 53 )
            {
                w7 = new Rectangle();
                w7.setSize( wid, hei );
                w7.setLocation( x + 44, 412 - height );
                w7.setColor( Color.YELLOW );
                //add( w7 );
            }
        }
    }
    
    /**Hide method calls building and windows. 
      * Makes them dissapeared when called
     */
    public void hide()
    {
        b.hide();
        w1.hide();
        w2.hide();
        if( w3 != null )
            w3.hide();
        
        if( w4 != null )
            w4.hide();
        
        if( w5 != null )
            w5.hide();
        
        if( w7 != null )
            w7.hide();
        
        if( w8 != null )
            w8.hide();
        
        if( w9 != null )
            w9.hide();
        
    }
    
    /**Main method tests the building class.
     * @param args String
     */
    public static void main( String[]args )
    {
        new Frame( 700, 400 );
        //new Buildings();
    }
    
}