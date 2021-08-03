import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    public int delayCount = 0; /*  delay count from adding one invader to another invader */
    public int invaderCount = 1; /* number invaders added */
    public Space()
    {    
        super(1000, 500, 1);
        addRocket();
    }
    public void addRocket()
    {
        Rocket rocket = new Rocket();
        addObject(rocket, 72, 438);
    }
    
    public void addSpaceInvaders()
    {
       if((invaderCount%2 == 0) && (invaderCount%3 == 0))
       {
           SpaceInvader1 invader1 = new SpaceInvader1(new Missile2());
           SpaceInvader2 invader2 = new SpaceInvader2(new Missile2());
           addObject(invader1, Greenfoot.getRandomNumber(999), Greenfoot.getRandomNumber(299));
           addObject(invader2, Greenfoot.getRandomNumber(999), Greenfoot.getRandomNumber(299));   
       }
       else if(invaderCount%3 == 0)
       {
           SpaceInvader1 invader1 = new SpaceInvader1(new Missile1());
           SpaceInvader2 invader2 = new SpaceInvader2(new Missile1());
           addObject(invader1, Greenfoot.getRandomNumber(999), Greenfoot.getRandomNumber(299));
           addObject(invader2, Greenfoot.getRandomNumber(999), Greenfoot.getRandomNumber(299));   
       }
       else if(invaderCount%5 == 0)
       {
           SpaceInvader1 invader1 = new SpaceInvader1(new Missile3());
           SpaceInvader2 invader2 = new SpaceInvader2(new Missile3());
           addObject(invader1, Greenfoot.getRandomNumber(999), Greenfoot.getRandomNumber(299));
           addObject(invader2, Greenfoot.getRandomNumber(999), Greenfoot.getRandomNumber(299));   
           
       }
       else
       {
           SpaceInvader1 invader1 = new SpaceInvader1();
           SpaceInvader2 invader2 = new SpaceInvader2();
           addObject(invader1, Greenfoot.getRandomNumber(999), Greenfoot.getRandomNumber(299));
           addObject(invader2, Greenfoot.getRandomNumber(999), Greenfoot.getRandomNumber(299)); 
       }
    }
    
    public void act()
    {
        if(invaderCount <= 10)
        {
            delayCount++;
            if(delayCount%20 == 0) /* condition is true for 50,100,150,200,...multiples of 50 */
            {
                addSpaceInvaders();
                invaderCount++;
            }
        }
    }
}
    
    
