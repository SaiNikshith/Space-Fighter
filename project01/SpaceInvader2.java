import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceInvader2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceInvader2 extends SpaceInvader
{
    public Missile missile;

    public SpaceInvader2(Missile missile)
    {    
        this.missile = missile;
    }
    public SpaceInvader2()
    {
        super();/* this line will be automatically added, even if we dont add it*/
    }
     public void act() 
    {
        move(speed);
        toAndFroMotion();
        disappear();
        automaticFire();
    }    
    public void automaticFire()
    {
        if(missile != null)
        {
            getWorld().addObject(missile, this.getX(), this.getY());
        }
    }
      
}