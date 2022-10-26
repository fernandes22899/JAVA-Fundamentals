/**
* Array2D: transpose and swapRows.
*/
 
// Vector<Rectangle> r = new Vector<Rectangle>();
// this.add( shape );
//int [][] ex = new int[4][5];
public class Array2D
{
   //------------------- transpose --------------------------------------------
   /**
    * Given an n x m 2D array, return the transpose of that array, which
    * is an m x n array whose rows are the columns of the input array and
    * columns are the rows of the input array.
    *
    * each entry [i][j] of the input array is assigned to entry [j][i] of
    * the returned array.
    *
    * If the input array is empty return null.
    */
   public static float[][] transpose( float[][] data )
   {
      ///////////////// add code here ////////////////////////////////
      if ( data.length > 0 )
      {
          float[][] trans = new float[data[0].length][data.length];  // be sure to create this array
      for ( int r = 0; r < data.length; r++ )
        for ( int c = 0; c < data[0].length; c++ )
          trans[c][r] = data[r][c];
     
      
      return trans;
      }
      else
        return data;
   }
   //--------------- swapRows -------------------------
   /**
    * swap two rows in the array; you may assume that all rows have the
    *   same number of rows.
    */
   public static void swapRows( float[][] vals, int r1, int r2 )
   {
      ///////////////// add code here ////////////////////////////////////
      // check that r1 and r2 are valid row indexes for this array
      // if not, just return.
      //
      // iterate over the columns
      //    for each column, swap the entry in row r1 with the entry in row r2
      /////////////////////////////////////////////////////////////////////
    
     if ( vals == null || r1 <= 0 || r2 <=0 || r1 > vals.length || r2 > vals.length )
         return;
     else
     {
         for ( int c = 0; c < vals[0].length; c++ )
         {
          float temp;
          temp = vals[r1][c];  
          vals[r1][c] = vals[r2][c];
          vals[r2][c] = temp;
         }
     }
     
      
      
   } 
 
   //++++++++++++++++++++ DO NOT CHANGE ANY CODE BELOW HERE ++++++++++++++
   //--------------------- toString( float[] ) ---------------------------
   /**
    * generate a string (with no line feeds) from an array floats.
    */
   public static String toString( float[] values )
   {
      if ( values == null )
         return "";
     
      String str = new String( "[" );
      String prefix = " ";  // first value isn't preceded by ,
      for ( int i = 0; i < values.length; i++ )
      {
         str += prefix + values[ i ];
         prefix = ", ";     // all subsequent values need , before them
      }
      str += " ]";
      return str;
   }
   //--------------------- toString( float[][] ) ---------------------------
   /**
    * generate a string (with line feeds after each row) from a 2D float array
    */
   public static String toString( float[][] values )
   {
      if ( values == null )
         return "";
     
      String str = new String( "" );
      String prefix = "";
      for ( int r = 0; r < values.length; r++ )
      {
         prefix = r + ":[ ";  // first on row needs row # and [
         for ( int c = 0; c < values[ r ].length; c++ )
         {
            str += prefix + values[ r ][ c ];
            prefix = ", ";    // all other values need , before them
         }
         str += " ]\n";
      }
      return str;
   }
   //--------------------------- main ---------------------------------------
   public static void main( String[] args )
   {
      // --------------------------- test rowMax ------------------------
      float dataFixed[][] = { { 0, 2, 4, 3, 5, 1 },
                         { 10, 12, 14, 13, 15, 11 },
                         { -20, -22, -26, -23, -25, -21 },
                         { 30, -32, 34, -33, 35, -31 }
                       };
 
      System.out.println( "-------------- transpose test input ------------" );
      System.out.println( toString( dataFixed ));     
      
      System.out.println( "----------- Normal test: -----------------------" );
      float[][] trans = transpose( dataFixed );
   
      System.out.println( toString( trans ));     
      
      System.out.println( "----------- Empty array test: " );
      trans = transpose( new float[0][0] );
      System.out.println( toString( trans ));     
      System.out.println( "------------------------------------------------" );
     
      //--------------------- test swapRows ----------------------------------
      System.out.println( "-------------- swapRows test input ------------" );
      System.out.println( toString( dataFixed ));     
      
      System.out.println( "-------- Test: swap rows 1 and 3 -------" );
      swapRows( dataFixed, 1, 3 );
      System.out.println( toString( dataFixed ));     
      
      System.out.println( "-------- Test: swap rows 0 and 2 -------" );
      swapRows( dataFixed, 0, 2 );
      System.out.println( toString( dataFixed ));     
      
      System.out.println( "----------- Bad argument test: ---------" );
      swapRows( dataFixed, 1, 8 );
      System.out.println( toString( dataFixed ));     
      System.out.println( "------------------------------------------------" );    
   }
}
