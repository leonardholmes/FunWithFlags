/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Write a description of class FunWithFlags here.
 *
 * @author leonard
 * @version 28/04/2020
 */
public class FunWithFlags{

    /**
     * Constructor for objects of class FunWithFlags 
     */
    public FunWithFlags(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    /** whichFlag
     * method to take in parameters for use in drawThreeStripeFlag
     * such as horizontal or vertical stripes, color of the three stripes
     */
    public void whichFlag(){
        String horizontal = new String("horizontal");
        String vertical = new String("vertical");
        boolean repeat = true;
        while (repeat = true){
            String direction = UI.askString("Are the stripes horizontal or verticlal:");
            if (direction.equals(horizontal)){
                String topStripe = UI.askString("what is the color of the top stripe?:");
                String middleStripe = UI.askString("what is the color of the middle stripe?:");
                String bottomStripe = UI.askString("what is the color of the bottom stripe?:");
                repeat = false;
                
            }
            else if (direction.equals(vertical)){
                String leftStripe = UI.askString("what is the color of the left stripe?:");
                String centreStripe = UI.askString("what is the color of the middle stripe?:");
                String rightStripe = UI.askString("what is the color of the right stripe?:");
                repeat = false;
            }
            else{
                System.out.println("please enter either horizontal or vertical");
            }
        }    
     }
    /** drawThreeStripeFlagHorizontal
     * method that after flag colors are taken in and is horizontal
     * draws the horizontal flag
     */
    private void drawThreeStripeFlagHorizontal(String top, String middle, String bottom){
        UI.setColor(Color.red);
        UI.fillRect(100, 100, 200, 100);
        UI.setColor(Color.red);
        UI.fillRect(100, 200, 200, 100);
        UI.setColor(Color.red);
        UI.fillRect(100, 300, 200, 100);
     }
     /** drawThreeStripeFlagVertical
     * method that after flag colors are taken in and is vertical
     * draws the vertical flag
     */
     private void drawThreeStripeFlagVertical(String left, String middle, String right){
        
     }
    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        FunWithFlags obj = new FunWithFlags();
        obj.whichFlag();
    }

}

