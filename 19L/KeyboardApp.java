import wheelsunh.users.*;
import java.util.*;
import java.awt.event.*;
/**--------------------------------------------------------
  * KeyboardApp.
  * Pig Latin Translator
  * @author mlb 
  */

public class KeyboardApp implements KeyListener
{
    private Vector<String> words;
    private TextBox tb;
    private String current;
    
    /**KeyboardApp.
     */
    public KeyboardApp( )
    {   
        // initialize words to a Vetor of strings
        words = new Vector<String>();
        
        // initialize current to an empty string
        current = "";
        
        //////////////////////////////////////
        //  tb will display the current word and
        // the list of words.
        // Do not edit the next two lines
        //////////////////////////////////////
        
        tb = new TextBox( 200, 10 );
        refreshDisplay();
    }
    
    
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /** Handle the key pressed event from the text field. 
      *  Use this for action key input such as arrows --- use
      *   e.getKeyCode()  ( returns int )
      * 
      * @param e KeyEvent
      */
    public void keyPressed( KeyEvent e ) 
    {
        // int code = e.getKeyCode( ) , dx = 0 , dy = 0;
        // System.out.println("KEY PRESSED: " + code );
        
        // NOT NEEDED FOR THIS LAB
        
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /** Handle the key released event from the text field. 
      *  @param e KeyEvent
      */
    public void keyReleased( KeyEvent e ) 
    {
        // System.out.println("KEY RELEASED: " + e.getKeyCode( ) );
        
        // NOT NEEDED FOR THIS LAB
    }
    
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /** Handle the key typed event from the text field. 
      *  Use this for UNICODE character input --- use:
      *      e.getKeyChar()  (returns char) or
      *      Character.toString( e.getKeyChar( ) ) (returns String)
      * 
      *  @param e KeyEvent
      */
    public void keyTyped( KeyEvent e ) 
    {
        // get key typed as String
        String s  =  Character.toString( e.getKeyChar() );
        //get keyTyped as char
        char c = e.getKeyChar();
        System.out.println(s);
        
        // Add a selection structure based on the value of the entered 
        //  String character (or the char value it is your choice).
        //
        //  If the character is a space " " then clear the collection 
        // "words"
        // 
        // If the character is a return "\n" then translate the current 
        //  word, add the translation 
        // to the collection and set the current word to an empty string
        //
        // Otherwise add the character to the current word.
        ////////////////////////////////////////////////////////////////
        
        if( s == " " )
        {
            words.clear();
        }
        else if( s == "\n" )
        {
            String st = StringUtilities.translate(current);
            words.add( st );
            current = "";
        }
        else
        {
            current = current + s;
        }
        
        ///////////////////////////////////////////////////////////
        //  this will refresh the display 
        //  after you have made changes
        refreshDisplay( );
    }
   
    //--------------------------------------------------------
    /**  Displays current word and list of translations.
      *  DO NOT EDIT
      */
    private void refreshDisplay( )
    {
        String output = "Current Word: " + current + 
            "\n\nTranslated List:\n";
        
        if( words != null )
        {
            for( String s: words )  
                output += ( "               " + s + "\n" );
            
            tb.setText(output);
            tb.setWidth( 250 );
        }
    }
    
    
    
    //--------------------------------------------------------
    /** Creates a Frame and a KeyBoardApp. 
      *
      * @param args String[]
      */
    public static void main( String args[] )
    {
        Frame frame = new Frame();
        KeyboardApp app =  new KeyboardApp( );
        
        /////////////////////////////////
        // Add the app to the frame as a KeyListener
        
        frame.addKeyListener( app );
    }
}