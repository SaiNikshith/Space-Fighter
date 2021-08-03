import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceInvader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceInvader extends MyActor
{
    public int speed = 10;
    
    public SpaceInvader()
    {
        super(2);
    }
    
    public void toAndFroMotion()
    {
        if(this.getX() == 999)
        {
            speed = -10;
        }
        else if(this.getX() == 0)
        {
            speed = 10;
        }
    }
    
    public void disappear()
    {
        if(isTouching(Fireball.class) == true)
        {
            this.removeTouching(Fireball.class);
            getWorld().removeObject(this);

        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
