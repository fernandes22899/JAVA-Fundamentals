import wheelsunh.users.*;
import java.awt.Color;
/** 
 * Puts  an Avatar's through its paces. 
 * @author CS415  
 */
public class AvatarDriver
{ 
    //---------------- instance variables ------------------------------
    private Avatar     myAvatar;          
    private TextBox label,  colorLabel, locStartLabel, locEndLabel;   
    
    //--------------- constructor --------------------------------------
    /**
     *  Construct a Avatar and then test it.
     *  TextBox objects are displayed  to show results.
     */
    public AvatarDriver()
    {
        label = new TextBox( 270, 40 );
        label.setSize( 290, 100 );
        label.setText( "No parameter Constructor" );
        
        myAvatar = new Avatar();
        
        Utilities.sleep( 2000 );
        
        label.setText( "Two parameter Constructor\n ( 20,200 )" );
        Utilities.sleep( 1000 );
        myAvatar = new Avatar( 20, 200 );
        
        Utilities.sleep( 2000 );
        
        label.setText( "One parameter Constructor\n (ORANGE)" );
        Utilities.sleep( 1000 );
        myAvatar = new Avatar( Color.ORANGE );
        
        Utilities.sleep( 2000 );
        
        label.setText( "SetLocation ( 40, 350 ) " );
        Utilities.sleep( 1000 );
        myAvatar.setLocation( 40, 350 );
        
        Utilities.sleep( 2000 );
        label.setText( "SetColor (PINK) " );
        Utilities.sleep( 1000 );
        myAvatar.setColor( Color.pink );
        
        
        Utilities.sleep( 2000 );
        colorLabel = new TextBox( 270, 140 );
        colorLabel.setSize( 290, 100 );
        
        colorLabel.setText( "getColor =  " + myAvatar.getColor() +
                           "\n ( 225, 175, 175 )" );
        
        Utilities.sleep( 2000 );
        
        locStartLabel = new TextBox( 270, 240 );
        locStartLabel.setSize( 290, 100 );      
        locStartLabel.setText( "Start Location" +
                              "\ngetXlocation =  " +
                              myAvatar.getXLocation() +
                              "\ngetYLocation = " + 
                              myAvatar.getYLocation() +
                              "\n (40, 350)\n" );     
        Utilities.sleep( 1000 );
        
        label.setText( "moveUp " );
        Utilities.sleep( 1000 );
        
        for( int i = 0; i < 60; i++ )
        {
            myAvatar.moveUp( 5 );
            Utilities.sleep( 20 );
        }
        
        locEndLabel = new TextBox( 270, 340 );
        locEndLabel.setSize( 290, 100 ); 
        locEndLabel.setText( "End Location" +
                            "\ngetXlocation = " +
                            myAvatar.getXLocation() +
                            "\ngetYLocation = " + 
                            myAvatar.getYLocation() +
                            "\n (40, 50)\n" );
    }
    
    //-------------------- main ----------------------------------------
    /**
     * Just create a AvatarDriver object.
     * @param args String
     */
    public static void main( String[] args )
    {
        new Frame();
        new AvatarDriver();
    }
}
