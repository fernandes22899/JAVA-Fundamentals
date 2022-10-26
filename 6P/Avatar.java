import wheelsunh.users.*;
import java.awt.Color;
import java.awt.Point;

/** 
 * Avatar.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #6
 * 6P
 */

public class Avatar extends ShapeGroup implements Seasonal
{
    //---------------- instance variables -----------------------
    private Rectangle pad1, pad2;
    private int x1, y1, x2, y2;
    private int padX = 105, padY = 123;
    private Color skin = new Color( 255, 228, 200 );
    private Rectangle pad, chest, leftLeg, rightLeg
        , shorts;
    protected Ellipse head, leftEye, rightEye, leftPupil
        , rightPupil, leftElbow, rightElbow, leftHand
        , rightHand, mouth, mouthCover, leftThumb
        , rightThumb, sunglasses1, sunglasses2
        , hat1, hat2, hat3;
    private RoundedRectangle leftArm, rightArm, shoes;
    private Line left, right, s1, s2;
    private Point lastMousePosition;
    // ----------------------------------------------------------
    /** Constructor for the Program3 class.
      * @param x int
      * @param y int
     */
    public Avatar( int x, int y )
    {
        avatar( x, y );
        winter();
    } 
    
    /**Mathod for spring from seasonal.
     */
    
    public void spring()
    {
        sunglasses1.show();
        sunglasses2.show();
        s1.show();
        s2.show();
        leftElbow.setColor( skin );
        rightElbow.setColor( skin );
        leftArm.setColor( skin );
        rightArm.setColor( skin );
        chest.setColor( Color.RED );
        hat1.hide();
        hat2.hide();
        hat3.hide();
        leftHand.setColor( skin );
        rightHand.setColor( skin );
        leftThumb.setColor( skin );
        rightThumb.setColor( skin );
        shorts.show();
        
    }
    
    /**Mathod for winter from seasonal.
     */

    public void winter()
    {
        shorts.hide();
        leftHand.setColor( Color.BLACK );
        rightHand.setColor( Color.BLACK );
        leftThumb.setColor( Color.BLACK );
        rightThumb.setColor( Color.BLACK );
        chest.setColor( Color.BLUE );
        leftArm.setColor( Color.BLUE );
        rightArm.setColor( Color.BLUE );
        leftElbow.setColor( Color.BLUE );
        rightElbow.setColor( Color.BLUE );
        hat1.show();
        hat2.show();
        hat3.show();
        sunglasses1.hide();
        sunglasses2.hide();
        s1.hide();
        s2.hide();
        
    }
    
    /**Mathod for summer from seasonal.
     */
    
    public void summer()
    {
        
        leftElbow.setColor( skin );
        rightElbow.setColor( skin );
        leftArm.setColor( skin );
        rightArm.setColor( skin );
        chest.setColor( skin );
        shoes.setColor( skin );
        leftLeg.setColor( Color.RED );
        rightLeg.setColor( Color.RED );
        hat1.hide();
        hat2.hide();
        hat3.hide();
        leftHand.setColor( skin );
        rightHand.setColor( skin );
        leftThumb.setColor( skin );
        rightThumb.setColor( skin );
    }
    
    /**Mathod for fall from seasonal.
     */
    
    public void fall()
    {
        sunglasses1.hide();
        sunglasses2.hide();
        s1.hide();
        s2.hide();
        chest.setColor( Color.PINK );
        leftArm.setColor( Color.PINK );
        rightArm.setColor( Color.PINK );
        leftElbow.setColor( Color.PINK );
        rightElbow.setColor( Color.PINK );
        shorts.hide();
        sunglasses1.hide();
        sunglasses2.hide();
        s1.hide();
        s2.hide();
        hat1.hide();
        hat2.hide();
        hat3.hide();
        leftLeg.setColor( Color.BLACK );
        rightLeg.setColor( Color.BLACK );
        shoes.setColor( Color.BLACK );
    }
    
    /**Method that finds first point.
     * @param e java.awt.event.MouseEvent
     */
    
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        lastMousePosition = e.getPoint();
        x1 = getXLocation();
        y1 = getYLocation();
    }
    
    /**Method that finds last point.
     * @param e java.awt.event.MouseEvent
     */
        
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        x2 = getXLocation();
        y2 = getYLocation();
    }
        
    /**Method that makes avatar draggable.
     * @param e java.awt.event.MouseEvent
     */
    
    public void mouseDragged( java.awt.event.MouseEvent e )
    {
        Point currentPoint = e.getPoint();
        int diffX = currentPoint.x - lastMousePosition.x;
        int diffY = currentPoint.y - lastMousePosition.y;
        setLocation( getLocation().x + diffX, getLocation().y + diffY );
        lastMousePosition = currentPoint;
    }
    
    /**Method that makes avatar.
     * @param x int
     * @param y int
     */
    
    public void avatar( int x, int y )
    {
        
        // 1st Avatar starts here
        chest = new Rectangle( x + 28, y + 40 );
        chest.setColor( Color.BLUE );
        add( chest );
        
        head = new Ellipse( x + 31, y + 5 );
        head.setColor( skin );
        head.setSize( 43, 45 );
        add( head );
        
        leftEye = new Ellipse( x + 41, y + 16 );
        leftEye.setFillColor( Color.WHITE );
        leftEye.setFrameColor( Color.GRAY );
        leftEye.setRotation( 15 );
        leftEye.setSize( 11, 16 );
        add( leftEye );
        
        rightEye = new Ellipse( x + 52, y + 16 );
        rightEye.setFillColor( Color.WHITE );
        rightEye.setFrameColor( Color.GRAY );
        rightEye.setRotation( 345 );
        rightEye.setSize( 11, 16 );
        add( rightEye );
        
        leftLeg = new Rectangle( x + 28, y + 84 );
        leftLeg.setColor( Color.BLACK );
        leftLeg.setSize( 25, 25 );
        add( leftLeg );
        
        rightLeg = new Rectangle( x + 53, y + 84 );
        rightLeg.setColor( Color.BLACK );
        rightLeg.setSize( 25, 25 );
        add( rightLeg );
        
        leftPupil = new Ellipse( x + 56, y + 22 );
        leftPupil.setColor( Color.BLACK );
        leftPupil.setSize( 2, 2 );
        add( leftPupil );
        
        rightPupil = new Ellipse( x + 46, y + 22 );
        rightPupil.setColor( Color.BLACK );
        rightPupil.setSize( 2, 2 );
        add( rightPupil );
        
        leftArm = new RoundedRectangle( x + 21, y + 40 );
        leftArm.setColor( Color.BLUE );
        leftArm.setRotation( 1 );
        leftArm.setSize( 8, 36 );
        add( leftArm );
        
        rightArm = new RoundedRectangle( x + 75, y + 40 );
        rightArm.setColor( Color.BLUE );
        rightArm.setRotation( 1 );
        rightArm.setSize( 8, 35 );
        add( rightArm );
        
        leftElbow = new Ellipse( x + 20, y + 50 );
        leftElbow.setColor( Color.BLUE );
        leftElbow.setSize( 4, 20 );
        add( leftElbow );
        
        rightElbow = new Ellipse( x + 80, y + 50 );
        rightElbow.setColor( Color.BLUE );
        rightElbow.setSize( 4, 20 );
        add( rightElbow );
        
        left = new Line( x + 30, y + 55, x + 30, y + 80 );
        left.setColor( Color.BLACK );
        add( left );
        
        right = new Line( x + 73, y + 55, x + 73, y + 80 );
        right.setColor( Color.BLACK );
        add( right );
        
        leftHand = new Ellipse( x + 20, y + 75 );
        leftHand.setColor( skin );
        leftHand.setSize( 12, 12 );
        add( leftHand );
        
        rightHand = new Ellipse( x + 73, y + 75 );
        rightHand.setColor( skin );
        rightHand.setSize( 12, 12 );
        add( rightHand );
        
        mouth = new Ellipse( x + 47, y + 35 );
        mouth.setColor( Color.BLACK );
        mouth.setSize( 10, 5 );
        add( mouth );
        
        mouthCover = new Ellipse( x + 47, y + 34 );
        mouthCover.setColor( skin );
        mouthCover.setSize( 10, 5 );
        add( mouthCover );
        
        shoes = new RoundedRectangle( x + 52, y + 80 );
        shoes.setColor( Color.BLACK );
        shoes.setRotation( 90 );
        shoes.setSize( 2, 56 );
        add( shoes );
        leftThumb = new Ellipse( x + 26, y + 77 );
        leftThumb.setFrameColor( Color.BLACK );
        leftThumb.setFillColor( skin );
        leftThumb.setSize( 5, 5 );
        add( leftThumb );
        rightThumb = new Ellipse( x + 73, y + 77 );
        rightThumb.setFrameColor( Color.BLACK );
        rightThumb.setFillColor( skin );
        rightThumb.setSize( 5, 5 );
        add( rightThumb );
        shorts = new Rectangle( x + 28, y + 98 );
        shorts.setColor( skin );
        shorts.setSize( 50, 8 );
        add( shorts );
        sunglasses1 = new Ellipse( x + 38, y + 17 );
        sunglasses1.setColor( Color.BLACK );
        sunglasses1.setSize( 14, 14 );
        add( sunglasses1 );
        sunglasses2 = new Ellipse( x + 52, y + 17 );
        sunglasses2.setColor( Color.BLACK );
        sunglasses2.setSize( 14, 14 );
        add( sunglasses2 );
        s1 = new Line( x + 30, y + 12, x + 43, y + 20 );
        s1.setColor( Color.BLACK );
        add( s1 );
        s2 = new Line( x + 75, y + 12, x + 63, y + 20 );
        s2.setColor( Color.BLACK );
        add( s2 );
        hat3 = new Ellipse( x + 34, y + 5 );
        hat3.setFrameColor( Color.BLACK );
        hat3.setFillColor( Color.RED );
        hat3.setSize( 35, 13 );
        add( hat3 );
        hat1 = new Ellipse( x + 29, y + 7 );
        hat1.setFrameColor( Color.BLACK );
        hat1.setFillColor( Color.RED );
        hat1.setSize( 10, 28 );
        add( hat1 );
        hat2 = new Ellipse( x + 64, y + 7 );
        hat2.setFrameColor( Color.BLACK );
        hat2.setFillColor( Color.RED );
        hat2.setSize( 10, 28 );
        add( hat2 );
    }
    /** main program creates a frame and invokes the class constructor.
      * @param args String
     */
    public static void main( String[] args )
    {
        new Frame();
        Avatar app = new Avatar( 200, 250 );
    }
} //End of Class Avatar