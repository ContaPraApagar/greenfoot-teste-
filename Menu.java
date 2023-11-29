import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    public int atraso = 10;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        super(800, 600, 1);
        act();
    }
    public void act(){
        if(atraso > 0){
            atraso--;
        }
        if(Greenfoot.isKeyDown("enter") && (atraso == 0)){
            cutscene world = new cutscene();
            Greenfoot.setWorld(world);
        }
    }
}
