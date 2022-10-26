//import wheelsunh.users.*;
import java.awt.Color;

/** 
 * P1Start.java.
 * Displays a pad for building yor personal digital Avatar.
 *
 * @author Jeffrey Fernandes
 * Assignment #1
 * 1P
 */

public class Program1 
{
    
    private Color skin = new Color( 255, 228, 200 );
    private Rectangle pad, chest, leftLeg, rightLeg;
    private Ellipse head, leftEye, rightEye, leftPupil
        , rightPupil, leftElbow, rightElbow, leftHand
        , rightHand, mouth, mouthCover, leftThumb
        , rightThumb;
    private RoundedRectangle leftArm, rightArm, shoes;
    private Line left, right;
    
    /** Constructor.
      *
      */
  
    public Program1( )
    {
        pad = new Rectangle( 200, 200 );
        pad.setFillColor( Color.WHITE );
        pad.setFrameColor( Color.BLACK );
        pad.setSize( 105, 123 );
        
        chest = new Rectangle( 228, 240 );
        chest.setFillColor( Color.BLUE );
        chest.setFrameColor( Color.BLUE );
        
        head = new Ellipse( 231, 205 );
        head.setFillColor( skin );
        head.setFrameColor( skin );
        head.setSize( 43, 45 );
        
        leftEye = new Ellipse( 241, 216 );
        leftEye.setFillColor( Color.WHITE );
        leftEye.setFrameColor( Color.GRAY );
        leftEye.setRotation( 15 );
        leftEye.setSize( 11, 16 );
        
        rightEye = new Ellipse( 252, 216 );
        rightEye.setFillColor( Color.WHITE );
        rightEye.setFrameColor( Color.GRAY );
        rightEye.setRotation( 345 );
        rightEye.setSize( 11, 16 );
        
        leftLeg = new Rectangle( 228, 284 );
        leftLeg.setFillColor( Color.BLACK );
        leftLeg.setFrameColor( Color.BLACK );
        leftLeg.setSize( 25, 25 );
        
        rightLeg = new Rectangle( 253, 284 );
        rightLeg.setFillColor( Color.BLACK );
        rightLeg.setFrameColor( Color.BLACK );
        rightLeg.setSize( 25, 25 );
        
        leftPupil = new Ellipse( 256, 222 );
        leftPupil.setFillColor( Color.BLACK );
        leftPupil.setFrameColor( Color.BLACK );
        leftPupil.setSize( 2, 2 );
        
        rightPupil = new Ellipse( 246, 222 );
        rightPupil.setFillColor( Color.BLACK );
        rightPupil.setFrameColor( Color.BLACK );
        rightPupil.setSize( 2, 2 );
        
        leftArm = new RoundedRectangle( 221, 240 );
        leftArm.setFillColor( Color.BLUE );
        leftArm.setFrameColor( Color.BLUE );
        leftArm.setRotation( 1 );
        leftArm.setSize( 8, 36 );
        
        rightArm = new RoundedRectangle( 275, 240 );
        rightArm.setFillColor( Color.BLUE );
        rightArm.setFrameColor( Color.BLUE );
        rightArm.setRotation( 1 );
        rightArm.setSize( 8, 35 );
        
        leftElbow = new Ellipse( 220, 250 );
        leftElbow.setFillColor( Color.BLUE );
        leftElbow.setFrameColor( Color.BLUE );
        leftElbow.setSize( 4, 20 );
        
        rightElbow = new Ellipse( 280, 250 );
        rightElbow.setFillColor( Color.BLUE );
        rightElbow.setFrameColor( Color.BLUE );
        rightElbow.setSize( 4, 20 );
        
        left = new Line( 230, 255, 230, 280 );
        left.setColor( Color.BLACK );
        
        right = new Line( 273, 255, 273, 280 );
        right.setColor( Color.BLACK );
        
        leftHand = new Ellipse( 220, 275 );
        leftHand.setFillColor( skin );
        leftHand.setFrameColor( skin );
        leftHand.setSize( 12, 12 );
        
        rightHand = new Ellipse( 273, 275 );
        rightHand.setFillColor( skin );
        rightHand.setFrameColor( skin );
        rightHand.setSize( 12, 12 );
        
        mouth = new Ellipse( 247, 235 );
        mouth.setFillColor( Color.BLACK );
        mouth.setFrameColor( Color.BLACK );
        mouth.setSize( 10, 5 );
        
        mouthCover = new Ellipse( 247, 234 );
        mouthCover.setFillColor( skin );
        mouthCover.setFrameColor( skin );
        mouthCover.setSize( 10, 5 );
        
        shoes = new RoundedRectangle( 252, 280 );
        shoes.setFillColor( Color.BLACK );
        shoes.setFrameColor( Color.BLACK );
        shoes.setRotation( 90 );
        shoes.setSize( 2, 56 );
        
        leftThumb = new Ellipse( 226, 277 );
        leftThumb.setFrameColor( Color.BLACK );
        leftThumb.setFillColor( skin );
        leftThumb.setSize( 5, 5 );
        
        rightThumb = new Ellipse( 273, 277 );
        rightThumb.setFrameColor( Color.BLACK );
        rightThumb.setFillColor( skin );
        rightThumb.setSize( 5, 5 );
        
    } 
    
    // -----------------------------------------------------------------
    /** main program creates a Frame and invokes the class constructor.
      * 
      *  @param args String
      */
    public static void main( String[] args )
    {
        Frame f = new Frame( );
        Program1 app = new Program1( );
    }
} //End of Class P1Start