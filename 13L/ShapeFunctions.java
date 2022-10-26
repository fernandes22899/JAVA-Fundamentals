/**
 * ShapeFunctions.java
 * 
 * This class includes a number of utility functions that can be 
 * applied to wheels.RectangularShape objects.
 * 
 * The current version should support 
 *       double area( Rectangle );
 *       double perimeter( Rectangle );
 *       double diagonal(Rectangle);
 * All these functions are declared "static", which means they
 * are invoked by using the class name, not an instance.
 * 
 * @author rdb
 * 
 */
import wheelsunh.users.*;

public class ShapeFunctions
{  
    
   //-------------------------- area( Rectangle ) -----------------------
   /**
    * Compute the area of a wheels Rectangle. 
    * The area of a rectangle is the product of the width and height.
    */ 
   public static int area( Rectangle r )
   {
      return r.getWidth() * r.getHeight();
   }

   //-----------------------  perimeter( Rectangle ) -----------------------
   /**
    * Rectangle perimeter
    * The perimeter of a rectangle is twice the sum of the width and height
    */
   public static int perimeter( Rectangle r )
   {
      return 2 * ( r.getHeight() * r.getWidth());
   }

  //--------------------------  diagonal( Rectangle ) -----------------------
   /**
    * Rectangle diagonal length
    * The diagonal of a rectangle is the square root of the sum of the 
    * squares of the height and width   use Math.sqrt( double ) to get the
    * square root
    */
   public static double diagonal( Rectangle r )
   {
      return Math.sqrt( r.getHeight() * r.getWidth() + r.getWidth() * r.getWidth() );
   }

   //------------------------------ main -------------------------------------
   // unit test code
   //
   public static void main( String args[] )
   {
      Frame f = new Frame();
      
      Rectangle r = new Rectangle( 100, 100 );
      r.setSize( 20, 30 );
      
      int rArea = ShapeFunctions.area( r );
      System.out.println( "Rectangle area: " + rArea );
      
      int rCirc = ShapeFunctions.perimeter( r );
      System.out.println( "Rectangle perimeter: " + rCirc );
      
      double rDiag = ShapeFunctions.diagonal( r );
      System.out.println( "Rectangle diagonal: " + rDiag  );
      
    }
}