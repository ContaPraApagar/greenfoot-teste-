import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo()
    {
        super(800, 600, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Nave1 Nave1 = new Nave1();
        addObject(Nave1,50,300);
        Nave2 Nave2 = new Nave2();
        addObject(Nave2,680,300);
        Counter Counter = new Counter();
        addObject(Counter,50,20);
        Counter2 Counter2 = new Counter2();
        addObject(Counter2,750,20);
    }
}