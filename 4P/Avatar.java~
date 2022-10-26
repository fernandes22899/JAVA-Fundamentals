import wheelsunh.users.*;
import java.awt.Color;

/** 
 * Avatar.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #4
 * 4P
 */

public class Avatar
{
    //---------------- instance variables -------------------
    private int xLocate, yLocate;
    private int padX = 105, padY = 123;
    private Color skin = new Color( 255, 228, 200 );
    private Rectangle pad, chest, leftLeg, rightLeg;
    private Ellipse head, leftEye, rightEye, leftPupil
        , rightPupil, leftElbow, rightElbow, leftHand
        , rightHand, mouth, mouthCover, leftThumb
        , rightThumb;
    private RoundedRectangle leftArm, rightArm, shoes;
    private Line left, right;
    
    /** Constructor for the Avatar class that calls Avatars.
     */
    
    public Avatar()
    {
        makeAvatarDefault();
    }
    
    /** Constructor for the Avatar class that calls Avatar with x & y value.
      * @param x int
      * @param y int
     */
    
    public Avatar( int x, int y )
    {
        xLocate = x;
        yLocate = y;
        makeAvatarPut( x, y );
        
    }
    
    /** Constructor for the Avatar class that calls Avatar with color.
      * @param c Color
     */
    
    public Avatar( Color c )
    {
        makeAvatarColor( c );
    }
    
    //--------------------------------------------------------
    /**Methods for Avatar.
      * This method sets the location
      * @param x int
      * @param y int
     */
    
    public void setLocation( int x, int y )
    {   
        xLocate = x;
        yLocate = y;
        makeAvatarPut( x, y );
        
        //setLocation( x, y );
    }
    
     /**Method sets color for avatars.
      * @param c Color
     */
    
    public void setColor( Color c )
    {
        makeAvatarColor( Color.RED );
    }
    
    /**Method moves up an avatar.
      * @param y int
     */
    
    public void moveUp( int y )
    {
        this.setLocation( xLocate, yLocate - y );
    }
    
    //---------------------------------------------------
    /**First Accessors for Avatar that returns a color.
      *@return tag
     */
    
    public Color getColor()
    {
        return Color.BLACK;
    }
    
    /**Second Accessors for Avatar that gets X location.
      *@return tag
     */
    
    public int getXLocation()
    {
        return xLocate;
    }
    
    /**Third Accessors for Avatar that gets Y location.
      *@return tag
     */
    
    public int getYLocation()
    {
        return yLocate;
    }
    
    /**Method makes avatar which is called by the constructor.
     * @param x int
     * @param y int
     */
    
    public void makeAvatarPut( int x, int y )
    {
        
        // Avatar starts here
        chest = new Rectangle( x + 28, y + 40 );
        chest.setColor( Color.BLUE );
        
        head = new Ellipse( x + 31, y + 5 );
        head.setColor( skin );
        head.setSize( 43, 45 );
        
        leftEye = new Ellipse( x + 41, y + 16 );
        leftEye.setFillColor( Color.WHITE );
        leftEye.setFrameColor( Color.GRAY );
        leftEye.setRotation( 15 );
        leftEye.setSize( 11, 16 );
        
        rightEye = new Ellipse( x + 52, y + 16 );
        rightEye.setFillColor( Color.WHITE );
        rightEye.setFrameColor( Color.GRAY );
        rightEye.setRotation( 345 );
        rightEye.setSize( 11, 16 );
        
        leftLeg = new Rectangle( x + 28, y + 84 );
        leftLeg.setColor( Color.BLACK );
        leftLeg.setSize( 25, 25 );
        
        rightLeg = new Rectangle( x + 53, y + 84 );
        rightLeg.setColor( Color.BLACK );
        rightLeg.setSize( 25, 25 );
        
        leftPupil = new Ellipse( x + 56, y + 22 );
        leftPupil.setColor( Color.BLACK );
        leftPupil.setSize( 2, 2 );
        
        rightPupil = new Ellipse( x + 46, y + 22 );
        rightPupil.setColor( Color.BLACK );
        rightPupil.setSize( 2, 2 );
        
        leftArm = new RoundedRectangle( x + 21, y + 40 );
        leftArm.setColor( Color.BLUE );
        leftArm.setRotation( 1 );
        leftArm.setSize( 8, 36 );
        
        rightArm = new RoundedRectangle( x + 75, y + 40 );
        rightArm.setColor( Color.BLUE );
        rightArm.setRotation( 1 );
        rightArm.setSize( 8, 35 );
        
        leftElbow = new Ellipse( x + 20, y + 50 );
        leftElbow.setColor( Color.BLUE );
        leftElbow.setSize( 4, 20 );
        
        rightElbow = new Ellipse( x + 80, y + 50 );
        rightElbow.setColor( Color.BLUE );
        rightElbow.setSize( 4, 20 );
        
        left = new Line( x + 30, y + 55, x + 30, y + 80 );
        left.setColor( Color.BLACK );
        
        right = new Line( x + 73, y + 55, x + 73, y + 80 );
        right.setColor( Color.BLACK );
        
        leftHand = new Ellipse( x + 20, y + 75 );
        leftHand.setColor( skin );
        leftHand.setSize( 12, 12 );
        
        rightHand = new Ellipse( x + 73, y + 75 );
        rightHand.setColor( skin );
        rightHand.setSize( 12, 12 );
        
        mouth = new Ellipse( x + 47, y + 35 );
        mouth.setColor( Color.BLACK );
        mouth.setSize( 10, 5 );
        
        mouthCover = new Ellipse( x + 47, y + 34 );
        mouthCover.setColor( skin );
        mouthCover.setSize( 10, 5 );
        
        shoes = new RoundedRectangle( x + 52, y + 80 );
        shoes.setColor( Color.BLACK );
        shoes.setRotation( 90 );
        shoes.setSize( 2, 56 );
        
        leftThumb = new Ellipse( x + 26, y + 77 );
        leftThumb.setFrameColor( Color.BLACK );
        leftThumb.setFillColor( skin );
        leftThumb.setSize( 5, 5 );
        
        rightThumb = new Ellipse( x + 73, y + 77 );
        rightThumb.setFrameColor( Color.BLACK );
        rightThumb.setFillColor( skin );
        rightThumb.setSize( 5, 5 );
    }
    
    /** Makes avatar with color called by a constructor.
     *  @param c Color
     */
    
    public void makeAvatarColor( Color c )
    {
        int x = 0, y = 0; 
        
        // Avatar starts here
        chest = new Rectangle( x + 28, y + 40 );
        chest.setColor( c );
        
        head = new Ellipse( x + 31, y + 5 );
        head.setColor( skin );
        head.setSize( 43, 45 );
        
        leftEye = new Ellipse( x + 41, y + 16 );
        leftEye.setFillColor( Color.WHITE );
        leftEye.setFrameColor( Color.GRAY );
        leftEye.setRotation( 15 );
        leftEye.setSize( 11, 16 );
        
        rightEye = new Ellipse( x + 52, y + 16 );
        rightEye.setFillColor( Color.WHITE );
        rightEye.setFrameColor( Color.GRAY );
        rightEye.setRotation( 345 );
        rightEye.setSize( 11, 16 );
        
        leftLeg = new Rectangle( x + 28, y + 84 );
        leftLeg.setColor( Color.BLACK );
        leftLeg.setSize( 25, 25 );
        
        rightLeg = new Rectangle( x + 53, y + 84 );
        rightLeg.setColor( Color.BLACK );
        rightLeg.setSize( 25, 25 );
        
        leftPupil = new Ellipse( x + 56, y + 22 );
        leftPupil.setColor( Color.BLACK );
        leftPupil.setSize( 2, 2 );
        
        rightPupil = new Ellipse( x + 46, y + 22 );
        rightPupil.setColor( Color.BLACK );
        rightPupil.setSize( 2, 2 );
        
        leftArm = new RoundedRectangle( x + 21, y + 40 );
        leftArm.setColor( c );
        leftArm.setRotation( 1 );
        leftArm.setSize( 8, 36 );
        
        rightArm = new RoundedRectangle( x + 75, y + 40 );
        rightArm.setColor( c );
        rightArm.setRotation( 1 );
        rightArm.setSize( 8, 35 );
        
        leftElbow = new Ellipse( x + 20, y + 50 );
        leftElbow.setColor( c );
        leftElbow.setSize( 4, 20 );
        
        rightElbow = new Ellipse( x + 80, y + 50 );
        rightElbow.setColor( c );
        rightElbow.setSize( 4, 20 );
        
        left = new Line( x + 30, y + 55, x + 30, y + 80 );
        left.setColor( Color.BLACK );
        
        right = new Line( x + 73, y + 55, x + 73, y + 80 );
        right.setColor( Color.BLACK );
        
        leftHand = new Ellipse( x + 20, y + 75 );
        leftHand.setColor( skin );
        leftHand.setSize( 12, 12 );
        
        rightHand = new Ellipse( x + 73, y + 75 );
        rightHand.setColor( skin );
        rightHand.setSize( 12, 12 );
        
        mouth = new Ellipse( x + 47, y + 35 );
        mouth.setColor( Color.BLACK );
        mouth.setSize( 10, 5 );
        
        mouthCover = new Ellipse( x + 47, y + 34 );
        mouthCover.setColor( skin );
        mouthCover.setSize( 10, 5 );
        
        shoes = new RoundedRectangle( x + 52, y + 80 );
        shoes.setColor( Color.BLACK );
        shoes.setRotation( 90 );
        shoes.setSize( 2, 56 );
        
        leftThumb = new Ellipse( x + 26, y + 77 );
        leftThumb.setFrameColor( Color.BLACK );
        leftThumb.setFillColor( skin );
        leftThumb.setSize( 5, 5 );
        
        rightThumb = new Ellipse( x + 73, y + 77 );
        rightThumb.setFrameColor( Color.BLACK );
        rightThumb.setFillColor( skin );
        rightThumb.setSize( 5, 5 );
    }
    
    /**Method makes a default Avatar called by a contructor.
     */
    
    public void makeAvatarDefault()
    {
        int x = 0, y = 0; 
        
        // Avatar starts here
        chest = new Rectangle( x + 28, y + 40 );
        chest.setColor( Color.BLUE );
        
        head = new Ellipse( x + 31, y + 5 );
        head.setColor( skin );
        head.setSize( 43, 45 );
        
        leftEye = new Ellipse( x + 41, y + 16 );
        leftEye.setFillColor( Color.WHITE );
        leftEye.setFrameColor( Color.GRAY );
        leftEye.setRotation( 15 );
        leftEye.setSize( 11, 16 );
        
        rightEye = new Ellipse( x + 52, y + 16 );
        rightEye.setFillColor( Color.WHITE );
        rightEye.setFrameColor( Color.GRAY );
        rightEye.setRotation( 345 );
        rightEye.setSize( 11, 16 );
        
        leftLeg = new Rectangle( x + 28, y + 84 );
        leftLeg.setColor( Color.BLACK );
        leftLeg.setSize( 25, 25 );
        
        rightLeg = new Rectangle( x + 53, y + 84 );
        rightLeg.setColor( Color.BLACK );
        rightLeg.setSize( 25, 25 );
        
        leftPupil = new Ellipse( x + 56, y + 22 );
        leftPupil.setColor( Color.BLACK );
        leftPupil.setSize( 2, 2 );
        
        rightPupil = new Ellipse( x + 46, y + 22 );
        rightPupil.setColor( Color.BLACK );
        rightPupil.setSize( 2, 2 );
        
        leftArm = new RoundedRectangle( x + 21, y + 40 );
        leftArm.setColor( Color.BLUE );
        leftArm.setRotation( 1 );
        leftArm.setSize( 8, 36 );
        
        rightArm = new RoundedRectangle( x + 75, y + 40 );
        rightArm.setColor( Color.BLUE );
        rightArm.setRotation( 1 );
        rightArm.setSize( 8, 35 );
        
        leftElbow = new Ellipse( x + 20, y + 50 );
        leftElbow.setColor( Color.BLUE );
        leftElbow.setSize( 4, 20 );
        
        rightElbow = new Ellipse( x + 80, y + 50 );
        rightElbow.setColor( Color.BLUE );
        rightElbow.setSize( 4, 20 );
        
        left = new Line( x + 30, y + 55, x + 30, y + 80 );
        left.setColor( Color.BLACK );
        
        right = new Line( x + 73, y + 55, x + 73, y + 80 );
        right.setColor( Color.BLACK );
        
        leftHand = new Ellipse( x + 20, y + 75 );
        leftHand.setColor( skin );
        leftHand.setSize( 12, 12 );
        
        rightHand = new Ellipse( x + 73, y + 75 );
        rightHand.setColor( skin );
        rightHand.setSize( 12, 12 );
        
        mouth = new Ellipse( x + 47, y + 35 );
        mouth.setColor( Color.BLACK );
        mouth.setSize( 10, 5 );
        
        mouthCover = new Ellipse( x + 47, y + 34 );
        mouthCover.setColor( skin );
        mouthCover.setSize( 10, 5 );
        
        shoes = new RoundedRectangle( x + 52, y + 80 );
        shoes.setColor( Color.BLACK );
        shoes.setRotation( 90 );
        shoes.setSize( 2, 56 );
        
        leftThumb = new Ellipse( x + 26, y + 77 );
        leftThumb.setFrameColor( Color.BLACK );
        leftThumb.setFillColor( skin );
        leftThumb.setSize( 5, 5 );
        
        rightThumb = new Ellipse( x + 73, y + 77 );
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
        //Testing default Avatar
        Avatar a = new Avatar();
        //Testing Color Parameter Avatar
        Avatar b = new Avatar( Color.YELLOW );
        //Testing Two Parameter Avatar
        Avatar c = new Avatar( 30, 150 );
        //Testing setColor Mutator with Avatar b
        b.setColor( Color.RED );
        //Testing setLocation Mutator with Avatar a
        a.setLocation( 100, 50 );
        //Testing getXLocation accessor with Avatar c
        c.getXLocation();
        //testing getYLocation accessor with Avatar c
        c.getYLocation();
        //Testing moveUp accessor with Avatar c
        c.moveUp( -70 );
        
    }
} //End of Class Avatar