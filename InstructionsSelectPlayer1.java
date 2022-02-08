import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsSelectPlayer1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsSelectPlayer1 extends Writing
{
    /**
     * Act - do whatever the InstructionsSelectPlayer1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage image = new GreenfootImage("SELECT YOUR CHARACTER!", 50, Color.WHITE, new Color(0, 0, 0, 0 ), Color.BLACK); 
    
    public InstructionsSelectPlayer1() {
        setImage(image);
    }
    
    
    public void act()
    {
        wrapAtEdge(510, 600);
    }
    
    
}
