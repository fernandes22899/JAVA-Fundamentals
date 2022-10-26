import wheelsunh.users.*;
import java.util.*;
import java.awt.event.*;


/**
 * Lab2Db - practice some 2D array methods.
 *
 * @author cs415 and ???
 */
public class Lab2Db implements KeyListener
{  
    private int [ ][ ]  matrix; 
    private Random gen;
    private TextBox tb;
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**
     * Construct the lab.
     */
    public Lab2Db(  ) 
    {
        matrix = new int[ 4 ][ 4 ];
        gen = new Random( );
        tb = new TextBox( );
        
        printArr( ); 
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**  
     *  Moves all nozero elements as far to the left as possible.
     *  All zero elements move to the right.
     *     
     *      
     */
    private void compressLeft( )
    {
        System.out.println( "compressLeft called" );
        
        for( int r = 0; r < matrix.length; r++ )
        {
            int insertAt = 0;
            for( int c = 0; c < matrix[r].length; c++ )
            {
                if( matrix[r][c] != 0 )
                {
                    int a = matrix[r][c];
                    matrix[r][c] = matrix[r][insertAt];
                    matrix[r][insertAt] = a;
                    insertAt++;
                }
            }
        }
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**  
     *  Does a 2048 merge left.
     *     
     *      
     */
    private void mergeLeft( )
    {
        System.out.println( "mergeLeft called" );
         compressLeft();
        for( int r = 0; r < matrix.length; r++ )
        {
           
            if( matrix[r][0] != 0 && matrix[r][1] == matrix[r][0] )
            {
                matrix[r][0] += matrix[r][1];
                matrix[r][1] = 0;
            }
            if( matrix[r][1] != 0 && matrix[r][2] == matrix[r][1] )
            {
                matrix[r][1] += matrix[r][2];
                matrix[r][2] = 0;
            }
            if( matrix[r][2] != 0 && matrix[r][3] == matrix[r][2] )
            {
                matrix[r][2] += matrix[r][3];
                matrix[r][3] = 0;
            }
            
           
        }
        
         compressLeft();
        
    }
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**
     * Convert the matrix to a String and put the String in a Textbox.
     * 
     * 
     */
    public void printArr(   )
    { 
        if( matrix == null || tb == null  )
            return; 
        String s = "";
        for ( int r = 0; r < matrix.length; r++ )
        {
            for ( int c = 0; c < matrix[ r ].length ; c++ )
            {
                s = s + matrix[ r ][ c ] + "\t";
            }
            s = s + " \n" ;
        }    
        
        tb.setText( s );
        tb.setWidth( 500 );
    }
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /** Handle the key pressed event from the text field. 
      *  Use this for action key input such as arrows --- use
      *   e.getKeyCode()  ( returns int )
      * 
      * @param e KeyEvent
      */
    public void keyPressed( KeyEvent e ) 
    {
        int key = e.getKeyCode( );
        System.out.println( "keyPressed called with key " + key );
        
        if( key == KeyEvent.VK_UP )
        {
            placeRandom();
        }
        else if( key ==  KeyEvent.VK_DOWN )
        {
            clearArray();
        }
        else if( key ==  KeyEvent.VK_RIGHT )
        {
            compressLeft();
        }
        else if( key ==  KeyEvent.VK_LEFT )
        {
            mergeLeft();
        }
        else
        {
            System.out.println ( "Huh?" );
        }
        
        
        // re-display the matrix in case it has changed 
        printArr(   );
    }
    
    
    
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**  
     * This will check the matrix to see if there are any "empty"
     *  elements (zero eleements).
     *     
     *  false: if there are zero entries
     *  true:  if all entries are non-zero
     * 
     * @return boolean
     */
    public boolean isFull( )
    {
        for ( int r = 0; r < matrix.length; r++ )
        {
            for ( int c = 0; c < matrix[ r ].length; c++ )
            {
                if( matrix[ r ][ c ]  == 0 )
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    
    //------------------------- placeRandom ---------------------------
    /**
     * Randomly places num is an "empty" (zero) element and increments
     * num. If the array is "full" (all non-zero) then print a message
     * and return.
     * 
     */
    private void placeRandom( )
    {
        int r, c;
        
        if( isFull( ) )
        {
            System.out.println( "Matrix is full" );
            return ;
        }
        
        while ( true )
        {
            r = gen.nextInt( matrix.length );
            c = gen.nextInt( matrix[ 0 ].length );
            
            if( matrix[ r ][ c ]  == 0 )
            {
                matrix[ r ][ c ] = 2;
                break;
            } 
        } 
        
        
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /**
     * Resets the array "matrix" so that all the values are 0.
     * 
     */
    private void clearArray( )
    {
        System.out.println( "clearArray called" );
        
        for ( int r = 0; r < matrix.length; r++ )
        {
            for ( int c = 0; c < matrix[ r ].length; c++ )
            {
                matrix[ r ][ c ]  = 0 ;
            }
        }
        
    }
    
    
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /** Handle the key released event from the text field. 
      * NOT NEEDED for this lab
      * 
      * @param e KeyEvent
      */
    public void keyReleased( KeyEvent e ) 
    {
        // System.out.println("KEY RELEASED: " + e.getKeyCode( ) );
    }
    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /** Handle the key typed event from the text field. 
      *  NOT NEEDED for this lab
      * 
      * @param KeyEvent
      * 
      * @param e KeyEvent
      */
    public void keyTyped( KeyEvent e ) 
    {
        // char c = e.getKeyChar( );
    }
    
    //------------------------------------------------------------------
    /**
     * main.
     *
     * @param arg String[]
     */
    public static void main( String arg[] )
    {
        Frame frame = new Frame( );
        Lab2Db lab = new Lab2Db(  );
        
        // add app as a keyListener to frame:
        frame.addKeyListener( lab );
        
    }
}
