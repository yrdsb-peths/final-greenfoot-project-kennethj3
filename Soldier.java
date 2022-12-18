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
    GreenfootImage[] images = new GreenfootImage[12];
    public Soldier()
    {
        for(int i = 0; i < images.length; i++)
        {
            images[i] = new GreenfootImage("images/SoldierRunning/running" + i + ".png");
        }
    }
    public void act()
    {
        //moving
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(2);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            int y = getY() - 2;
            setLocation(getX(), y);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            int y = getY() + 2;
            setLocation(getX(), y);
        }
        
        // Add your action code here.
        
    }
    
    
}
