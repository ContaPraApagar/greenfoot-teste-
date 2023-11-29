import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blast2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blast2 extends Nave2
{   
    GifImage myGif = new GifImage("poder2L.gif");
    public void act()
        {
            setImage(myGif.getCurrentImage());
            moveAtack();
            Edge();
        }
        public void moveAtack(){
            double angle = Math.toRadians( getRotation() );
            int x = (int) Math.round (getX() + Math.cos(angle));
            int y = (int) Math.round (getY() + Math.sin(angle));  
            setLocation(x+1, y);
    }
    public void Edge(){
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
