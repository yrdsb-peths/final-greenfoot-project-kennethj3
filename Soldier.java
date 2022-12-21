import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class Soldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soldier extends Actor
{
    /**
     * Act - do whatever the Soldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] imagesRight = new GreenfootImage[11];
    GreenfootImage[] imagesLeft = new GreenfootImage[11];
    SimpleTimer animationTimer = new SimpleTimer();
    SimpleTimer jumpingTimer = new SimpleTimer();
    String facing = "right";
    public Soldier()
    {
        for(int i = 0; i < imagesRight.length; i++)
        {
            imagesRight[i] = new GreenfootImage("images/SoldierRunning/running" + i + ".png");
            imagesRight[i].scale(50,70);
        }
        
        for(int i = 0; i < imagesLeft.length; i++)
        {
            imagesLeft[i] = new GreenfootImage("images/SoldierRunning/running" + i + ".png");
            imagesLeft[i].mirrorHorizontally();
            imagesLeft[i].scale(50,70);
        }
        
        
    }
    public void act()
    {
        //moving
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(2);
            facing = "right";
        
        }
        
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("d"))
        {
            animations();
        }
        
        
        
        
        
        
        
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
        if(i > 10)
        {
            i = 0;
        }
        
    }
    
    
}
