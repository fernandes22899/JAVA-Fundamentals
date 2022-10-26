import javax.swing.*;
import java.io.*;
import java.util.*;
import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Component;

/**Makes Sequence class.  
 * @author Jeffrey Fernandes
 * 10P
 */
public class Sequence 
{
    private Vector <Nucleotide> ntide;
    private String st;
    
    /**Sequence class. 
     * @param dna String
     */
    public Sequence( String dna )
    {
        st = dna;
        ntide = new Vector <Nucleotide>();
        int x = 0;
        int y = 0;
        
        for( int i = 0; i < dna.length(); i++ )
        {
            Nucleotide n = new Nucleotide( dna.charAt( i ), x, y );
            n.setLocation( x, y );
            x += 20;
            
            if ( x >= 700 )
            {
                x = 0;
                y += 25;
            }
            
            ntide.add( n );
        }
    }
    
    /**Creates search method. 
     * @param str String
     */
    public void search( String str )
    {
        str.toUpperCase();
        for ( int i = 0; i < ntide.size(); i++ )
        {
            Nucleotide n;
            String pat = "";
            for ( int j = 0; j < str.length(); j++ )
            {
                if ( ( i + j ) < ntide.size() )
                {
                    n = ntide.get( i + j );
                    pat += n.getCharacter();  
                }
            }
            
            if ( str.equals( pat ) )
            {
                ntide.get( i ).highlight();
                
                for ( int x = 1; x < str.length(); x++ )
                {
                    ntide.get( i + x ).highlight();
                }
            }
        }
    }
    
    /**Makes strings dark again by reset method.
      */
    public void dark()
    {
        for( int i = 0; i < ntide.size(); i++ )
            ntide.get( i ).reset();
    }
    
    /**Main method that does testing. 
     * @param args String
     */
    public static void main( String args[] )
    {
        new Frame();
        new Sequence( "CATACTGG" );
    }
}