/**
 * NumScanner.java 
 * 
 * Implement a Scanner to parse integers into one of two Vectors
 * 
 */

import java.util.*;


public class NumScanner
{
   //---------------- instance variables -------------------------
   private static Vector<Integer> vectA = new Vector<Integer>();
   private static Vector<Integer> vectB = new Vector<Integer>();
   
   public NumScanner()
   {
      // DO NOT EDIT THE CONSTRUCTOR
      
      // creates a Scanner from the keyboard
      // and read the first line
      Scanner keyboard = new Scanner( System.in );
      String line = keyboard.nextLine();
      System.out.println( "\nInput Line: " + line ); 
      
      // loops until user enters an empty line
      while ( line.length() > 0 )
      {
         // handle the current line
         handleLine( line );
         
         // reads the next line
         line = keyboard.nextLine();
         System.out.println( "Input Line: " + line ); 
      }
      
      // prints out the Vectors
      System.out.println("\nAll done");
      System.out.println("Vector A: " + vectA );
      System.out.println("Vector B: " + vectB );
   }
   
   /************************************************************
     *
     *  handleLine
     */
   private void handleLine( String line )
   {
      ///////////////////////////////////////////////////
      // Create a Scanner to parse the "line" variable. 
      // It should read the first token into a variable "name"
      //
      // If the "name starts with "a" (case insentitve) then 
      //  use vectA
      //
      // If the "name starts with "b" (case insentitve) then 
      // use vectB
      //
      // Then, while the line contains a next integer, add the next
      // integer to the appropriate Vector.
      // 
      
      //-------------------------------------------------- 
      //------------   put your code here
      
       Scanner s = new Scanner( System.in );
       line = s.next();
       
       if( s.equals( "a" ) )
       {
           while( s.hasNextInt() )
               vectA.add( s.nextInt() );
       }
       else if( s.equals( "b" ) )
       {
           while( s.hasNextInt() )
               vectB.add( s.nextInt() );
       }
       else
           System.out.println( "error" );
       
   }
   
   
   
   //--------------- main ---------------------------------------
   public static void main( String[] args )
   {
      NumScanner q = new NumScanner();
   }
}