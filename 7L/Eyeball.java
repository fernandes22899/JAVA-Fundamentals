
// ---------------       imports          ------------------------------
import wheelsunh.users.*;
import java.awt.Color;

// ----------------------   class Eyeball    ---------------------------
/** 
 * This class inplements a simple Eyeball.
 * 
 * @author CS415
 * 
 */
public class Eyeball
{
    //---------------- instance variables ------------------------------
    // variables are used to references the  objects
    // used to draw the eyeball.
    private Ellipse    iris;
    private Ellipse    sclera;
    private Color      irisColor;
    int x1 = 0, y1 = 0;
    
    // -----------------------------------------------------------------
    /** 
     * Default constructor for the Eyeball class.
     */
    public Eyeball()
    {
        sclera = new Ellipse( 0, 0 );
        sclera.setFillColor( Color.WHITE );
        sclera.setFrameColor( Color.BLACK );
        sclera.setSize( 50, 50);
        
        iris = new Ellipse( 10, 10 );
        iris.setColor( Color.BLUE );
        iris.setSize( 30, 30);
        
    } 
    

  
    // -----------------------------------------------------------------
    /**
     *   Change the location of the eyeball.
     * 
     * @param x int
     * @param y int
     */
    public void setLocation( int x, int y )
    {
        sclera.setLocation( x, y );
        iris.setLocation( x + 10, y + 10);
    }
    // -----------------------------------------------------------------
    /**
     *   Change the color of the iris of the eyeball.
     * 
     * @param iColor Color
     */
    public void setColor( Color iColor )
    {
       iris.setColor( iColor );
       irisColor = iColor;
       
    }
    // -----------------------------------------------------------------

    public void getMad( )
    {
        
        Utilities.sleep(1000);
        iris.setColor( Color.RED );
        Utilities.sleep(1000);
        iris.setColor( irisColor );
        
    }

    

} //End of Class Eyeball