import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.*;


/** 
 *  PumpingCircle.java:
 *  
 */
public class PumpingCircle extends Ellipse
{ 
   //----------------- instance variables --------------------------------------
   
   private int mySize = 100; 
   private boolean growing = false;
   private int inc = 10;
   
   //------------------ constructor ---------------------------------------------
   public PumpingCircle(  int x, int y ) 
   {      
      super( x, y );   
      setSize( mySize, mySize );  
   }
   

   
   //------------------------------------------------------------------------------
   //
   public void mouseClicked( MouseEvent me )
   {
           ////////////////////////////////////////////////////////////////////////
           // circle should grow by 10 pixels if it is in the growing  state
           // if not in the growing state then it should shrink by 10 pixels
           // initially it is in the shrinking state
           // then, if the size is 50 or less it should change to the growing state
           // then, if the size is 100 or greater it should change to the shrinking state
           ///////////////////////////////////////////////////////////////////////
       
       if( growing == false && mySize > 50 ){
           this.setSize( mySize -= inc, mySize );
       }
       else if( growing == false && mySize <= 50 ){
           growing = true;
       }
       else if( growing == true && mySize < 100 ){
           this.setSize( mySize += inc, mySize  );
       }
       else if( growing == true && mySize >= 100 ){
           growing = false;
       }
       
   }
  
   
   //---------------------------- main -----------------------------------------
   public static void main( String[] args )      
   {
      new Frame();
      PumpingCircle p = new PumpingCircle( 325, 225 );
      p.setSize( 100 , 100 );
   }
}