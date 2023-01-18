import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Soldier class
 * 
 * Kenneth Jin 
 * January 2
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
    Label ammoLabel;
    
    public static String facing = "right";
    public Soldier()
    {
        for(int i = 0; i < imagesRight.length; i++)
        {
            imagesRight[i] = new GreenfootImage("images/SoldierRunning/running" + i + ".png");
            imagesRight[i].scale(50,75);
        }
        
        for(int i = 0; i < imagesLeft.length; i++)
        {
            imagesLeft[i] = new GreenfootImage("images/SoldierRunning/running" + i + ".png");
            imagesLeft[i].mirrorHorizontally();
            imagesLeft[i].scale(50,75);
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
        
        checkForShooting();
        
        
        
        
        
        
        // Add your action code here.
        
    }
    
   
    
    
    int i = 0;
    //this method animates the soldier
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
    
    //this methods checks if the user pressed on space key and if they did it will shoot a bullet
    private void shoot()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld world = (MyWorld) getWorld();
            if(world.ammo > 0)
            {
                int x = getX();
                int y = getY();
                Bullet bullet = new Bullet();
                world.addObject(bullet, x, y);
                world.ammo = world.ammo - 1;
            }
            
        }    
    }
    
    
    
    
    
    int shootingTimer;
    //creates gap between each shot
    private void checkForShooting()
    {
        shootingTimer = (shootingTimer+1)%20;
        if(shootingTimer == 0)
        {
            shoot();
        }
    }
    
    public static String getDirection()
    {
       return facing;
    }
    
    
}
