/** 
 * Target.java
 *    Initial implementation where grouping is done "by hand".
 *    Used in 09-Interface notes
 * 
 * rdb - September 2009 
 *    derived from earlier targets
 */

import java.awt.Color;
import wheelsunh.users.*;

public class Target extends ShapeGroup implements Faller
{
   //---------------- instance variables --------------------------------
   private Ellipse level0, level1, level2;  // 3 circles comprise the target
   private int fall = 50;
   private TextBox text;
   
   //---------------- magic constants -----------------------------------
   private int size0 = 80;  // outer circle constants
   
   private int dx1   = 10;  // next inner circle constands
   private int dy1   = 10;
   private int size1 = 60;
   
   private int dx2   = 20;  // innermost circle constants
   private int dy2   = 20;
   private int size2 = 40;
   
   //----------------- constructor ------------------------------
   public Target( int x, int y )
   {
      level0 = new Ellipse( x, y );
      level0.setSize( size0, size0 );
      level0.setColor( Color.BLACK );
      
      level1 = new Ellipse( x + dx1, y + dy1 );
      level1.setSize( size1, size1 );
      level1.setColor( Color.RED );
      
      level2 = new Ellipse( x + dx2, y + dy2 );
      level2.setSize( size2, size2 );
      level2.setColor( Color.GREEN );
            
      this.setLocation( x, y );
      add( level0 );
      add( level1 );
      add( level2 );
      
      text = new TextBox( x +50, y+50 );
   }
   //------------------- setLocation( int, int ) ------------------------
   /**
    * set the target's location by setting each of the component circles.
    *
   public void setLocation( int x, int y )
   {
      level0.setLocation( x, y );
      level1.setLocation( x + dx1, y + dy1 );
      level2.setLocation( x + dx2, y + dy2 );
   }
   /********************************************************************/
   
   public void setFallIncrement( int y )
   {
       fall = y;
       
   }
   
   public void mouseClicked( java.awt.event.MouseEvent e )
   {
       int x = getXLocation();
       int y = getYLocation();
       
       setLocation( x, y + fall );
       text.setText( "Loc: " + x + ", " + y );
       
   }
   
   //----------------- main --------------------------------------------
   /**
    * Unit test code for Target
    */
   public static void main( String[] args )
   {
      new Frame();
      Target t1 = new Target( 50, 50 );
      Target t2 = new Target( 350, 50 );
      
      //t1.setLocation( 50, 50 );
      //t2.setLocation( 150, 50 );
      
      t1.setFallIncrement( 20 );
      t2.setFallIncrement( 40 );
   }
}
