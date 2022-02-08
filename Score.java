import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Object;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Solve
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Score() {
        setImage(new GreenfootImage("SCORE: " + 0 , 40, Color.WHITE, new Color(0,0,0, 0 ), Color.BLACK));    
    }
    
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("SCORE: " + ((Equations)getWorld().getObjects(Equations.class).get(0)).score, 40, Color.WHITE, new Color(0,0,0, 0 ), Color.BLACK));    
    }
}
