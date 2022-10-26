import wheelsunh.users.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Point;

/**Makes an asteroid that is called by AsteroidApp.
  * 
  * CS415
  * @author Jeffrey Fernandes
  * Project #9
  * 9P
  */
public class Asteroids extends ShapeGroup
{
    private Random r;
    private Ellipse asteroid;
    private Line aLine;
    private int deltaX, deltaY, nextX, nextY, maxX = 950, maxY = 750
        , startX, startY, aSize, i = 0;
    
    /**Constructor makes a line and an asteroid.
     * @param x int
     * @param y int
     */
    public Asteroids( int x, int y )
    {
        r = new Random();
        
        startX = r.nextInt( 500 ) + 200;
        startY = 0;
        
        deltaX = r.nextInt( 50 ) - 25;
        deltaY = r.nextInt( 10 ) + 5;
        
        aLine = new Line( startX, startY, startX, startY );
        aLine.setColor( Color.RED );
        int lThick = r.nextInt( 4 ) + 1;
        aLine.setThickness( lThick );
        
        asteroid = new Ellipse();
        asteroid.setLocation( startX, startY );
        aSize = r.nextInt( 14 ) + 8;
        asteroid.setSize( aSize, aSize );
        asteroid.setColor( Color.RED );
        this.add( asteroid );
        
    }
    
    /**Method resets the asteroid back to the top.
     */
    public void startOver()
    {
        deltaX = r.nextInt( 40 ) - 20;
        deltaY = r.nextInt( 20 ) + 10;
        startX = r.nextInt( 500 ) + 200;
        
        startY = 0;
        
        aSize = r.nextInt( 15 ) + 7;
        asteroid.setSize( aSize, aSize );
        
        aLine.setP1( startX, startY );
        aLine.setP2( asteroid.getCenter() );
    }
    
    /**Method allows asteroid to move.
     */
    public void move()
    {
        startX +=  deltaX;
        startY +=  deltaY;
        
        super.setLocation( startX, startY );
        aLine.setP2( asteroid.getCenter() );
    }
    
    /**Method sets the location of asteroid and line.
     * @param x int
     * @param y int
     */
    public void setLocation( int x, int y )
    {
        asteroid.setLocation( x - 6, y + 193 );  
        aLine.setP2( asteroid.getCenter() );
    }
    
    /**Main method tests the building class.
     * @param args String
     */
    public static void main( String[]args )
    {
        new Frame( 700, 400 );
        new Asteroids( 100, 100 );
    }
    
}