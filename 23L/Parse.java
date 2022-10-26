/**
 * Parse.java
 * 
 * Implement a Scanner to parse a simple command language
 * 
 */

import java.util.*;
import javax.swing.*;
import java.awt.Color;
import wheelsunh.users.*;

public class Parse
{
   //---------------- instance variables -------------------------
   private int xLoc   = 200;
   private int yLoc   = 200;
   private int height = 50;
   private int width  = 50;
   
   public Parse()
   {
      Rectangle shape   = new Rectangle( Color.BLUE );
      String    prompt  = "Enter command: 'loc int int' or 'size int int'";
      
      String    command = JOptionPane.showInputDialog( null, prompt );     
      while ( command != null )
      {
            ///////////////////////////////////////////////////
            // Create a Scanner to parse the "command" variable. 
            // It should recognize the following 2 commands:
            //
            // loc int int   -- set the location of "shape" to specified x,y   
            // size int int  -- set the size of "shape" to specified w,h
            //
            // Any other command should result in an error message which
            // should pop up in a JOptionPane.showMessageDialog, such as 
   // JOptionPane.showMessageDialog( null, "Invalid args: " + command );
            // 
            // 
            //-------------------------------------------------- 
            //------------   put your code here
         Scanner scan = new Scanner( command );
         String input = scan.next();
         
         if( input.equals("loc") )
         {
             
             int x = scan.nextInt();
             int y = scan.nextInt();
             shape.setLocation( x, y );
         }
         else if( input.equals("size") )
         {
             
             int width = scan.nextInt();
             int height = scan.nextInt();
             shape.setSize( width, height );
         }
         else 
         {
             JOptionPane.showMessageDialog( null, "Invalid args: " + command );
         }
         
         command = JOptionPane.showInputDialog( null, prompt );
      }
   }
   
   //--------------- main ---------------------------------------
   public static void main( String[] args )
   {
      Frame f = new Frame();
      Parse q = new Parse();
   }
}