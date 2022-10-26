import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.*;


/** 
 *  OverlappingRectangle.java:
 *  
 */


public class OverlappingRectangle extends Rectangle
{ 
   //----------------- instance variables --------------------------------------
   private int myX, myY;  
   private Rectangle peer;  // peer Rectangle
   private Point lastMouse; 
   
   //------------------ constructors ---------------------------------------------
   public OverlappingRectangle(Rectangle r, int x, int y ) 
   {      
      super( x, y );
      peer = r;      
      myX = x;
      myY = y;
   }
   
   
   
   //----------------------------------------------------------
   public void mousePressed( MouseEvent me )
   {
      lastMouse = me.getPoint();
      
   }
   
   //----------------------------------------------------------
   public void mouseDragged( MouseEvent me )
   {
      Point curMouse = me.getPoint();
      myX = myX + curMouse.x - lastMouse.x;
      myY = myY + curMouse.y - lastMouse.y;
      
      setLocation( myX, myY );   
      lastMouse = curMouse;  
      
      if( getXLocation() + getWidth() > peer.getXLocation() && 
         getXLocation() < peer.getXLocation() + peer.getWidth() )
      {
          if( getYLocation() + getHeight() > peer.getYLocation() && 
             getYLocation() < peer.getYLocation() + peer.getHeight() )
          this.setColor( Color.BLUE );
          else
              this.setColor( Color.RED );
      }
      else
          this.setColor( Color.RED );
      
   }
   
   
   //---------------------------- main -----------------------------------------
   public static void main( String[ ] args )      
   {
      new Frame( );
      Rectangle r = new Rectangle( 200, 200 );
      r.setColor( Color.ORANGE );
      new OverlappingRectangle( r,  400, 30 );
   }
}