/**
 * Dictionary.java 
 * 
 * The main program creates a dictionary object and adds words to it.
 * 
 * For 1/2 the words added, it tests if the word is in the dictionary 
 * (by calling the contains method), for the other half it just calls 
 * the add method.
 * 
 * It prints output information, so you'll look in the Interactions panel. 
 * 
 * "+++" output prefix means that main called contains before add.
 *
 * "---" output prefix means that main only called add.
 */

import java.util.*;
import javax.swing.*;

public class Dictionary
{
   //----------------- instance variables ------------------------
   //------------------- constructor -----------------------------
   public Dictionary()
   {
      // Step 0. Create a Vector or ArrayList of Strings to store the words
   }
   //------------------- add( String ) ---------------------------
   public boolean add( String word )
   {      
      // Step 1. Insert code here to add the "word" to the dictionary

      //
      // Step 3b. After you implement contains, add code to check if the word
      //         is already in the dictionary and only add if it's not.
      //         return true if word was added, false if it was already there.
      
      return true;
   }
   //------------------- toString() ---------------------------------
   public String toString( )
   {
      String result = "";
      
      // Step 2. Add code to create one string containing all words in the 
      //         dictionary (separated by spaces or commas or something);
      //         do not put in line feeds ("\n").
      
      return result;
   }
   //------------------ boolean contains( String ) -------------------------
   public boolean contains( String word )
   {
      boolean found = false;
      
      // Step 3a. Add code here to search your dictionary for the word passed
      //          as an argument. Return true if word is in dictionary,
      //          otherwise return false. Sting matches should be case insensitive.
      
      return found;
   }
   
   //**************** DO NOT EDIT any code below this line **************
   //--------------- main ---------------------------------------
   public static void main( String[] args )
   {
      int[]   wordCounts = { 12 };
      
      String[] words = { "the", "big", "little", "bear", "found", 
                         //"walked", "tree", "a", "field", "honey",
                         //"brain", "apple", "bee", "sky", "frame",
                         "brown", "dirty", "sad", "flew", "ate", 
                         "slept", "drank " , "happy", "man", "car" };
      
      Random rng = new Random( 1 );
      
      for ( int test = 0; test < wordCounts.length; test++ )
      {
         Dictionary q4 = new Dictionary();
         int          numWords = wordCounts[ test ]; 
         boolean      added = false;
         
         for ( int i = 0; i < numWords; i++ )
         {
            String newWord = words[ rng.nextInt( words.length ) ];
            
            if ( i % 2 == 0 )
            {
               added = q4.add( newWord );
               System.out.println( "--- add( " + newWord + " ) --> " + added );
            }
            else     // half the time, I'll check
            {
               boolean inThere = q4.contains( newWord );
               System.out.println( "+++ contains( " + newWord + " ) --> " + inThere );
               if ( ! inThere )
               {
                  added = q4.add( newWord );
                  System.out.println( "--- add( " + newWord + " ) --> " + added );
               }
            }
            System.out.println( "Dictionary: " + q4 );
            System.out.println( "----------------------" );
         }
      }
   }
}