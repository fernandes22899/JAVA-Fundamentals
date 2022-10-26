/**
 * Array.java -
 * 
 * The main program generates arrays of double values, prints out each
 * array and then calls minValueIndex to find  the minimum
 * value in the array.
 * 
 */

import java.util.*;
import javax.swing.*;

public class Array
{
   //////////////////////////////////////////////////////////////
   //  Write the method below, minValue.
   //    It should search the passed in double array and return
   //   the  the minimum value in the array.
   //  It is legal to pass in an array of length 0. In that case
   //   the constant Double.MAX_VALUE   should be returned.
   //
   public static double minValue( double[] values )
   {
      
      if( values.length == 0)
          return Double.MAX_VALUE;
      else
      {
          double minValue = values[0];
          
          for( int i = 0; i < values.length; i++ )
          {
              if( values[i] < minValue )
                  minValue = values[i];
          }
          
          return minValue;
      }
   }
   
   
   
   
   
   // Test: output to System.out
   //**************** DO NOT EDIT any code below this line **************
   //--------------- main ---------------------------------------
   public static void main( String[] args )
   {
      int     numTests = 6;        // number of tests to run
      int     numNum;              // number of numbers in array
      double[] nums;                // array of double values
      
      
      Random rng = new Random( 200 );
      
      for ( int test = 0; test < numTests; test++ )
      {
         numNum = rng.nextInt( 8 );        
         nums = new double[ numNum ];
         
         System.out.println("------------ Test " + test + "----------------");
         for ( int j = 0; j < numNum; j++ )
         {
            nums[ j ] = rng.nextFloat() * 100;
            System.out.format( " %.2f |", nums[ j ] );
         }
         if( numNum == 0 )
            System.out.println("<empty array>");
         else
            System.out.println();
         
         double fMin = minValue( nums );
         
         
         System.out.print( "Found minimum value: ");
         System.out.format( " %.2f |", fMin  );
         System.out.println();
      }
   }
}