import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;

/**
 * LabExceptions.java. 
 * @author cs415
 * 
 * 
 */
public class LabExceptions 
{ 
    /**
     * Constructor.
     * 
     *@throws IOException if file won't open
     */
    public LabExceptions( )                         
    { 
        // Create a File using FileChooser
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory( new java.io.File( "." ) );
        int returnVal = fc.showOpenDialog( null );
        File inputFile = fc.getSelectedFile();
        
        //System.out.println( "Selected file: " + inputFile.getName( ) );
 
        
        
        
        
        ////////////////////////////////////////////////////////////////
        
  
        System.out.println( "\n*******************************\n" );
        System.out.println( "Part 1:print the file one token per" +
                           " line\n\n" ); 
        
        tokenInput( inputFile );
  
  
        System.out.println( "\n*******************************\n" );
        System.out.println( "Part 2: print the file to standard output" +
                           " with one character per line\n\n" );
        
        characterInput( inputFile );
        
     
        
        
        System.out.println( "\n*******************************\n" );
        System.out.print( "Part 3 read integers and print them one per line" );
        System.out.println( " and sum them up:\n" );
       
        integerInputAndSum( inputFile );
        
    }
    
    
    //////////////////////////////////////////////////////////////////////////
    /**
     * Read characters from inputFile and print out int and char value.
     * 
     * @throws IOException  if file won't open
     * @param inFile File
     */
     private void characterInput( File inFile )
    {
        int ich;
        BufferedReader bReader = null;

        // Initialize the BufferedReader
        // Read characters (until -1 is read) and print out int and char values
        try
        {
            bReader = new BufferedReader( new FileReader( inFile ) );
            while( bReader.read() != -1 )
            {
                ich = bReader.read();
                char ch = (char) ich;
                if( ch == '\n' )
                    System.out.println( "\\n" );
                else
                {
                    System.out.println( "CHAR is: " + ch );
                }
                System.out.println( "INT is: " + ich );
            }
        }
        catch( IOException e )
        {
            System.out.println( "FileIOException: " + e.getMessage() );
        }
    }
    
    //////////////////////////////////////////////////////////////////////////
    /**
     * Read tokens from inputFile and print out as one token per line.
     * 
     * 
     * @throws IOException  if file won't open
     * @param inFile File
     */
    
    private void tokenInput( File inFile )
    {
        Scanner scanFile;
        // Create a Scanner object from the File parameter, inFile 
        // Read tokens from the Scanner, print each input token 
        // on its own output line
        try
        {
            scanFile = new Scanner( inFile );
            while( scanFile.hasNext() != false )
                System.out.println( scanFile.next() );
        }
        catch( IOException e )
        {
            System.out.println( "FileIOException: " + e.getMessage() );
        }
    }
    
    
    /**
     * Read integers, print them out along with their sum.
     * 
     * 
     * @throws IOException  if file won't open
     * @param inFile File
     */
    private void integerInputAndSum( File inFile )
    {
        Scanner scanFile;
        // Create a Scanner object from the File parameter, inFile 
        
        try
        {
        scanFile = new Scanner( inFile );
        int count = 0;
        while( scanFile.hasNextInt() == true )
        {
          int x = scanFile.nextInt();
          count += x;
          System.out.println( "INT is: " + x );
        }
        System.out.println( "SUM is: " + count );
        }
        catch( Exception e )
        {
          System.out.println( "FileIOException: " + e.getMessage() );
          return;
        }
    }
    
    
    /**
     * Main.
     * @param args String[]
     * @throws IOException  if file won't open
     */
    public static void main( String[ ] args )
    {
        LabExceptions app = new LabExceptions( );
    }
}
