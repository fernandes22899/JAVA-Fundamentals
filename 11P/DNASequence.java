import wheelsunh.users.*;
import java.awt.Color;
import java.util.*;

/**DNASequence - a class to represent a DNA sequence from a FASTA format
 * file. It includes header and sequence information.
 * 
 * @author Jeffrey Fernandes
 * 11P
 * 11/28/17
 * 
 */
public class DNASequence
{
    //----------------------- Instance variables ---------------------------
    private String        dnaString;
    private String        seqId;
    private String        seqHeader;
    private int           seqLineLen = 50;
    
    //------------------------- DNASequence( String ) -------------------------
    /**Constructor takes the sequence header and the DNA sequence as Strings.
      * 
     * @param header String
     * @param  dna  String
     */
    public DNASequence( String header, String dna )
    {  
        if( header == null || dna == null )
        {
            String error = "Either header or dna throws an exception";
            throw new DNASequenceException( error );
        }
        else
        {
            dnaString = dna.trim();
            seqHeader = header.trim();
        }
        
        if( header.indexOf( ">" ) != 0 || header.length() < 2 )
        {
            throw new DNASequenceException( "Header does not contain ID" );
        }
        
        Scanner sFile = new Scanner( header );
        String s = sFile.next();
        
        if( s.length() < 2 )
        {
            throw new DNASequenceException( "String less than 2 length" );
        }
        
        String id = header.substring( 0, 1 );
        seqId = header.substring( 1 );
        
        if( dna.length() < 1 )
        {
            throw new DNASequenceException( "String less than 2 length" );
        }
        
        String valid = "ACTGactgXxNn";
        
        for( int i = 0; i < dna.length(); i++ )
        {
            char ch = dna.charAt( i );
            if( valid.indexOf( ch ) == -1 )
            {
                throw new DNASequenceException( "Invalid Character" );
            }
        }
    }
    
    //----------------------------- getDNASequence ---------------------------
    /**Return the full dna sequence data as a String.
     * @return String
     */
    public String getDNASequence()
    {
        return this.dnaString;
    }
    
    //----------------------------- getHeader() -----------------------------
    /**Return the full dna sequence data as a String.
     * @return String
     */
    public String getHeader()
    {
        return this.seqHeader;
    }
    
    //----------------------------- getId -------------------------------
    /**Return the identifying "name" of the sequence.
     * @return String
     */
    public String getId()
    {
        return this.seqId;
    }
    
    //--------------------------- indexOf( String, int ) --------------------
    /**Find the next occurrence the search string in the sequence and
     * return its position. Return -1 if not found. This is a a case
     * sensitive search.
     * 
     * @param search String
     * @param start int
     * @return int
     */
    public int indexOf( String search, int start )
    {
        return dnaString.indexOf( search, start );
    }   
    
    //-------------------------------- toString() -----------------------------
    /**Returns a single string that reproduces an approximation to the input 
     * format for the sequence. In other words, the returned string must start 
     * with a header line that looks like the original header in the input file 
     * and includes the line feed character (\n). 
     * 
     * The header information is followed (in the same String object being 
     * returned) by the sequence data that is broken up into sections that will 
     * print nicely. In other words, you should copy the sequence data to the 
     * output string in groups of 50 characters followed by a line feed. 
     * The line 
     * length should be an instance variable so that it can be easily changed.
     * 
     * @return String
     */
    public String toString()
    {
        String dnaTo = seqHeader;
        for( int i = 0; i < dnaString.length(); i++ )
        {
            if( i % seqLineLen == 0 )
                dnaTo += "\n";
            
            dnaTo += dnaString.charAt( i );
        }
        return dnaTo;
    }
    
    // Think about defining useful utility methods that will simplify the code 
    // in the public methods.
    
    //----------------------------- test -------------------------------
    /**Tests the constuctor.
     * @param header String
     * @param dnaString String
     */
    private static void test( String header, String dnaString )
    {
        System.out.println( "\n***************** TEST ********************" );
        System.out.println( "header: " + header + "\nsequence: " + 
                           dnaString + "\n" );
        try
        {
            DNASequence dna = new DNASequence( header, dnaString );
            System.out.println( "       id: " + dna.getId() + 
                               "\n       header: " + dna.getHeader() +
                               "\n       dna: " + dna.getDNASequence() );
        }
        catch( DNASequenceException e )
        {
            System.out.println( "       " + e.getMessage() + 
                               ". SEQUENCE INPUT IGNORED." );
        }
    }
    
    //-------------------------- main ----------------------------------------
    /**Simple test main.
     * @param  args String
     */
    public static void main( String[] args )
    {
        String dna = "ACXGAACCCTGACXGACGTACXGAACCCTGACXGACGTACXGAACCCTGACXGACGT"
            + "ACXGAACCCTGACXGACGTACXGAACCCTGACXGACGTACXGAACCCTGACXGACGT"
            + "ACXGAACCCTGACXGACGTACXGAACCCTGACXGACGTACXGAACCCTGACXGACGT"
            + "ACXGAACCCTGACXGACGTACXGAACCCTGACXGACGTACXGAACCCTGACXGACGT"
            + "ACXGAACCCTGACXGACGTACXGAACCCTGACXGACGTACXGAACCCTGACXGACGT";
        
        String dnaBadNuc = "AXXCATCgggTARGTctaTTAAG";
        
        String header = ">testId other stuff of unknown format";
        
        String headerBad = "> no id right after >";
        
        DNASequence s = new DNASequence( header, dna );
        
        System.out.println( "Sequence: \n" + s );
        
        //---------------------- add more test code!!!! -----------------------
        // add tests indexOf.
        
        System.out.println( "\n************* indexOf TEST ****************" );
        System.out.println( s.indexOf( "ACXg5", 5 ) ); //-1
        System.out.println( s.indexOf( "ACX", 0 ) ); //0
        System.out.println( s.indexOf( "XGA", 0 ) ); //2
        System.out.println( s.indexOf( "A", 93 ) ); //95
        
        System.out.println( "\n************* toString TEST ****************" );
        System.out.println( s );  //testing toString method
        
        test( header, dna );
        test( header, dnaBadNuc ); //Will be thrown because of bad nuc
        test( headerBad, dna ); //String will not work because of bad header
        test( headerBad, dnaBadNuc ); //both wont work
        test( null, dna );
        test( header, null );
        test( "", dna );
        test( header, "" );
        test( ">", dna );
        test( "testId", dna );
        test( "   >1   ", "   A   " );
    }
}