import wheelsunh.users.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Point;

/**Runs all classes combined and allows the user to play the game.
  *
  * CS415
  * @author Jeffrey Fernandes
  * Project #9
  * 9P
  */
public class AsteroidApp implements Animator
{
    private Random r;
    private AnimationTimer timer;
    private Asteroids ast;
    private Rectangle background;
    private Color backColor = new Color( 68, 71, 76 );
    private Vector<Buildings> buildings;
    private Buildings b;
    private Shield s;
    private int dev = 0;
    private TextBox t;
    
    /**Constructor allows everything to run properly.
     * @param x int
     * @param y int
     */
    public AsteroidApp( int x, int y )
    {
        buildings = new Vector<Buildings>();
        r = new Random();
        int newX = 0;
        
        background = new Rectangle( 0, 0 );
        background.setColor( backColor );
        background.setSize( 700, 400 );
        
        for( int i = 0; i < 15; i++ )
        {
            Utilities.sleep( 200 );
            
            int width = r.nextInt( 33 ) + 33;
            int height = r.nextInt( 55 ) + 30;
            b = new Buildings( width, height, newX );
            
            newX += width;
            buildings.add( b );
        }
        
        s = new Shield( x, y );
        textBox();
        
        ast = new Asteroids( 300, 20 );
        
        timer = new AnimationTimer( 50, this );
        timer.start();
    }
    
    /**Method makes the animation when things are hit.
     */
    public void animate()
    {
        ast.move();
        
        for( int i = 0; i < buildings.size(); i++ )
        {
            b = buildings.get( i );
            if( b.boundsIntersects( ast ) )
            {
                ast.startOver( );
                b.hide( );
                buildings.remove( i );
                
                dev++;
                int percent = ( dev * 7 );
                
                if( percent >= 50 )
                {
                    Utilities.sleep( 3000 );
                    System.exit( 0 );
                }
                
                t.setText( "                      City devastation " 
                              + percent + "%" );
            }
            else if( s.boundsIntersects( ast ) )
                ast.startOver();
        }
        
        if( ast.getYLocation() >= 400 || ast.getYLocation() < -5 )
            ast.startOver();
        
        else if( ast.getXLocation() >= 700 || ast.getXLocation() <= 0 )
            ast.startOver();
        
    }
    
    /**Method makes a textbox with info.
     */
    public void textBox()
    {
        t = new TextBox( 225, 50 );
        t.setSize( 250, 50 );
        t.setText( "      PREPARE TO DEFEND YOUR CITY!!!" );
        Utilities.sleep( 3000 );
        t.setText( "                      City devastation " + dev + "%" );
        
    }
    
    /**Main method tests the building class.
     * @param args String
     */
    public static void main( String [] args )
    {
        new Frame( 700, 400 );
        new AsteroidApp( 0, 0 );
    }
    
}