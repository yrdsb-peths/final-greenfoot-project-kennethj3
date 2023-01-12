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
    private void prepare()
    {
        Label label = new Label("Final Light", 150);
        addObject(label,544,244);
        
        Zombie zombie = new Zombie();
        addObject(zombie,201,432);
        
        label.setLocation(381,249);
        zombie.setLocation(100,72);
        Soldier soldier = new Soldier();
        addObject(soldier,978,87);
        
        soldier.setLocation(1008,77);
        Label label2 = new Label("Press space to continue", 35);
        addObject(label2,536,410);
        label2.setLocation(557,404);
    }
}
