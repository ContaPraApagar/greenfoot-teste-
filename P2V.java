import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2V here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2V extends World
{
    public int wait = 1000;
    /**
     * Constructor for objects of class zWin.
     * 
     */
    public P2V()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        act();
    }
    public void act(){
        if(wait > 0){
            wait--;
        }
        if(wait == 0){
            creditos world = new creditos();
            Greenfoot.setWorld(world);
        }
    }
}
