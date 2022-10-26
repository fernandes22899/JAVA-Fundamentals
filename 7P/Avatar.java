import wheelsunh.users.*;
import java.awt.Color;

/** 
 * Avatar.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #7
 * 7P
 */

public class Avatar extends Crosshair
{
    //---------------- instance variables -----------------------
    private int padX = 105, padY = 123;
    private Color skin = new Color( 255, 228, 200 );
    private Rectangle pad, chest, leftLeg, rightLeg;
    private Ellipse head, leftEye, rightEye, leftPupil
        , rightPupil, leftElbow, rightElbow, leftHand
        , rightHand, mouth, mouthCover, leftThumb
        , rightThumb;
    private RoundedRectangle leftArm, rightArm, shoes;
    private Line left, right;
    // ----------------------------------------------------------
    /** Constructor for the Avatar class.
     */
    
    public Avatar( )
    {
        
    }
    
    /** method makes avatar which is called by the constructor.
     * @param x int
     * @param y int
     */
    
    public void makeAvatar( int x, int y )
    {
        
        // Avatar starts here
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
        
    }

    /** main program creates a frame and invokes the class constructor.
      * @param args String
     */
    
    public static void main( String[] args )
    {
        Frame f = new Frame();
        Avatar a = new Avatar();
    }
} //End of Class Avatar