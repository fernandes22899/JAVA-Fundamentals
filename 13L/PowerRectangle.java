import wheelsunh.users.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Point;

/**
 * PowerRectangle.java. 
 *   This class extends Rectangle to add 
 *    - a peer object (a TextBox)
 *    - code to display the area, perimeter, and diagonal length of
 *      the rectangle in the TextBox. 
 *      Use the ShapeFunctions class methods to compute these values.
 *    - Use drag to change size of the rectangle.
 *    - Use mouse clicked to print size info to Interactions pane
 *   
 * @author rdb
 */
public class PowerRectangle extends Rectangle
{
   //--------------- instance variables --------------------
    private TextBox t;
    private Point lastMousePoint;
    private Point o;
    private Color oC;
 
   /**-------------------------------------------------------------------------
    * Constructor. requires the x,y location of the rectangle
    *     must pass this on to super constructor
    * It must create a TextBox with a text string.
    *     The string should show the Area, perimeter and Diagonal length
    *     This should be done in the "updateInfo" private method that
    *     should be called from here.
    */
   public PowerRectangle( int x, int y )
   {
       super( x, y );
        t = new TextBox( x, y - 50 );
        this.updateInfo(); 
   }

   //-------------------------------------------------------------------------
   /**
    * setSize( int, int ) -- defines the width and height of the rectangle. 
    *     We need to override the parent setSize, because we must also use
    *     the new information to update the text field of the associated 
    *     TextBox object, by calling "updateInfo()".
    * 
    *     But, you still must invoke the super class setSize to get the 
    *     size changed!
    **********************************************************************
    ********************** Warning: **************************************
    **********************************************************************
    * setSize is called by the Rectangle constructor BEFORE the
    * PowerRectangle constructor is called!  This means that the first 
    * call to setSize happens BEFORE you have created your TextBox and 
    * initialized the instance variable that references it. 
    * 
    * setSize, however, needs to call "updateInfo()" to change the text
    * in the TextBox, but there is no TextBox yet (only the first time).
    * 
    * Hence, in the setSize code below you must only call "updateInfo" 
    * if your instance variable that references the TextBox is NOT null.
    * 
    * See the class notes from slide set 8.
    **********************************************************************
    */
   public void setSize( int width, int height )
   {
       super.setSize( width, height );
       if( t != null )
           updateInfo();
       
   }

   //------------ utility methods --------------------------
   /**
    * updateInfo -- computes the current area and perimeter of the 
    * rectangle (using methods in the ShapeFunctions class) and updates
    * the text string in the TextBox.
    * 
    * Note that the ShapeFunctions methods compute the area and perimeter
    * as doubles; this class only needs to show the integer version of that,
    * so you need to coerce (or cast) the value returned from ShapeFunctions to
    * an int before assigning it to the local int variables.
    * 
    * Note: The String object you need to pass to the TextBox
    *       must be constructed from strings of text and numbers. We have
    *       yet covered this in class. If you have variables "area" and
    *       "perimeter" with the appropriate values, you can create a
    *       String to give to TextBox with the following line:
    * 
    *    String message = "A: " + area + ", C: " + perimeter;
    */
   private void updateInfo()
   {
       int area = ShapeFunctions.area( this );
       int perimeter = ShapeFunctions.perimeter( this );
       double diagonal = ShapeFunctions.diagonal( this );
       String message = "A : " + area + ", C: " + perimeter + ", D: " + diagonal;
       t.setText( message );
   }
   
   //-------------------------------------------------------------------------
   /**
    * changeSizeBy( int, int ) -- update size of Rectangle by an encremental
    *                       amount in x and y. 
    */
   private void changeSizeBy( int dX, int dY )
   {
        setSize( getWidth() + dX, getHeight() + dY );
   }
      
   //-------------------------------------------------------------------------
   /**
    * mousePressed - save the position of the mouse and the current color of the 
    * rectangle, and change the color of the rectangle to red.
    */
   public void mousePressed( MouseEvent me )
   {
        lastMousePoint = me.getPoint();
        o = me.getPoint();
        oC = getColor();
        this.setColor( Color.RED );
   }

   //-------------------------------------------------------------------------
   /**
    * mouseDragged -- change the rectangle size by the same delta that the 
    *                 mouse moved.
    * Use mouse position saved in mousePressed; update the saved mouse position
    * for next drag event.
    */
   public void mouseDragged( MouseEvent me )
   {
        Point currentPoint = me.getPoint();
        int dX = currentPoint.x - lastMousePoint.x;
        int dY = currentPoint.y - lastMousePoint.y;
        this.changeSizeBy( dX, dY );
        lastMousePoint = currentPoint;
   }

   //-------------------------------------------------------------------------
   /**
    * mouseReleased -- restore the original color.
    */
   public void mouseReleased( MouseEvent me )
   {
       setColor( oC );
       setColor( oC );
   }

   //-------------------------------------------------------------------------
   /**
    * mouseClicked - print the width/height to System.out
    */
   public void mouseClicked( MouseEvent me )
   {  
        System.out.println( getHeight() + ", " + getWidth() );
   }

   //------------------ main ----------------------------------
   // unit test code
   //
   public static void main( String args[] )
   {
      Frame f = new Frame();
      PowerRectangle pr1 = new PowerRectangle( 400, 400 );
      pr1.setColor( Color.BLUE );
      
      PowerRectangle pr2 = new PowerRectangle( 100, 100 );
      pr2.setColor( Color.RED );
      
      PowerRectangle pr3 = new PowerRectangle( 250, 250 );
      pr3.setColor( Color.RED );
      
      pr1.setSize( 20, 25 );
      pr2.setSize( 40, 40 );
      pr3.setSize( 50, 20 );
   }
}