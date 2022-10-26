/**
 * Blanks.java 
 * 
 * The main program generates Strings composed of words separated by
 * one or more blanks. The static method compressBlanks accepts a 
 * String parameter and returns a String that is the same as the 
 * input except multiple contiguous blanks are compressed into 1.
 * 
 * Thus:  "able baker     charlie"
 * is mapped to "able baker charlie".
 * 
 */

import java.util.*;
import javax.swing.*;

public class Blanks
{
   ///////////////////////////////////////////////////////////////////
   // Write the method below, CompressBlanks( String ).
   ///////////////////////////////////////////////////////////////////////
   public static String compressBlanks( String line )
   {
      String result = "";
      
      result = line.replaceAll( "\\s+", " " );
      
      // \\s+
      return result;
   }
   
   //**************** DO NOT EDIT any code below this line **************
   //--------------- main ---------------------------------------
   public static void main( String[] args )
   {
      String lines[] = { "This is a     simple case",
                         "This   is   another      case",
                         "a b  c   d    e     f      g        h"
                         };
      for ( int n = 0; n < lines.length; n++ )
      { 
         System.out.println( "Original: |" + lines[ n ] + "|" );
         String line = compressBlanks( lines[ n ] );
         System.out.println( "Compressed: |" + line + "|\n" );
      }
   }
}