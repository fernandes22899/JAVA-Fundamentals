
// --------------- imports ------------------------------
import wheelsunh.users.*;
import java.awt.Color;


// ----------------------   class Eyeball    ---------------------------
/** 
 * This class inplements a program that uses an Eyeball.
 * 
 * @author CS415
 * 
 */
public class Lab7 
{
    //---------------- instance variables ------------------------------
    
    // -----------------------------------------------------------------
    /** 
     * Constructor for the Lab7 class.
     */
    public Lab7( )
    { 
        
        Eyeball e1 = new Eyeball();
        e1.setLocation( 100, 100 );
        
        Eyeball e2 = new Eyeball();
        e2.setLocation( 50, 50 );
        e2.setColor( Color.BLACK );
        
        Eyeball e3 = new Eyeball();
        e3.setLocation( 210, 210 );
        e3.setColor( Color.GREEN );
        e3.getMad();
    } 
    
    
     // ----------------------------------------------------------------
    /** 
     * 
     * main program just invokes the class constructor.
     * 
     * @param args String
     * 
     */
    public static void main( String[] args )
    {
        Frame f = new Frame();
        Lab7 l = new Lab7();
        
    }

} //End of Class Lab7
