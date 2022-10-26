import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.*;


/** 
 *  MorphingShape.java:
 *  
 */
public class MorphingShape extends ShapeGroup
{ 
   //----------------- instance variables --------------------------------------

   private Rectangle r;
   private RoundedRectangle rr;
   private Ellipse e;
   private int track;
   
   //------------------ constructors ---------------------------------------------
   public MorphingShape(int x, int y ) 
   {        
        r = new Rectangle( x, y );
        add( r );
        r.setColor( Color.GREEN );
        
        rr = new RoundedRectangle( x, y );
        add( rr );
        rr.setColor( Color.RED );
        
        e = new Ellipse( x, y );
        add( e );
        e.setColor( Color.BLUE );
        
         //////////////////////////////////////////
        //   hide all but one shape and remember
        //   which one is showing
        ///////////////////////////////////////////
        
         rr.hide();
         e.hide();
        track = 0;
   }
    

   //-----------------------------------------------------------------------------
   public void mouseClicked( MouseEvent me )
   {
         ///////////////////////////////////////////
         // change rectangle  to rounded rectangle  
         // or rounded rectangle  to ellipse 
         // or ellipse to rectangle 
         ///////////////////////////////////////////
       
       if( track == 0 ){
             r.hide();
             rr.show();
             track = 1;
       }
       else if( track == 1 ){
           rr.hide();
           e.show();
           track = 2;
       }
       else if( track == 2 ){
           e.hide();
           r.show();
           track = 0;
       }
         
   }
     
   
   //---------------------------- main -----------------------------------------
   public static void main( String[ ] args )      
   {
      new Frame( );
      new MorphingShape( 325, 225 );
   }
}