import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyActor extends Actor
{
    public MyActor(int size)
    {
        this.getImage().scale(this.getImage().getWidth()/size, this.getImage().getHeight()/size);
    }
}