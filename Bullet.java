import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet class
 * 
 * Kenneth Jin 
 * January 2
 */
public class Bullet extends Actor
{
    GreenfootImage image = getImage();
    GreenfootSound sound;
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String direction = Soldier.getDirection();
    public void act()
    {
        if(direction.equals("right"))
        {
            int x = getX() + 15;
            int y = getY();
            setLocation(x, y);
        }
        if(direction.equals("left"))
        {
            int x = getX() - 15;
            int y = getY();
            setLocation(x,y);
        }
        
        hittingZombies();
        // Add your action code here.
    }
    
    public Bullet()
    {
        image.scale(25,15);
        sound = new GreenfootSound("BulletHitting.mp3");
    }
    
    //this method detects if the bullet has hit a zombie
    public void hittingZombies()
    {
        if(isTouching(Zombie.class))
        {
            removeTouching(Zombie.class);
            MyWorld world = (MyWorld) getWorld();
            world.removeObject(this);
            sound.play();
            world.increaseScore();
        }
    }
    
    
    
    
}
