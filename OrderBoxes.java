import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OrderBoxes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrderBoxes extends Writing
{
    /**
     * Act - do whatever the OrderBoxes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int position;
    public OrderBoxes(int position) {
        this.position = position;
        GreenfootImage image = new GreenfootImage("" + position, 25, Color.BLACK, new Color(0, 0, 0, 0 ), Color.BLACK); 
        setImage(image);
    }
    
    public void act()
    {
        GreenfootImage image = new GreenfootImage("" + position, 25, Color.BLACK, new Color(0, 0, 0, 0 ), Color.BLACK); 
        setImage(image);
        // Add your action code here.
        
    }
}
