import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends MyActor
{
    public Fireball()
    {
        super(10);
        this.setRotation(180);
    }
    public void act() 
    {
        move(5);
        disappear();
    }  
    
    public void move(int speed)
    {
        this.setLocation(this.getX(), this.getY()-speed);
    }
    
    public void disappear()
    {
        if(isAtEdge() == true)
        {
            getWorld().removeObject(this);
        }
    }
}