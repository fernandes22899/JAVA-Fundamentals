import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.*;

/** 
 * AvatarSurveyor.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #7
 * 7P
 */

public class AvatarSurveyor extends Avatar
{
    private Point lastMousePoint, linePoint;
    private TextBox a, b;
    private Line l, inf, b1, b2, b3, b4;
    private int h, w, dCount, xSL, ySL, areaRec;
    private double diaLength, dragPath, aveDragLength;
    
    /** Constructor for the AvatarSurveyor class.
     */
    public AvatarSurveyor()
    {
        makeAvatar( 360, 230 );
        makeCross( 350, 250 );
        a = new TextBox( 10, 10 );
        a.setSize( 300, 30 );
        a.setColor( new Color( 0, 0, 0, 0 ) );
        b = new TextBox( 10, 25 );
        b.setSize( 300, 300 );
        b.setColor( new Color( 0, 0, 0, 0 ) );
        this.updateInfo();
        l = new Line( 365, 265, 365, 265 );
        inf = new Line( 365, 265, 365, 265 );
        b1 = new Line( 365, 265, 365, 265 );
        b2 = new Line( 365, 265, 365, 265 );
        b3 = new Line( 365, 265, 365, 265 );
        b4 = new Line( 365, 265, 365, 265 );
        
        b1.setThickness( 2 );
        b2.setThickness( 2 );
        b3.setThickness( 2 );
        b4.setThickness( 2 );
        b1.setColor( Color.RED );
        b2.setColor( Color.RED );
        b3.setColor( Color.RED );
        b4.setColor( Color.RED );
        l.setColor( Color.GREEN );
        l.setThickness( 2 );
    }
    
    /**MouseClicked method for avatar.
     * @param me MouseEvent
     */ 
    public void mouseClicked( MouseEvent me )
    {
        Point center = c.getCenter();
        l.setP1( c.getCenter() );
        b1.setP1( c.getCenter() );
        b2.setP1( c.getCenter() );
        b1.setP2( c.getCenter() );
        b2.setP2( c.getCenter() );
        b3.setP1( c.getCenter() );
        b4.setP1( c.getCenter() );
        areaRec = 0;
        dCount = 0;
        diaLength = 0.0;
        dragPath = 0.0;
        h = 0;
        w = 0;
        aveDragLength = 0.0;
        Point startLoc = new Point( l.getP1() );
        int x = startLoc.x;
        int y = startLoc.y;
        String startLocation = "Starting Location:                (" 
            + x + ", " + y + ")";
        a.setText( startLocation );
        String all = "Current Location:                (" + xSL + ", " 
            + ySL + ")" + "\n" 
            + "Diagonal Length:                " + diaLength + "\n" 
            + "Drag Path Length:              " + dragPath + "\n"
            + "Rectangle Dimensions:    " + h + "X" + w + "\n" 
            + "Rectangle Area:                  " + areaRec + "\n"
            + "Drag Count:                         " + dCount + "\n"
            + "Average Drag Length:        " + aveDragLength;
        b.setText( all );
        
    }
    
    /**MousePressed method for avatar.
     * @param me MouseEvent
     */ 
    public void mousePressed( MouseEvent me )
    {  
        lastMousePoint = me.getPoint();
        
        
    }
    
    /**Method that updates textbox info.
     */
    public void updateInfo()
    {
        linePoint = c.getCenter();
        int x = 365;
        int y = 265;
        xSL = 365;
        ySL = 265;
        h = 0;
        w = 0;
        aveDragLength = 0.0;
        String startLocation = "Starting Location:                (" + x 
            + ", " + y + ")";
        a.setText( startLocation );
        String all = "Current Location:                (" + xSL + ", " 
            + ySL + ")" + "\n" 
            + "Diagonal Length:                " + diaLength + "\n" 
            + "Drag Path Length:              " + dragPath + "\n"
            + "Rectangle Dimensions:    " + h + "X" + w + "\n" 
            + "Rectangle Area:                  " + areaRec + "\n"
            + "Drag Count:                         " + dCount + "\n"
            + "Average Drag Length:        " + aveDragLength;
        b.setText( all );
    }
    
    /**MouseDragged method for avatar.
     * @param me MouseEvent
     */ 
    public void mouseDragged( MouseEvent me )
    {
        Point currentPoint = me.getPoint();
        int dX = currentPoint.x - lastMousePoint.x;
        int dY = currentPoint.y - lastMousePoint.y;
        setLocation( getLocation().x + dX, getLocation().y + dY );
        linePoint = c.getCenter();
        int infCount = 0;
        l.setP2( linePoint );
        
        inf = new Line();
        inf.setColor( Color.BLUE );
        inf.setP2( linePoint );
        inf.setP1( linePoint );
        inf.setThickness( 2 );
        
        
        Point lp1 = new Point( l.getP1() );
        Point lp2 = new Point( l.getP2() );
        
        b1.setP1( l.getP1() );
        b1.setP2( linePoint.x, lp1.y );
        b2.setP1( l.getP1() );
        b2.setP2( lp1.x, linePoint.y );
        b3.setP1( b2.getP2() );
        b3.setP2( linePoint );
        b4.setP1( b1.getP2() );
        b4.setP2( linePoint );
        
        Point startLoc = new Point( l.getP1() );
        xSL = linePoint.x;
        ySL = linePoint.y;
        
        diaLength = Math.sqrt( Math.abs( ( lp2.x - lp1.x )^2 ) 
                                  + Math.abs( ( lp2.y - lp1.y )^2 ) );
        
        h = b2.getHeight();
        w = b1.getWidth();
        
        int lLength = ( l.getX1() );
        Point prev = new Point( c.getCenter() );
        dragPath += Math.abs( dX - dY );
            
        areaRec = ( h * w );
        
        dCount = dCount + 1;
        
        aveDragLength = dragPath / dCount ;
        
        String all = "Current Location:                (" + xSL + ", " 
            + ySL + ")" + "\n" 
            + "Diagonal Length:                " + diaLength + "\n" 
            + "Drag Path Length:              " + dragPath + "\n"
            + "Rectangle Dimensions:    " + h + "X" + w + "\n" 
            + "Rectangle Area:                  " + areaRec + "\n"
            + "Drag Count:                         " + dCount + "\n"
            + "Average Drag Length:        " + aveDragLength;
        b.setText( all );
        
        lastMousePoint = currentPoint;
    }
    
    /** main program creates a frame and invokes the class constructor.
      * @param args String
     */
    public static void main( String [] args )
    {
        new Frame();
        AvatarSurveyor a = new AvatarSurveyor();
        
    }    
}