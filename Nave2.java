import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave2 extends Actor
{
    public int speed = 1 ;
    public boolean isLeft = true;
    public int sTimer = 0 ;
    int life = 10;
    /**
     * Act - do whatever the Nave2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        movimento();
        atk();
        vidas();
    }
    public void movimento(){
        if(Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() -speed);
        }
        if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() +speed);
        }
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() -speed,this.getY());
            if(isLeft == false)
            {
            this.getImage().mirrorHorizontally();
            }
            isLeft = true;
        }if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() +speed,this.getY());
            if(isLeft == true)
            {
            this.getImage().mirrorHorizontally();
            }
            isLeft = false;
        }
    }
    public void atk(){
    if(Greenfoot.isKeyDown("space") && (sTimer == 0)){
        if(isLeft == false)
            {
        getWorld().addObject(new Blast2(), getX() -10,
        getY() +10);
        sTimer --;
            } else{
        getWorld().addObject(new BlastR2(), getX() -10,
        getY() +10);
        sTimer ++;
        isLeft = true;
            }
    }
    else {
    if(!Greenfoot.isKeyDown("space")){
        sTimer = 0;
        }
    }
    }
    public void vidas(){
        Actor a = getOneIntersectingObject(bulletL.class);
        Actor b = getOneIntersectingObject(bullet.class);
        if(a != null || b != null){
            getWorld().removeObject(b);
            getWorld().removeObject(a);
            life -=1;
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
        } else if(life == 0){
            getWorld().removeObject(this);
            P1V world = new P1V();
            Greenfoot.setWorld(world);
        }
    }
}
