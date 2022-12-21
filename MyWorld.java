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
        super(800, 600, 1);
        
        Soldier soldier = new Soldier();
        addObject(soldier, 40, 450);
        
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
       else if(setX == 2)
       {
           int x = 760;
           addObject(zombie, x, y);
       }
    }
}
