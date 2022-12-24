import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1088, 585, 1);
        GreenfootImage background = new GreenfootImage("Background.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        Soldier soldier = new Soldier();
        addObject(soldier, 363, 450);
        
        int level = 1;
        
        spawnZombies();
        
    }
    
    public void spawnZombies()
    {
       Zombie zombie = new Zombie();
       int setX = Greenfoot.getRandomNumber(2);
       int y = 450;
       if(setX == 1)
       {
           int x = 40;   
           addObject(zombie, x, y);
       }
       else
       {
           int x = 685;
           addObject(zombie, x, y);
       }
    }
}
