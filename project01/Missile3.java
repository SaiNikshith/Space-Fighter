import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile3 extends Missile
{
    /**
     * Act - do whatever the Missile3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        disappear();
    }    
}