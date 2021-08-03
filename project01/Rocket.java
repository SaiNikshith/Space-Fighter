import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    public int delayCount = 0;
    
    public Rocket()
    {
        setRotation(270);
    }
    
    
    public void act() 
    {
       right();
       left();
       up();
       down();
       moveSideWays();
       moveUpDown();
       
       delayCount++;
       if(delayCount > 20)
       {
            releaseFireball();
            
       }
      
    } 
    
    public void up()
    {
        if(Greenfoot.isKeyDown("up") == true)
        {
            this.setLocation(this.getX(), this.getY()-5);
        }
    }
    public void down()
    {
        if(Greenfoot.isKeyDown("down") == true)
        {
            this.setLocation(this.getX(), this.getY()+5);
        }
    }
    
    
    
    public void right()
    {
        if(Greenfoot.isKeyDown("right") == true)
        {
            this.setLocation(this.getX()+5, this.getY());
        }
    }
    public void left()
    {
        if(Greenfoot.isKeyDown("left") == true)
        {
            this.setLocation(this.getX()-5,this.getY());
        }
    }
    
    public void moveSideWays()    
    {
        if(this.getX() == 999)
        {
            this.setLocation(0,this.getY());
        }
        else if(this.getX() == 0)
        {
            this.setLocation(999,this.getY());
        }
    }
    
    public void moveUpDown()
    {
        if(this.getY() == 0)
        {
            this.setLocation(this.getX(), 499);
        }
        else if(this.getY() == 499)
        {
            this.setLocation(this.getX(), 0);
        }
    }
    
    public void releaseFireball()
    {
        if(Greenfoot.isKeyDown("space") == true)
        {
            Fireball fireball = new Fireball();
            getWorld().addObject(fireball, this.getX(), this.getY());
            delayCount = 0;
        }
    }
  
    
}