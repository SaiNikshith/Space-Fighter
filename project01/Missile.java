import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends MyActor
{
    public Missile()
    {
        super(3);
        this.setRotation(90);
    }
    public void move(int speed)
    {
        this.setLocation(this.getX(), this.getY()+speed);
    }
    public void disappear()
    {
        if(this.isAtEdge() == true)
        {
            getWorld().removeObject(this);
        }
    }
}