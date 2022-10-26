import java.io.*;
import java.util.*;

/**
 * ReadFileTest.
 * 
 * Try to read lines from a file and print them out with line numbers.
 * @author cs415
 * 
 */
public class ReadFileTest
{
    private  String fileName = null;
    private Scanner fileScanner = null;
    
    /**
     * Constructor.
     * 
     * @throws IOException if file wont open
     */
    public ReadFileTest() throws IOException
    {
        fileName = FileUtilities.getFileName();
        while( fileName != null )
        {    
            fileScanner = null;
            openFileScanner( );
            if( fileScanner != null )
                readAndPrintFile();  
            fileName = FileUtilities.getFileName();
        }
    }
    
    
    /**
     * readAndPrintFile.
     */
    private void readAndPrintFile()
    {
        int i = 0;
        
        while( fileScanner.hasNext() )
        {
            i++;
            String input = fileScanner.next();
            System.out.println( i + "    " + input );
        }
        
    }
    
    /**
     * openFileScanner.
     * 
     * @throws IOException if file wont open
     */   
    private void openFileScanner()  throws IOException
    {
        try
        {
            File f = new File( fileName );
            fileScanner = new Scanner( f );
        }
        catch( IOException e )
        {
            System.out.println("NoFileExcpetion: " + e.getMessage() );
        }
 
    } 
    
    
    
    /**
     * main.
     * @param args String[]
     * @throws IOException if file wont open
     */  
    public static void main( String[] args ) throws IOException
    {
        new ReadFileTest();
    }
}
