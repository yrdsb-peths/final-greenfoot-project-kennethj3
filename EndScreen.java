import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * End screen
 * 
 * Kenneth Jin 
 * January 2
 */
public class EndScreen extends World
{

    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1088, 585, 1); 
        GreenfootImage background = new GreenfootImage("EndScreen.jpeg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
    }
}
