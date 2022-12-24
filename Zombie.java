import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    String facing = "right";
    GreenfootImage[] imagesRight = new GreenfootImage[8];
    GreenfootImage[] imagesLeft = new GreenfootImage[8];
    SimpleTimer animationTimer = new SimpleTimer();
    public Zombie()
    {
        for(int i = 0; i < imagesRight.length; i++)
        {
            imagesRight[i] = new GreenfootImage("images/ZombieRunning/tile00" + i + ".png");
            imagesRight[i].mirrorHorizontally();
            imagesRight[i].scale(50,75);
        }
        
        for(int i = 0; i < imagesLeft.length; i++)
        {
            imagesLeft[i] = new GreenfootImage("images/ZombieRunning/tile00" + i + ".png");
            imagesLeft[i].scale(50,75);
        }
    }
    
    public void act()
    {
        if(getX() == 1048)
        {
            facing = "left";
        }
        else if(getX() == 40)
        {
            facing = "right";
        }
        if(facing.equals("right"))
        {
            int x = getX() + speed;
            int y = getY();
            setLocation(x, y);
        }
        else if(facing.equals("left"))
        {
            int x = getX() - speed;
            int y = getY();
            setLocation(x, y);
        }
        animations();
        // Add your action code here.
    }
    
    int i = 0;
    public void animations()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(imagesRight[i]);
        }
        else
        {
            setImage(imagesLeft[i]);
        }
        
        i++;
        if(i > 7)
        {
            i = 0;
        }
        
    }
    
}
