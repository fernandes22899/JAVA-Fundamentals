import wheelsunh.users.*;
import java.awt.Color;

/** 
 * Program3.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #3
 * 3P
 */

public class Avatar extends ShapeGroup implements Seasonal
{
    //---------------- instance variables -----------------------
    private Rectangle pad1, pad2;
    private int x1 = 200, y1 = 200, 
    x2 = 400, y2 = 200;
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
    /** Constructor for the Program3 class.
     */
    public Avatar( )
    {
        pad1 = new Rectangle( x1, y1 );
        pad1.setFillColor( Color.WHITE );
        pad1.setFrameColor( Color.BLACK );
        pad1.setSize( padX, padY );
       
        pad2 = new Rectangle( x2, y2 );
        pad2.setFillColor( Color.WHITE );
        pad2.setFrameColor( Color.BLACK );
        pad2.setSize( padX, padY );
        //--------------------------------------------
        // 1st Avatar starts here

        chest = new Rectangle( x1 + 28, y1 + 40 );
        chest.setColor( Color.BLUE );
        
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
        leftArm.setColor( Color.BLUE );
        leftArm.setRotation( 1 );
        leftArm.setSize( 8, 36 );
        
        rightArm = new RoundedRectangle( x1 + 75, y1 + 40 );
        rightArm.setColor( Color.BLUE );
        rightArm.setRotation( 1 );
        rightArm.setSize( 8, 35 );
        
        leftElbow = new Ellipse( x1 + 20, y1 + 50 );
        leftElbow.setColor( Color.BLUE );
        leftElbow.setSize( 4, 20 );
        
        rightElbow = new Ellipse( x1 + 80, y1 + 50 );
        rightElbow.setColor( Color.BLUE );
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
        new Frame();
        Avatar app = new Avatar();
    }
} //End of Class Program3