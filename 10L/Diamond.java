
import java.awt.Color;
import wheelsunh.users.*;

public class Diamond extends ShapeGroup implements Faller
{
   //---------------- instance variables --------------------------------
   private Rectangle r1, r2;  // 3 circles comprise the target
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
   public Diamond( int x, int y )
   {
      r1 = new Rectangle( 50, 200 );
      
      r2 = new Rectangle( 150, 200 );
          
      this.setLocation( x, y );
      add( r1 );
      add( r2 );
      
      
      text = new TextBox( 300, 50 );
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
       
   }
   
   //----------------- main --------------------------------------------
   /**
    * Unit test code for Target
    */
   public static void main( String[] args )
   {
      new Frame();
      Rectangle r1 = new Rectangle( 100, 100 );
      Rectangle r2 = new Rectangle( 200, 100 );
      
      //r1.setLocation( 250, 250 );
      //r2.setLocation( 350, 250 );
      
      r1.setRotation(45);
      r2.setRotation(45);
      
      //r1.setFallIncrement( 20 );
      //r2.setFallIncrement( 40 );
   }
}
