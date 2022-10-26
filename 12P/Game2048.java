import wheelsunh.users.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Color;

/**2048 Game.
 *
 * @author cs415 and Jeffrey Fernandes
 * 12P
 * 12/5/17
 */
public class Game2048 implements KeyListener
{  
    private int [ ][ ]  matrix; 
    private Random gen;
    private TextBox tb, sb, dir;
    private String prompt, directions, lastMove;
    private int score, starR, starC;
    
    /**Constructor that calls the methods and initializes textboxes and random.
     */
    public Game2048() 
    {
        matrix = new int[ 4 ][ 4 ];
        gen = new Random( );
        tb = new TextBox( );
        sb = new TextBox( );
        dir = new TextBox( );
        
        tb.setLocation( 190, 140 );
        tb.setFrameColor( Color.BLUE );
        
        lastMove = "NONE";
        prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
        sb.setLocation( 260, 90 );
        sb.setSize( 150, 50 );
        sb.setFrameColor( Color.BLUE );
        sb.setText( prompt );
        
        directions = "DIRECTIONS:\nUse the arrows on your keyboard to direct "
            + "the game.\n When no moves are available the game will end.\n "
            + "Press the 'n' key to start a new game";
        dir.setLocation( 210, 300 );
        dir.setSize( 250, 200 );
        dir.setFrameColor( Color.BLUE );
        dir.setText( directions );
        
        placeRandom();
        placeRandom();
        printArr( ); 
    }
    
    //---------------------- COMPRESSERS ---------------------
    /** Moves all nozero elements as far to the left as possible.
     *  All zero elements move to the right.
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
    
    /**Moves all nozero elements as far to the right as possible.
     *  All zero elements move to the left.
     */
    private void compressRight()
    {
        System.out.println( "compressRight called" );
        
        for( int r = 0; r < matrix.length; r++ )
        {
            int insertAt = matrix[r].length - 1;
            for( int c = matrix[r].length - 1; c >= 0; c-- )
            {
                if( matrix[r][c] != 0 )
                {
                    int a = matrix[r][c];
                    matrix[r][c] = matrix[r][insertAt];
                    matrix[r][insertAt] = a;
                    insertAt--;
                }
            }
        }
    }
    
    /**Moves all nozero elements as far up as possible.
     *  All zero elements move to the down.
     */
    private void compressUp()
    {
        System.out.println( "compressUp called" );
        
        for( int c = 0; c < matrix.length; c++ )
        {
            int insertAt = 0;
            for( int r = 0; r < matrix[c].length; r++ )
            {
                if( matrix[r][c] != 0 )
                {
                    int a = matrix[r][c];
                    matrix[r][c] = matrix[insertAt][c];
                    matrix[insertAt][c] = a;
                    insertAt++;
                }
            }
        }
    }
    
    /**Moves all nozero elements as far down as possible.
     *  All zero elements move to the up.
     */
    private void compressDown()
    {
        System.out.println( "compressDown called" );
        
        for( int c = 0; c < matrix.length; c++ )
        {
            int insertAt = matrix[c].length - 1;
            for( int r = matrix[c].length - 1; r >= 0; r-- )
            {
                if( matrix[r][c] != 0 )
                {
                    int a = matrix[r][c];
                    matrix[r][c] = matrix[insertAt][c];
                    matrix[insertAt][c] = a;
                    insertAt--;
                }
            }
        }
    }
    
    //---------------------- MERGERS -----------------------
    /**Merges numbers to the left.   
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
                score += matrix[r][0];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
            if( matrix[r][1] != 0 && matrix[r][2] == matrix[r][1] )
            {
                matrix[r][1] += matrix[r][2];
                matrix[r][2] = 0;
                score += matrix[r][1];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
            if( matrix[r][2] != 0 && matrix[r][3] == matrix[r][2] )
            {
                matrix[r][2] += matrix[r][3];
                matrix[r][3] = 0;
                score += matrix[r][2];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
        }
        compressLeft();
    }
    
    /**Merges numbers to the right.   
     */
    private void mergeRight()
    {
        System.out.println( "mergeRight called" );
        compressRight();
        for( int r = 0; r < matrix.length; r++ )
        {
            //these ifs move number to spots with 0's
            if( matrix[r][0] != 0 && matrix[r][0] == matrix[r][1] )
            {
                matrix[r][1] += matrix[r][0];
                matrix[r][0] = 0;
                score += matrix[r][1];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
            if( matrix[r][1] != 0 && matrix[r][1] == matrix[r][2] )
            {
                matrix[r][2] += matrix[r][1];
                matrix[r][1] = 0;
                score += matrix[r][2];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
            if( matrix[r][2] != 0 && matrix[r][2] == matrix[r][3] )
            {
                matrix[r][3] += matrix[r][2];
                matrix[r][2] = 0;
                score += matrix[r][3];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
        }
        compressRight();
    }
    
    /**Merges numbers to the up.   
     */
    private void mergeUp()
    {
        System.out.println( "mergeUp called" );
        compressUp();
        for( int c = 0; c < matrix.length; c++ )
        {
            //adds numbers if equal and moves up and moves 0's down
            if( matrix[0][c] != 0 && matrix[0][c] == matrix[1][c] )
            {
                matrix[0][c] += matrix[1][c];
                matrix[1][c] = 0;
                score += matrix[0][c];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
            if( matrix[1][c] != 0 && matrix[1][c] == matrix[2][c] )
            {
                matrix[1][c] += matrix[2][c];
                matrix[2][c] = 0;
                score += matrix[1][c];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
            if( matrix[2][c] != 0 && matrix[2][c] == matrix[3][c] )
            {
                matrix[2][c] += matrix[3][c];
                matrix[3][c] = 0;
                score += matrix[2][c];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
        }
        compressUp();
    }
    
    /**Merges numbers to the down.   
     */
    private void mergeDown()
    {
        System.out.println( "mergeDown called" );
        compressDown();
        for( int c = 0; c < matrix.length; c++ )
        {
            //moves 0's up and adds numbers pushing them down
            if( matrix[0][c] != 0 && matrix[0][c] == matrix[1][c] )
            {
                matrix[0][c] += matrix[1][c];
                matrix[1][c] = 0;
                score += matrix[1][c];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
            if( matrix[1][c] != 0 && matrix[1][c] == matrix[2][c] )
            {
                matrix[1][c] += matrix[2][c];
                matrix[2][c] = 0;
                score += matrix[2][c];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
            if( matrix[2][c] != 0 && matrix[2][c] == matrix[3][c] )
            {
                matrix[2][c] += matrix[3][c];
                matrix[3][c] = 0;
                score += matrix[3][c];
                prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
                sb.setText( prompt );
            }
        }
        compressDown();
    }
    
    /**Convert the matrix to a String and put the String in a Textbox.
     */
    public void printArr()
    { 
        if( matrix == null || tb == null  )
            return; 
        String s = "";
        for ( int r = 0; r < matrix.length; r++ )
        {
            for ( int c = 0; c < matrix[ r ].length ; c++ )
            {
                if( r != starR || c != starC )
                    s = s + matrix[ r ][ c ] + "\t";
                else
                {
                    if( matrix[r][c] != 0 )
                        s = s + "*" + matrix[r][c] + "\t";
                    else
                        s = s + matrix[r][c] + "\t";
                }
            }
            s = s + " \n" ;
        }
        tb.setText( s );
        tb.setWidth( 290 );
    }
    
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
            mergeUp();
            placeRandom();
            lastMove = "UP";
            prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
            sb.setText( prompt );
        }
        else if( key ==  KeyEvent.VK_DOWN )
        {
            mergeDown();
            placeRandom();
            lastMove = "DOWN";
            prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
            sb.setText( prompt );
        }
        else if( key ==  KeyEvent.VK_RIGHT )
        {
            mergeRight();
            placeRandom();
            lastMove = "RIGHT";
            prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
            sb.setText( prompt );
        }
        else if( key ==  KeyEvent.VK_LEFT )
        {
            mergeLeft();
            placeRandom();
            lastMove = "LEFT";
            prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
            sb.setText( prompt );
        }
        else if( key == KeyEvent.VK_N )
        {
            clearArray();
            placeRandom();
            placeRandom();
            lastMove = "NEW GAME";
            score = 0;
            prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
            sb.setText( prompt );
        }
        else
        {
            lastMove = "WRONG KEY";
            prompt = "YOUR SCORE: " + score + "\nLAST MOVE: " + lastMove;
            sb.setText( prompt );
        }
        
        //re-displays the matrix in case it has changed 
        printArr(   );
    }
    
    /** This will check the matrix to see if there are any "empty"
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
            for ( int c = 0; c < matrix[ r ].length; c++ )
                if( matrix[ r ][ c ]  == 0 )
                    return false;
        return true;
    }
    
    //------------------------- placeRandom ---------------------------
    /**Randomly places num is an "empty" (zero) element and increments
     * num. If the array is "full" (all non-zero) then print a message
     * and return.
     * 
     */
    private void placeRandom( )
    {
        int r, c, rand;
        starR = -1;
        starC = -1;
        
        if( isFull( ) )
        {
            System.out.println( "Matrix is full" );
            if( score >= 2048 )
            {
                prompt = "YOU WIN WITH A SCORE OF: " + score;
                sb.setText( prompt );
            }
            else
            {
                prompt = "YOU LOSE WITH A SCORE OF: " + score;
                sb.setText( prompt );
                System.out.println( "Game Done" );
            }
            return ;
        }
        
        while( true )
        {
            r = gen.nextInt( matrix.length );
            c = gen.nextInt( matrix[ 0 ].length );
            rand = gen.nextInt( 100 ) + 1;
            
            if( rand < 80 && matrix[ r ][ c ]  == 0 )
            {
                matrix[ r ][ c ] = 2;
                starR = r;
                starC = c;
                break;
            }
            else
            {
                starR = -1;
                starC = -1;
            }
            if( rand >= 80 && matrix[ r ][ c ]  == 0 )
            {
                matrix[ r ][ c ] = 4;
                starR = r;
                starC = c;
                break;
            } 
        } 
    }
    
    /**Resets the array "matrix" so that all the values are 0.
     */
    private void clearArray()
    {
        System.out.println( "clearArray called" );
        
        for ( int r = 0; r < matrix.length; r++ )
            for ( int c = 0; c < matrix[ r ].length; c++ )
                matrix[ r ][ c ]  = 0 ;
    }
    
    /** Handle the key released event from the text field. 
      * NOT NEEDED for this lab
      * 
      * @param e KeyEvent
      */
    public void keyReleased( KeyEvent e ) 
    {
        // System.out.println("KEY RELEASED: " + e.getKeyCode( ) );
    }
    
    /** Handle the key typed event from the text field. 
      *  NOT NEEDED for this lab
      * 
      * @param KeyEvent
      * @param e KeyEvent
      */
    public void keyTyped( KeyEvent e ) 
    {
        // char c = e.getKeyChar( );
    }
    
    /**Main method runs constructor and makes frame.
     *
     * @param arg String[]
     */
    public static void main( String arg[] )
    {
        Frame frame = new Frame( );
        Game2048 game = new Game2048(  );
        
        // add app as a keyListener to frame:
        frame.addKeyListener( game );
    }
}