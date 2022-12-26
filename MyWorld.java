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
    SimpleTimer zombieSpawnTimer = new SimpleTimer();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1088, 585, 1);
        GreenfootImage background = new GreenfootImage("Background.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        Soldier soldier = new Soldier();
        addObject(soldier, 544, 450);
        
        int level = 1;
        
        spawnZombies();
        
        
    }
    
    public void act()
    {
        checkForSpawn();
    }
    
    public void gameOver()
    {
        Label endLabel = new Label("Game Over!", 150);
        addObject(endLabel, 544, 242);
    }
    
    
    
    public void spawnZombies()
    {
        Zombie zombie = new Zombie();
        int setX = Greenfoot.getRandomNumber(2);
        int y = 440;
        if(setX == 1)
        {      
            addObject(zombie, 40, y);
        }
        else
        {
            addObject(zombie, 1048, y);
        }
        
        
    }
    
    int spawnTimer;
    private void checkForSpawn()
    {
        spawnTimer = (spawnTimer+1)%300; 
        if (spawnTimer == 0) 
        {
            spawnZombies();
        
        }
    }
    
    
    
    
    
    
}
