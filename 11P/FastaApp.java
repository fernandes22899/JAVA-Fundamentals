import wheelsunh.users.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**FastaApp is a class that will display a dna string when asked and will also
 * display where the string is contained when a string is entered.
 * 
 * @author Jeffrey Fernandes
 * 11P
 * 11/28/17
 */
public class FastaApp
{
    private DNASequence dna;
    
    /**Main method runs class and search and finds dna sequences and strings.
      * @param args String
      */
    public static void main( String[]args )
    {
        String fileName = P11FileUtilities.getFileName();
        int seqNum = 0;
        
        try
        {
            BufferedReader br = new BufferedReader( 
                                                   new FileReader( fileName ) );
            String l = null;
            
            while( ( l = br.readLine() ) != null )
                if( l.startsWith( ">" ) )
                    seqNum++;
        }
        catch( Exception e )
        {
            throw new DNASequenceException( "No sequences are found" );
        }
        
        System.out.println( "+++++++++++++++++++++++++++++++++++++" );
        System.out.println( "There were " + seqNum + " sequences read." );
        System.out.println( "+++++++++++++++++++++++++++++++++++++" );
        
        try
        {
            BufferedReader br = new BufferedReader( 
                                                   new FileReader( fileName ) );
            String l = null;
            
            while( ( l = br.readLine() ) != null )
                System.out.println( l );
        }
        catch( Exception e )
        {
            throw new DNASequenceException( "No file is found" );
        }
        
        String prompt = seqNum + " sequences in memory.\nEnter command:\n    "
                               + "Display <id> (Display nucleotide "
                               + "with given id)\n    Search <pattern>"
                               + " (Search for sequences containing pattern)";
        String input = JOptionPane.showInputDialog( prompt );
        input = input.toLowerCase();
        
        if( input != null )
        {
            Scanner inputScan = new Scanner( input );
            String enter = inputScan.next();
            
            while( input.indexOf( "s" ) != 0 || input.indexOf( "d" ) != 0 )
            {
                String again = prompt + "\nPLEASE ENTER VALID COMMAND";
                input = JOptionPane.showInputDialog( again );
            }
            if( input.startsWith( "s" ) )
            {
                System.out.println( "Searching for sequence" );
            }
            else if( input.startsWith( "d" ) )
            {
                System.out.println( "Displaying dna sequence" );
            }
        }
    }
}