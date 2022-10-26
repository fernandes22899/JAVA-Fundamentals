import wheelsunh.users.*;
import java.awt.Color;

/** 
 * Buttons.java.
 * CS415 
 * @author Jeffrey Fernandes
 * Assignment #5
 * 5P
 */
public class Buttons extends RoundedRectangle
{
    protected Avatar _avatar;
    
    /**Constructor that gets method.
     * @param a Avatar
     */
    public Buttons( Avatar a )
    {
        super();
        _avatar = a;
    }
    
    /**Method when mouse is pressed.
     * @param e java.awt.event.MouseEvent
     */
    public void mousePressed( java.awt.event.MouseEvent e )
    {
        _avatar.activate();
    }
    
    /**Method when mouse is released.
     * @param e java.awt.event.MouseEvent
     */
    public void mouseReleased( java.awt.event.MouseEvent e )
    {
        _avatar.deactivate();
    }
    
}