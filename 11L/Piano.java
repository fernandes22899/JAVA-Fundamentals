import java.awt.Color;
import wheelsunh.users.*;
import java.awt.Point;

public class Piano extends ShapeGroup
{
    private Rectangle r1, r2;
    private Color c1;
    private Point lastMousePosition;
    private int x1, y1;
    
    
    public Piano()
    {
        
        
    }
    
    public Piano( int x, int y )
    {
        makePiano( x, y );
        
    }
    
    public void makePiano( int x, int y )
    {
        r1 = new Rectangle( x, y );
        r1.setColor( Color.BLACK );
        r1.setSize( 90, 50 );
        add( r1 );
        
        r2 = new Rectangle( x + 5, y + 35 );
        r2.setColor( Color.WHITE );
        r2.setSize( 80, 10 );
        add( r2 );
    }
    
    public void setColor( Color c )
    {
        r1.setColor( c );
        c1 = c;
    }
    
    public Color getColor()
    {
        return c1;
    }
    
    public void mousePressed ( java.awt.event.MouseEvent e )
    {
        lastMousePosition = e.getPoint();
        r1.setColor( Color.GRAY );
        x1 = getXLocation();
        y1 = getYLocation();
    }
    
    public void mouseReleased ( java.awt.event.MouseEvent e )
    {
        r1.setColor( c1 );
        
        Piano m1 = new Piano( x1, y1 );
        m1.setColor( c1.darker() );
        
    }
    
    public void mouseDragged( java.awt.event.MouseEvent e)
    {
        Point currentPoint = e.getPoint();
        int diffX = currentPoint.x - lastMousePosition.x;
        int diffY = currentPoint.y - lastMousePosition.y;
        setLocation( getLocation().x + diffX, getLocation().y + diffY );
        lastMousePosition = currentPoint;
        
    }
    
    public static void main( String[]args )
    {
        new Frame();
        Piano p = new Piano( 50, 50 );
        Piano a = new Piano( 150, 150 );
        Piano b = new Piano( 200, 5 );
        
        p.setColor( Color.BLUE );
        a.setColor( Color.RED );
        b.setColor( Color.GREEN );
        
    }
}