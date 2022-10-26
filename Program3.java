import wheelsunh.users.*;
import java.awt.Color;

/** 
 * Avatar.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #3
 * 3P
 */

public class Avatar
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
        makeAvatar( 0, 0, Color.RED );
        makeAvatar( 120, 100, Color.GRAY );
        makeAvatar( 220, 0, Color.CYAN );
        makeAvatar( 310, 30, Color.BLACK );
    }
    
    /** method makes avatar which is called by the constructor.
     * @param x int
     * @param y int
     * @param c Color
     */
    
    public void makeAvatar( int x, int y, Color c )
    {
        int x1 = x + 200, y1 = y + 200; 
        int x2 = x + 400, y2 = y + 200;
        
        // Avatar starts here
        chest = new Rectangle( x1 + 28, y1 + 40 );
        chest.setColor( c );
        
        head = new Ellipse( x1 + 31, y1 + 5 );
        head.setColor( skin );
        head.setSize( 43, 45 );
        
        leftEye = new Ellipse( x1 + 41, y1 + 16 );
        leftEye.setFillColor( Color.WHITE );
        leftEye.setFrameColor( Color.GRAY );
        leftEye.setRotation( 15 );
        leftEye.setSize( 11, 16 );
        
        rightEye = new Ellipse( x1 + 52, y1 + 16 );
        rightEye.setFillColor( Color.WHITE );
        rightEye.setFrameColor( Color.GRAY );
        rightEye.setRotation( 345 );
        rightEye.setSize( 11, 16 );
        
        leftLeg = new Rectangle( x1 + 28, y1 + 84 );
        leftLeg.setColor( Color.BLACK );
        leftLeg.setSize( 25, 25 );
        
        rightLeg = new Rectangle( x1 + 53, y1 + 84 );
        rightLeg.setColor( Color.BLACK );
        rightLeg.setSize( 25, 25 );
        
        leftPupil = new Ellipse( x1 + 56, y1 + 22 );
        leftPupil.setColor( Color.BLACK );
        leftPupil.setSize( 2, 2 );
        
        rightPupil = new Ellipse( x1 + 46, y1 + 22 );
        rightPupil.setColor( Color.BLACK );
        rightPupil.setSize( 2, 2 );
        
        leftArm = new RoundedRectangle( x1 + 21, y1 + 40 );
        leftArm.setColor( c );
        leftArm.setRotation( 1 );
        leftArm.setSize( 8, 36 );
        
        rightArm = new RoundedRectangle( x1 + 75, y1 + 40 );
        rightArm.setColor( c );
        rightArm.setRotation( 1 );
        rightArm.setSize( 8, 35 );
        
        leftElbow = new Ellipse( x1 + 20, y1 + 50 );
        leftElbow.setColor( c );
        leftElbow.setSize( 4, 20 );
        
        rightElbow = new Ellipse( x1 + 80, y1 + 50 );
        rightElbow.setColor( c );
        rightElbow.setSize( 4, 20 );
        
        left = new Line( x1 + 30, y1 + 55, x1 + 30, y1 + 80 );
        left.setColor( Color.BLACK );
        
        right = new Line( x1 + 73, y1 + 55, x1 + 73, y1 + 80 );
        right.setColor( Color.BLACK );
        
        leftHand = new Ellipse( x1 + 20, y1 + 75 );
        leftHand.setColor( skin );
        leftHand.setSize( 12, 12 );
        
        rightHand = new Ellipse( x1 + 73, y1 + 75 );
        rightHand.setColor( skin );
        rightHand.setSize( 12, 12 );
        
        mouth = new Ellipse( x1 + 47, y1 + 35 );
        mouth.setColor( Color.BLACK );
        mouth.setSize( 10, 5 );
        
        mouthCover = new Ellipse( x1 + 47, y1 + 34 );
        mouthCover.setColor( skin );
        mouthCover.setSize( 10, 5 );
        
        shoes = new RoundedRectangle( x1 + 52, y1 + 80 );
        shoes.setColor( Color.BLACK );
        shoes.setRotation( 90 );
        shoes.setSize( 2, 56 );
        
        leftThumb = new Ellipse( x1 + 26, y1 + 77 );
        leftThumb.setFrameColor( Color.BLACK );
        leftThumb.setFillColor( skin );
        leftThumb.setSize( 5, 5 );
        
        rightThumb = new Ellipse( x1 + 73, y1 + 77 );
        rightThumb.setFrameColor( Color.BLACK );
        rightThumb.setFillColor( skin );
        rightThumb.setSize( 5, 5 );
        
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