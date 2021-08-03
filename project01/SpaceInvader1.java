import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SpaceInvader1 extends SpaceInvader
{
    public Missile missile;

    public SpaceInvader1(Missile missile)
    {    
        this.missile = missile;
    }
    public SpaceInvader1()
    {
        super(); /* this line will be automatically added, even if we dont add it*/
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
        if(this.missile != null)
        {
            getWorld().addObject(missile, this.getX(), this.getY());
        }
    }
    
}