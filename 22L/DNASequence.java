
import java.util.*;


/**
 * DNASequence. - a class to represent a DNA sequence from a FASTA format
 * file. It includes id and sequence information.
 * 
 * @author cs415
 * 
 */
public class DNASequence
{
    //----------------------- Instance variables ---------------------------
    private String   dnaString;
    private String   seqId;
    private String   seqHeader;
    
    
    //------------------- key constants --------------------------------
    
    
    //++++++++++++++++++++++++++++ constructors ++++++++++++++++++++++++++++
    //------------------------- DNASequence( String ) -------------------------
    /**
     * Constructor takes the sequence header and the DNA sequence as Strings.
     * 
     * @param header String
     * @param dna String
     */
    public DNASequence( String header, String dna )
    {  
        
        if( header == null || dna == null )
        {
            throw new DNASequenceException("Either header or dna throws an exception");
        }
        else
        {
            dnaString = dna.trim();
            seqHeader = header.trim();
        }
        if( header.indexOf(">") != 0 || header.length() < 2 )
        {
            throw new DNASequenceException("Header does not contain ID");
        }
        
        Scanner sFile = new Scanner(header);
        String s = sFile.next();
        
        if( s.length() < 2 )
        {
            throw new DNASequenceException("String less than 2 length");
        }
        
        String Id = header.substring( 0, 1 );
        seqId = header.substring( 1 );
        
        if( dna.length() < 1 )
        {
            throw new DNASequenceException("String less than 2 length");
        }
        
        String valid = "ACTGactgXxNn";
        for( int i = 0; i < dna.length(); i++ )
        {
            char ch = dna.charAt( i );
            if( valid.indexOf( ch ) == -1 )
            {
                throw new DNASequenceException("Invalid Character");
            }
        }
    }
    
    //----------------------------- getDNASequence ----------------------------
    /**
     * return the full dna sequence data as a String.
     * 
     * @return String
     */
    public String getDNASequence()
    {
        return dnaString;
    }
    
    //----------------------------- getId -------------------------------
    /**
     * return the identifying "name" of the sequence.
     * 
     * @return String
     */
    public String getId()
    {
        return seqId;
    }
    
    //----------------------------- getHeader -------------------------------
    /**
     * return the identifying "name" of the sequence.
     * 
     * @return String
     */
    public String getHeader()
    {
        return seqHeader;
    }
    
    //-------------------------------- toString() -----------------------------
    /**
     * Returns the header followed by lines representing the DNA.
     * 
     * @return String
     */
    public String toString()
    {
        return "TBD";
    }
    
    //----------------------------- test -------------------------------
    /**
     * Tests the constuctor.
     * 
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
        catch ( DNASequenceException dnaEx )
        {
            System.out.println( "       " + dnaEx.getMessage() + 
                               "  Sequence input ignored." );
        }
    }
    
    
    //-------------------------- main ----------------------------------------
    /**
     * main.
     * 
     * @param args String[]
     */
    public static void main( String[] args )
    {
        String dna1 = "ACXGAACCCTNacgtanx";
        String dnaBadNuc = "CGTGacgtRactg";
        
        String header = ">testId other stuff of unknown format";
        String badHeader = "> No id right after >";
        
        String dna2 = "CTXGAACCCTNacgtanxACXGAACCCTNacgtanxACXGAACCCTNacgtanx" +
            "gggACXGAACCCTNacgtanxACXGAACCCTNacgtanxACXGAACCCTNacgtanx" +
            "AtAtAtAtAtACXGAACCCTNacgtanxACXGAACCCTNacgtanxACXGAACCCTNacgtanx" +
            "GAACCCTNacgtanxACXGAACCCTNacgtanxACXGAACCCTNacgtanx" +
            "XXXXXACXGAACCCTNacgtanxACXGAACCCTNacgtanxACXGAACCCTNacgtanx";
        
        test( header, dnaBadNuc );
        test( badHeader, dna1 );
        test( header, dna1 );
        test( null, dna1 );
        test( header, null );
        test( "", dna1 );
        test( header, "" );
        test( ">", dna1 );
        test( "testId", dna1 );
        test( "   >1   ", "   A   " );  
        
        DNASequence dna = new DNASequence( header, dna2 );  
        System.out.println( "\n************* toString TEST ****************" );
        System.out.println( dna );  //test toString 
    }
}
