/**
 * StringMethods.java 
 * 
 * 
 */

import java.util.*;

public class StringMethods
{

   
   
   ///////////////////////////////////////////////////////////////////
   // Write the method below, The method should return a String
   // that is the same as str but with the first occurance of target removed
   ///////////////////////////////////////////////////////////////////////
   public static String removeFirst( String str, String target )
   {
      String str1 = str.substring( 0, str.indexOf( target ) );
      String str2 = str.substring( str.indexOf( target ) + 3 );
      String str3 = str1 + str2;
      
      return str3;
   }
   
   
   
   
   //**************** DO NOT EDIT any code below this line **************
   //--------------- main ---------------------------------------
   public static void main( String[] args )
   {
      String phrases[] = { "one two har dee har har",
         "one two one two three har",
         "har123twotwohar"
      };
      String words[] = { "har",
         "two"
      };
      
      for ( int n = 0; n < phrases.length; n++ )
      { 
         String current = phrases[n];
         System.out.println("****\nOringinal Phrase: " + current ); 
         for ( int m = 0; m < words.length; m++ )
         { 
            String word = words[m];
            System.out.println("     With " + word + " removed: " + removeFirst( current , word ));  
         }  
      }
   }
}

