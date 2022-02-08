import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShipPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShipPlayer extends Actor
{
    /**
     * Act - do whatever the ShipPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        
        moveAround();
        enterMazeGame();
    }
    public void enterMazeGame() {
        if (isTouching(Universes.class)) {
            Greenfoot.setWorld(new SelectPerson1());
        }
    }
    public void moveAround() {
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(4);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(4);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(4);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(4);
        }
        
    }
}
