import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cut extends cutscene
{
    public int atraso = 50;
    /**
     * Constructor for objects of class s1.
     * 
     */
    public cut()
    {
    }
    public void act(){
        if(atraso > 0){
            atraso--;
        }
        if(Greenfoot.isKeyDown("enter") && (atraso == 0)){
            Mundo world = new Mundo();
            Greenfoot.setWorld(world);
        }
    }
}
