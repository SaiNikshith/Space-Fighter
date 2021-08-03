;import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile1 extends Missile
{
    /**
     * Act - do whatever the Missile1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        disappear();
    }    
}