import java.awt.Color;
import wheelsunh.users.*;
import java.awt.Point;
import java.util.Random;


public class Cockroach extends Ellipse
{
    private Ellipse cr;
    private int height, rot;
    private int x1, y1;

    
    public Cockroach()
    {
        super();
        Random rand = new Random();
        height = 10 + rand.nextInt( 15 );
        rot = rand.nextInt( 360 );
        int loc1 = rand.nextInt( 700 );
        int loc2 = rand.nextInt( 500 );
        
        
        this.setColor( Color.BLACK );
        this.setSize( height, 3 * height );
        this.setRotation( rot );
        this.setLocation( loc1, loc2 );
    }
    
    
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        Cockroach c = new Cockroach();
        Random rand = new Random();
        int loc1 = rand.nextInt( 700 );
        int loc2 = rand.nextInt( 500 );
        setLocation( loc1, loc2 );
        
        int x = e.getPoint().x;
        int y = e.getPoint().y;
        System.out.println( "Coordinates of mouse event X: " + x + " Y: " + y );
        System.out.println( "Location of Cockroach X: " + super.getXLocation() + " Y: " + super.getYLocation() );
        System.out.println( "Size of New Cockroach X: " + c.getHeight() + " Y: "+ c.getWidth() );
        System.out.println( "New Cockroach located at X: " + c.getXLocation() + " Y: " + c.getYLocation());
        System.out.println();
    }
    
    public static void main(String[]args)
    {
        new Frame();
        Cockroach c1 = new Cockroach();
    }
}