import javax.swing.*;
import java.io.*;
import java.util.*;
import wheelsunh.users.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**Makes DNASearch class. 
 * @author Jeffrey Fernandes
 * 10P
 */
public class DNASearch
{
  
  /**Main Method creates search bar.
   * @param args String
   */
    public static void main( String[]args )
    {
        new Frame();
        //makes scanner
        Scanner scan = new Scanner( System.in );
        scan = FileUtilities.getFileScanner();
        
        String str = "";
        //adds each string to screen sequence
        while( scan.hasNextLine() ) 
        {
            String s = scan.nextLine();
            str += s;
        }
        
        //makes string sequence
        Sequence seq = new Sequence( str );
        //makes search bar
        String sear = JOptionPane.showInputDialog( "Enter Search String" );
        
        while( sear != null )
        {
            seq.search( sear.toUpperCase() ); 
            //remakes pop up search bar
            sear = JOptionPane.showInputDialog( "Enter Search String" );
            //makes everything dark right before new string is highlighted
            seq.dark();
        }
    }
}