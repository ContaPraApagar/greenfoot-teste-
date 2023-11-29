import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bulletL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bulletL extends Nave1
{
    GifImage myGif = new GifImage("poder2R.gif");
    public void act()
        {
            setImage(myGif.getCurrentImage());
            moveAtack();
            Edge();
        }
        public void moveAtack(){
            double angle = Math.toRadians( getRotation() );
            int x = (int) Math.round (getX() - Math.cos(angle));
            int y = (int) Math.round (getY() - Math.sin(angle));  
            setLocation(x-1, y);
    }
        public void Edge(){
            if (isAtEdge())
            {
                getWorld().removeObject(this);
            }
    }
}

