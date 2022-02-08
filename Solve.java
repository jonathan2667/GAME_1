import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Solve here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Solve extends Movers
{
    /**
     * Act - do whatever the Solve wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int ok = 0;
    boolean isPressed;
    
    public void act()
    {
        // Add your action code here.
    }
    
     public void printOnSquares(String value) {      
        getWorld().showText(value, getX(), getY());

    }
    public void keyPressed(String key, String downImage, String upImage) {
        if (Greenfoot.isKeyDown(key) && !isPressed) {
            setImage(downImage);
            isPressed = true;
        }
        if (!Greenfoot.isKeyDown(key) && isPressed) {
            setImage(upImage);
            isPressed = false;
        }
    }
}
