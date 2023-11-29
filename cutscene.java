import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cutscene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cutscene extends Menu
{
    public int atraso = 20;
    /**
     * Constructor for objects of class z1.
     * 
     */
    public cutscene()
    {
    }
    public void act(){
        if(atraso > 0){
            atraso--;
        }
        if(Greenfoot.isKeyDown("enter") && (atraso == 0)){
            cut world = new cut();
            Greenfoot.setWorld(world);
        }
    }
}
