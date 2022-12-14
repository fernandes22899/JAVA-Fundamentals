/**
 * HotBox -- a mouse sensitive Rectangle
 *        mouseClicked events should alternate the color of the rectangle
 *              between red and its original color
 *        mousePressed and mouseDragged should change the size of the 
 *              rectangle; width should be changed by the x-difference
 *              and height by the y-difference. Do not allow either width
 *              or height to be set to a value less than 4.
 */
import wheelsunh.users.*;
import java.awt.Point;
import java.awt.event.*;
import java.awt.Color;

public class HotBox extends Rectangle
{
   //----------------- instance variables ---------------------------
   ///////////  add instance variables as needed ////////////////////
    Color c;
    Point currentPoint;
    Point lastMousePosition;
   //------------------- constructor --------------------------------
   /**
    * set position and color
    */
   public HotBox( int x, int y,  Color col )
   {
      //////////////////////// add code here //////////////////////
       this.setSize( 40, 40 );
       this.setLocation( 0 + x, 0 + y );
       this.setColor( col );
       c = col;
   }

   //-------------------- mouseClicked -------------------------------
   /**
    * mouseClicked events should toggle the rectangle's color between
    * red and its original color.
    */
   public void mouseClicked( MouseEvent me )
   {
      //////////////////// add color swapping code here //////////////////
       if( this.getColor() != Color.RED )
           this.setColor( Color.RED );
       else if( this.getColor() == Color.RED )
           this.setColor( c );   
   }
   
   //-------------------- mousePressed -------------------------------
   /**
    * mousePressed and mouseDragged events should change size of rectangle
    */
   public void mousePressed( MouseEvent me )
   {
      ///////////////// add code here /////////////////////////////////
       lastMousePosition = me.getPoint();
   }
   
   //-------------------- mouseDragged -------------------------------
   /**
    * mousePressed and mouseDragged events should change size of rectangle
    * difference in x should change width
    * difference in y should change height
    */
   public void mouseDragged( MouseEvent me )
   {
      ///////////////// add code here /////////////////////////////////
       currentPoint = me.getPoint();
       int diffX = currentPoint.x - lastMousePosition.x;
       int diffY = currentPoint.y - lastMousePosition.y;
       int width = getWidth() + diffX;
       int height = getHeight() + diffY;
       if(height < 4 )
           height =4;
       if(width < 4 )
           width =4;
       setSize(width,height);
       lastMousePosition = currentPoint;
   }

   //-------------------------- main - unit test code -----------------------
   public static void main( String[] args )
   {
      Frame f = new Frame();
      HotBox h1 = new HotBox( 100, 100, Color.GREEN );
      
      HotBox h2 = new HotBox( 200, 200, Color.BLUE );
      
      HotBox h3 = new HotBox( 400, 50, Color.BLACK );
   }
}