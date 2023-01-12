import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeginningScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeginningScreen extends World
{

    /**
     * Constructor for objects of class BeginningScreen.
     * 
     */
    public BeginningScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1088, 585, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Zombie zombie = new Zombie();
        addObject(zombie,1006,92);
        Soldier soldier = new Soldier();
        addObject(soldier,70,73);
        soldier.setLocation(103,112);
        Label label = new Label("Final Light", 150);
        addObject(label,530,300);
        label.setLocation(598,287);
        Label label2 = new Label("Press space to continue", 40);
        addObject(label2,559,427);
        zombie.setLocation(976,121);
        label.setLocation(591,280);
        Bullet bullet = new Bullet();
        addObject(bullet,317,131);
        Bullet bullet2 = new Bullet();
        addObject(bullet2,741,143);
        Bullet bullet3 = new Bullet();
        addObject(bullet3,524,141);
        bullet.setLocation(243,121);
        bullet3.setLocation(363,124);
        bullet2.setLocation(516,124);
        bullet2.setLocation(496,126);
        bullet2.setLocation(502,122);
        bullet3.setLocation(368,122);
    }
}
