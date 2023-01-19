/** This class generates blankets with instance variables of images of their appearance and strings containing the name of their color.
 * @author Felix Sierra
 * @version 1.0 */

import javax.swing.*;
import java.awt.*;

public class Blanket {
    private String color;
    private ImageIcon blanketImage;
    public static ImageIcon biggerImage(ImageIcon n, int width, int height)
    {
        Image iconToImage = n.getImage();
        Image enlargedImage = iconToImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(enlargedImage);
        return newIcon;
    }
    public String getColor()
    {
        return color;
    }
     /** The constructor initializes the instance variables.
    * @param c represents the name of the blanket's color.
    * @param i represents the image icon of the blanket.
    * @since Version 1.0 */
    public Blanket(String c, ImageIcon i)
    {
        color = c;
        blanketImage = i;
    }
    public ImageIcon getBlanketImage()
    {
        return blanketImage;
    }
    /** The constructor initializes the instance variables in an alternate way.
    * @param n represents a number that corresponds to a pair of a string and image icon.
    * Preconditions: parameter n must be a number between 1 and 4 inclusively.
    * Postconditions: a blanket object is initialized with a color string being either Red, Blue, Green, or Yellow (all case sensitive) with their corresponding image.
    * @since Version 1.0 */
    public Blanket(int n)
    {
        if (n == 1)
        {
            color = "Red";
            blanketImage = biggerImage(new ImageIcon("sprites\\redblanket.png"), 150, 150);
        }
        if (n == 2)
        {
            color = "Blue";
            blanketImage = biggerImage(new ImageIcon("sprites\\blueblanket.png"), 150, 150);
        }
        if (n == 3)
        {
            color = "Green";
            blanketImage = biggerImage(new ImageIcon("sprites\\greenblanket.png"), 150, 150);
        }
        if (n == 4)
        {
            color = "Yellow";
            blanketImage = biggerImage(new ImageIcon("sprites\\yellowblanket.png"), 150, 150);
        }
    }

}
