import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class creditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class creditos extends World
{
    public int wait = 50;
    /**
     * Constructor for objects of class creditos.
     * 
     */
    public creditos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void act(){
        if(wait > 0){
            wait--;
        }
        if(Greenfoot.isKeyDown("enter") && (wait == 0)){
            Menu world = new Menu();
            Greenfoot.setWorld(world);
        }
    }
}
