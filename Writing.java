import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Writing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Writing extends Actor

{
    /**
     * Act - do whatever the Writing wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean goFront = true;
    int speed = 1;
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void wrapAtEdge(int min, int max) {
        int x = getX();
        int y = getY();
        
        if (goFront) {
            setLocation(x + speed, y);
            if (x > max)
                goFront = false;
        }
        else {
            setLocation(x - speed, y);
            if (x < min)
                goFront = true;
        }
        
    }
}
