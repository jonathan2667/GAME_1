import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectPerson1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectPerson1 extends World
{

    /**
     * Constructor for objects of class SelectPerson1.
     * 
     */
    int fishNumberChosen;

    
    public SelectPerson1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        
        
             
        prepare();
    }
    
    public void prepare() {
        Characters fish = new Characters(1, "fish3.png");
        addObject(fish, getWidth() / 2 - 200, getHeight() / 2 - 20);
        
        Characters fish1 = new Characters(2, "seahorse.png");
        addObject(fish1, getWidth() / 2 + 200, getHeight() / 2 - 20);
        
        
        Characters fish2 = new Characters(3, "dolphin.png");
        addObject(fish2, getWidth() / 2 - 200, getHeight() / 2 + 160);
        
        Characters fish3 = new Characters(4, "fish1.png");
        addObject(fish3, getWidth() / 2 + 200, getHeight() / 2 + 160);
        
         
        InstructionsSelectPlayer1 instructionsSelectPlayer1 = new InstructionsSelectPlayer1();
        addObject(instructionsSelectPlayer1, getWidth() / 2, getHeight() / 4 + 30);
        
        InstructionWelcome1 instructionWelcome1 = new InstructionWelcome1();
        addObject(instructionWelcome1, getWidth() / 2, getHeight() / 4  - 40);
    }
}
