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
    public ReadFileTest() 
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
      int x = 0;
      while ( fileScanner.hasNext() )
      {
        x++;
        String read = fileScanner.next();
        System.out.println( x + "      " + read );
      }
 
        
    }
    
    /**
     * openFileScanner.
     * 
     * @throws IOException if file wont open
     */   
    private void openFileScanner()  
    {
      try
      {
       File file = new File (fileName);
       fileScanner = new Scanner ( file );
      }
      catch( Exception e )
      {
        System.out.println("FileNotFoundException: " + e.getMessage());
      }
        

 
    } 
    
    
    
    /**
     * main.
     * @param args String[]
     * @throws IOException if file wont open
     */  
    public static void main( String[] args ) 
    {
        new ReadFileTest();
    }
}
