import wheelsunh.users.*;
import java.util.*;
import java.awt.Color;


/**
 * Haunted.java.
 * 
 * Reveals what pumpkins become on Halloween.
 * 
 * 
 * @author cs415
 */
public class Haunted implements Animator
{
    private Rectangle daylight;
    private AnimationTimer timer;
    private Ghoul g1;
    private Vector<Ghoul> ghouls = new Vector<Ghoul>();
    
    //---------------------------------------------------------------
    /**
     * Constructor.
     * 
     */
    public Haunted (   )
    {     
        // Creates a daylight window on the black background
        daylight = new Rectangle( 200, 200 );
        daylight.setSize( 300, 300 );
        daylight.setColor( new Color( 135, 206, 250 ) );
        ////////////////////////////////////////////////////
        
        // Add your code here
        timer = new AnimationTimer( 50, this );
        //timer.start();
        
        for( int i = 0; i < 20; i++ )
        {
            g1 = new Ghoul();
            ghouls.add( g1 );
            timer.start();
        }
        
        
        
        
    }
    
    public void animate()
    {
     
        
        for( Ghoul b:ghouls )
        {
            b.move();
        if( daylight.boundsIntersects(b))
            b.setHaunted(false);
        else
            b.setHaunted(true);
        
        }
   
    }
    
     //---------------------------------------------------------------
    /**
     * main.
     * 
     * @param a String[]
     */
    public static void main( String a[ ] )
    {
        // DO NOT EDIT. 
        // Creates a frame with a black background
        new Frame( 1000, 800 );
        Rectangle background = new Rectangle( 0, 0 );
        background.setSize( 1000, 800 );
        background.setColor( Color.black );
        new Haunted( );
    }
}
