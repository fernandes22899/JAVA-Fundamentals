import wheelsunh.users.*;
import java.awt.Color;

/** 
 * Avatar.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #5
 * 5P
 */
public class Avatar extends ShapeGroup
{
    //---------------- instance variables -----------------------
    protected Color skin = new Color( 255, 228, 200 );
    protected Color c;
    protected Rectangle pad, chest, leftLeg, rightLeg;
    protected Ellipse head, leftEye, rightEye, leftPupil
        , rightPupil, leftElbow, rightElbow, leftHand
        , rightHand, mouth, mouthCover, leftThumb
        , rightThumb;
    protected RoundedRectangle leftArm, rightArm, shoes;
    protected Line left, right;
    protected RoundedRectangle rr1, rr2;
    protected Line b, e , h1, h2;
    // ----------------------------------------------------------
    
    /** Constructor for the Avatar class.
      * @param x int
      * @param y int
     */
    public Avatar( int x, int y )
    {
        makeAvatar( x, y );
        sunglasses( x + 40, y + 19 );
        
    }
    
    /**Contructor for Avatar with color.
     * @param c Color
     */
    public Avatar( Color c )
    {
        makeAvatarColor( c );
    }
    
    /**Method when mouse is pressed.
     * @param e java.awt.event.MouseEvent
     */
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        chest.setColor( Color.BLACK );
    }
    
    /**Method when mouse is released.
     * @param e java.awt.event.MouseEvent
     */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        chest.setColor( c );
    }
    
    /**Method that activates certain instance variables.
     */ 
    public void activate()
    {
        
        rr1.show();
        rr2.show();
        e.show();
        h1.show();
        h2.show();
    }
    
    /**Method that deactivates certain instance variables.
     */ 
    public void deactivate()
    {
        
        rr1.hide();
        rr2.hide();
        e.hide();
        h1.hide();
        h2.hide();
    }
    
    /**Method that sets color.
     * @param chest Color
     */
    public void setColor( Color chest )
    {
        c = chest;
        this.chest.setColor( c );
    }
    
    /**Accessor that returns c.
      * @return c
     */
    public Color getColor()
    {
        return c;
    }
    
    /**Method that makes sunglasses.
     * @param x int
     * @param y int
     */
    public void sunglasses( int x, int y )
    {
        rr1 = new RoundedRectangle( x, y );
        rr1.setColor( Color.BLACK );
        rr1.setSize( 11, 11 );
        rr1.hide();
        this.add( rr1 );
        rr2 = new RoundedRectangle( x + 14, y );
        rr2.setColor( Color.BLACK );
        rr2.setSize( 11, 11 );
        rr2.hide();
        this.add( rr2 );
        e = new Line( x + 2, y + 3, x + 15, y + 3 );
        e.setColor( Color.BLACK );
        e.hide();
        this.add( e );
        h1 = new Line( x + 2, y + 3, x - 8, y - 3 );
        h1.setColor( Color.BLACK );
        h1.hide();
        this.add( h1 );
        h2 = new Line( x + 25, y + 3, x + 31, y - 3 );
        h2.setColor( Color.BLACK );
        h2.hide();
        this.add( h2 );
        
    }
    
    /** method makes avatar which is called by the constructor.
     * @param x int
     * @param y int
     */
    public void makeAvatar( int x, int y )
    {
        
        // Avatar starts here
        chest = new Rectangle( x + 28, y + 40 );
        chest.setColor( Color.BLACK );
        this.add( chest );
        
        head = new Ellipse( x + 31, y + 5 );
        head.setColor( skin );
        head.setSize( 43, 45 );
        this.add( head );
        
        leftEye = new Ellipse( x + 41, y + 16 );
        leftEye.setFillColor( Color.WHITE );
        leftEye.setFrameColor( Color.GRAY );
        leftEye.setRotation( 15 );
        leftEye.setSize( 11, 16 );
        this.add( leftEye );
        
        rightEye = new Ellipse( x + 52, y + 16 );
        rightEye.setFillColor( Color.WHITE );
        rightEye.setFrameColor( Color.GRAY );
        rightEye.setRotation( 345 );
        rightEye.setSize( 11, 16 );
        this.add( rightEye );
        
        leftLeg = new Rectangle( x + 28, y + 84 );
        leftLeg.setColor( Color.BLACK );
        leftLeg.setSize( 25, 25 );
        this.add( leftLeg );
        
        rightLeg = new Rectangle( x + 53, y + 84 );
        rightLeg.setColor( Color.BLACK );
        rightLeg.setSize( 25, 25 );
        this.add( rightLeg );
        
        leftPupil = new Ellipse( x + 56, y + 22 );
        leftPupil.setColor( Color.BLACK );
        leftPupil.setSize( 2, 2 );
        this.add( leftPupil );
        
        rightPupil = new Ellipse( x + 46, y + 22 );
        rightPupil.setColor( Color.BLACK );
        rightPupil.setSize( 2, 2 );
        this.add( rightPupil );
        
        leftArm = new RoundedRectangle( x + 21, y + 40 );
        leftArm.setColor( Color.BLACK );
        leftArm.setRotation( 1 );
        leftArm.setSize( 8, 36 );
        this.add( leftArm );
        
        rightArm = new RoundedRectangle( x + 75, y + 40 );
        rightArm.setColor( Color.BLACK );
        rightArm.setRotation( 1 );
        rightArm.setSize( 8, 35 );
        this.add( rightArm );
        
        leftElbow = new Ellipse( x + 20, y + 50 );
        leftElbow.setColor( Color.BLACK );
        leftElbow.setSize( 4, 20 );
        this.add( leftElbow );
        
        rightElbow = new Ellipse( x + 80, y + 50 );
        rightElbow.setColor( Color.BLACK );
        rightElbow.setSize( 4, 20 );
        this.add( rightElbow );
        
        left = new Line( x + 30, y + 55, x + 30, y + 80 );
        left.setColor( Color.BLACK );
        this.add( left );
        
        right = new Line( x + 74, y + 55, x + 74, y + 80 );
        right.setColor( Color.BLACK );
        this.add( right );
        
        leftHand = new Ellipse( x + 20, y + 75 );
        leftHand.setColor( skin );
        leftHand.setSize( 12, 12 );
        this.add( leftHand );
        
        rightHand = new Ellipse( x + 73, y + 75 );
        rightHand.setColor( skin );
        rightHand.setSize( 12, 12 );
        this.add( rightHand );
        
        mouth = new Ellipse( x + 47, y + 35 );
        mouth.setColor( Color.BLACK );
        mouth.setSize( 10, 5 );
        this.add( mouth );
        
        mouthCover = new Ellipse( x + 47, y + 34 );
        mouthCover.setColor( skin );
        mouthCover.setSize( 10, 5 );
        this.add( mouthCover );
        
        shoes = new RoundedRectangle( x + 52, y + 80 );
        shoes.setColor( Color.BLACK );
        shoes.setRotation( 90 );
        shoes.setSize( 2, 56 );
        this.add( shoes );
        
        leftThumb = new Ellipse( x + 26, y + 77 );
        leftThumb.setFrameColor( Color.BLACK );
        leftThumb.setFillColor( skin );
        leftThumb.setSize( 5, 5 );
        this.add( leftThumb );
        
        rightThumb = new Ellipse( x + 73, y + 77 );
        rightThumb.setFrameColor( Color.BLACK );
        rightThumb.setFillColor( skin );
        rightThumb.setSize( 5, 5 );
        this.add( rightThumb );
        
    }
    
    /**Method called by constructor with color.
     * @param c Color
     */
    public void makeAvatarColor( Color c )
    {
        int x = 0, y = 0; 
        
        // Avatar starts here
        chest = new Rectangle( x + 28, y + 40 );
        chest.setColor( c );
        this.add( chest );
        
        head = new Ellipse( x + 31, y + 5 );
        head.setColor( skin );
        head.setSize( 43, 45 );
        this.add( head );
        
        leftEye = new Ellipse( x + 41, y + 16 );
        leftEye.setFillColor( Color.WHITE );
        leftEye.setFrameColor( Color.GRAY );
        leftEye.setRotation( 15 );
        leftEye.setSize( 11, 16 );
        this.add( leftEye );
        
        rightEye = new Ellipse( x + 52, y + 16 );
        rightEye.setFillColor( Color.WHITE );
        rightEye.setFrameColor( Color.GRAY );
        rightEye.setRotation( 345 );
        rightEye.setSize( 11, 16 );
        this.add( rightEye );
        
        leftLeg = new Rectangle( x + 28, y + 84 );
        leftLeg.setColor( Color.BLACK );
        leftLeg.setSize( 25, 25 );
        this.add( leftLeg );
        
        rightLeg = new Rectangle( x + 53, y + 84 );
        rightLeg.setColor( Color.BLACK );
        rightLeg.setSize( 25, 25 );
        this.add( rightLeg );
        
        leftPupil = new Ellipse( x + 56, y + 22 );
        leftPupil.setColor( Color.BLACK );
        leftPupil.setSize( 2, 2 );
        this.add( leftPupil );
        
        rightPupil = new Ellipse( x + 46, y + 22 );
        rightPupil.setColor( Color.BLACK );
        rightPupil.setSize( 2, 2 );
        this.add( rightPupil );
        
        leftArm = new RoundedRectangle( x + 21, y + 40 );
        leftArm.setColor( c );
        leftArm.setRotation( 1 );
        leftArm.setSize( 8, 36 );
        this.add( leftArm );
        
        rightArm = new RoundedRectangle( x + 75, y + 40 );
        rightArm.setColor( c );
        rightArm.setRotation( 1 );
        rightArm.setSize( 8, 35 );
        this.add( rightArm );
        
        leftElbow = new Ellipse( x + 20, y + 50 );
        leftElbow.setColor( c );
        leftElbow.setSize( 4, 20 );
        this.add( leftElbow );
        
        rightElbow = new Ellipse( x + 80, y + 50 );
        rightElbow.setColor( c );
        rightElbow.setSize( 4, 20 );
        this.add( rightElbow );
        
        left = new Line( x + 30, y + 55, x + 30, y + 80 );
        left.setColor( Color.BLACK );
        this.add( left );
        
        right = new Line( x + 73, y + 55, x + 73, y + 80 );
        right.setColor( Color.BLACK );
        this.add( right );
        
        leftHand = new Ellipse( x + 20, y + 75 );
        leftHand.setColor( skin );
        leftHand.setSize( 12, 12 );
        this.add( leftHand );
        
        rightHand = new Ellipse( x + 73, y + 75 );
        rightHand.setColor( skin );
        rightHand.setSize( 12, 12 );
        this.add( rightHand );
        
        mouth = new Ellipse( x + 47, y + 35 );
        mouth.setColor( Color.BLACK );
        mouth.setSize( 10, 5 );
        this.add( mouth );
        
        mouthCover = new Ellipse( x + 47, y + 34 );
        mouthCover.setColor( skin );
        mouthCover.setSize( 10, 5 );
        this.add( mouthCover );
        
        shoes = new RoundedRectangle( x + 52, y + 80 );
        shoes.setColor( Color.BLACK );
        shoes.setRotation( 90 );
        shoes.setSize( 2, 56 );
        this.add( shoes );
        
        leftThumb = new Ellipse( x + 26, y + 77 );
        leftThumb.setFrameColor( Color.BLACK );
        leftThumb.setFillColor( skin );
        leftThumb.setSize( 5, 5 );
        this.add( leftThumb );
        
        rightThumb = new Ellipse( x + 73, y + 77 );
        rightThumb.setFrameColor( Color.BLACK );
        rightThumb.setFillColor( skin );
        rightThumb.setSize( 5, 5 );
        this.add( rightThumb );
        
    }

    /** main program creates a frame and invokes the class constructor.
      * @param args String
     */
    public static void main( String[] args )
    {
        new Frame();
        
        Avatar a = new Avatar( 100, 100 );
        Avatar b = new Avatar( Color.BLACK );
        
        a.setColor( Color.YELLOW );
        b.setColor( Color.GRAY );
        
    }
} //End of Class Avatar