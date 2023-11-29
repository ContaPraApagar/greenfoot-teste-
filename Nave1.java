import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave1 extends Actor
{
    public int speed = 1;
    public int projspeed = 6;
    public boolean isLeft = true;
    public int sTimer = 10 ;
    int life = 10;
    public int wait = 50;
    /**
     * Act - do whatever the Nave1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
        atk();
        vidas();
    }
    public void movimento(){   
        if(Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() -speed);
        }
        if(Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() +speed);
        }
        if(Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() -speed,this.getY());
            if(isLeft == true)
            {
            this.getImage().mirrorHorizontally();
            }
            isLeft = false;
        } if(Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() +speed,this.getY());
            if(isLeft == false)
            {
            this.getImage().mirrorHorizontally();
            }
            isLeft = true;
        }
    }
    public void atk(){
        if(Greenfoot.isKeyDown("f") && (sTimer == 0)){
            if(isLeft == false)
            {
                getWorld().addObject(new bulletL(), getX() -50,
                getY() +30);
                sTimer --;
        } else{
            getWorld().addObject(new bullet(), getX() +50,
            getY() +30);
            sTimer ++;
            isLeft = true;
            }
        }
        else {
        if(!Greenfoot.isKeyDown("f")){
            sTimer = 0;
            }
        }        
    }
    public void vidas(){
        Actor b = getOneIntersectingObject(Blast2.class);
        Actor a = getOneIntersectingObject(BlastR2.class);
        if(b != null || a != null){
            getWorld().removeObject(b);
            getWorld().removeObject(a);
            life -=1;
            Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter2.add(1);
        } else if(life == 0){
            getWorld().removeObject(this);
            P2V world = new P2V();
            Greenfoot.setWorld(world);
        }
    }
}                                                                                                       
    



   
