import javax.swing.*;
import java.io.*;
import java.util.*;
import wheelsunh.users.*;
import java.awt.Color;

/**Makes Nucleotide class. 
 * @author Jeffrey Fernandes
 * 10P
 */
public class Nucleotide extends TextBox
{
    private TextBox t;
    private Color d;
    private char ch;
    
    /**Nucleotide class. 
     * @param x int
     * @param y int
     * @param a char
     */
    public Nucleotide( char a, int x, int y )
    {
        super.setText( Character.toString( a ) );
        super.setFrameColor( Color.black );
        super.setSize( 20, 25 );
        
        ch = a;
        //makes each letter its own color
        if( a == 'A' )
            super.setFillColor( Color.red );
        else if ( a == 'T' )
            super.setFillColor( Color.cyan );
        else if ( a == 'C' )
            super.setFillColor( Color.yellow );
        else if ( a == 'G' )
            super.setFillColor( Color.green );
        else 
            super.setFillColor( new Color( 160, 160, 160 ) );
        
        d = getFillColor().darker();
        super.setFillColor( d );
    }
    
    /**Creates highlight method that makes colors brigher when executed. 
     */
    public void highlight()
    {
        super.setFillColor( d.brighter() );
    }
    
    /**Creates a reset method that sets fill color. 
     */
    public void reset()
    {
        super.setFillColor( d );
    }
    
    /**Returns char ch when called. 
     * @return ch
     */
    public char getCharacter()
    {
        return ch;
    }
}