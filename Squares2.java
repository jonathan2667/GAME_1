import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Squares2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Squares2 extends Equations
{
    /**
     * Act - do whatever the Squares2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String key;
    String upImage;
    String downImage;
    
    String value;
    int position;
    
    public Squares2 (String key, String upImage, String downImage, String value, int position) {
        this.key = key;
        this.upImage = upImage;
        this.downImage = downImage;
        this.value = value;
        this.position = position;
        
        setImage(upImage);

    }
    
    public void act()
    {
        // Add your action code here.
        
        keyPressed(key, downImage, upImage);
        printOnSquares(value);
    }
}
