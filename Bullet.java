import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        
        shooting();
        // Add your action code here.
    }
    
    public Bullet()
    {
        image.scale(25,15);
        sound = new GreenfootSound("BulletHitting.mp3");
    }
    
    
    public void shooting()
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
