import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialScreen extends World
{

    /**
     * Constructor for objects of class TutorialScreen.
     * 
     */
    public TutorialScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1088, 585, 1); 
        prepare();
        GreenfootImage background = new GreenfootImage("Background.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
    }
    
    int pauseTimer;
    public void act()
    {
        pauseTimer = (pauseTimer+1)%10;
        if(pauseTimer == 0)
        {
            if(Greenfoot.isKeyDown("space"))
            {
                MyWorld TutorialScreen = new MyWorld();
                Greenfoot.setWorld(TutorialScreen);
            }
                
        }
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Label label = new Label("Press space to shoot", 75);
        addObject(label,142,148);
        label.setLocation(456,103);
        Label label2 = new Label("Press ;a' to move left", 50);
        addObject(label2,223,246);
        label2.setLocation(304,202);
        label2.setValue("Press 'a' to move left");
        Label label3 = new Label("Press 'd' to move right", 50);
        addObject(label3,187,343);
        label3.setLocation(300,284);
        Label label4 = new Label("Hold 'r' to reload", 50);
        addObject(label4,232,399);
        label4.setLocation(253,370);
        label2.setLocation(378,198);
        Label label5 = new Label("press space to continue", 65);
        addObject(label5,552,527);
        label5.setLocation(626,494);
        label.setLocation(77,116);
        label2.setLocation(77,210);
        label3.setLocation(76,282);
        label4.setLocation(77,363);
        label5.setLocation(235,494);
        label.setLocation(532,119);
        label.setLocation(479,117);
        label.setLocation(434,106);
        label2.setLocation(457,208);
        label2.setLocation(307,194);
        label3.setLocation(377,270);
        label3.setLocation(334,268);
        label4.setLocation(392,376);
        label4.setLocation(262,350);
        label5.setLocation(549,490);
        label5.setLocation(563,483);
        label.setLocation(423,110);
        label3.setLocation(376,268);
        label3.setLocation(347,277);
        label.setLocation(457,117);
        label3.setLocation(114,279);
        label3.setLocation(341,273);
        label3.setLocation(324,272);
        label.setLocation(441,117);
        label.setLocation(449,119);
        label.setLocation(431,122);
        label.setLocation(471,131);
        label.setLocation(415,118);
    }
}
