/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Is a class for drawing either horizontal or vertical
 * three striped flags
 * @author leonard
 * @version 28/04/2020
 */
public class FunWithFlags {
    
    /**
     * Constructor for objects of class FunWithFlags 
     */
    public FunWithFlags() {
        UI.initialise();
        UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    /** whichFlag
     * method to take in parameters for use in drawThreeStripeFlag
     * such as horizontal or vertical stripes, color of the three stripes
     */
    public void whichFlag() {
        String horizontal = new String("horizontal");
        String vertical = new String("vertical");
        boolean repeat = true;
        while (repeat) {
            String direction = UI.askString("Are the stripes horizontal or verticlal:");
            if (direction.equals(horizontal)) {
                drawThreeStripeFlagHorizontal();
                repeat = false;
            }
            else if (direction.equals(vertical)) {
                drawThreeStripeFlagVertical();
                repeat = false;
            }
            else {
                System.out.println("please enter either horizontal or vertical");
            }
        }    
    }
    /** drawThreeStripeFlagHorizontal
     * method that after flag colors are taken in and is horizontal
     * draws the horizontal flag
     */
    private void drawThreeStripeFlagHorizontal() {
        
        int a = 100, b = 50, c = 200, d = 50;
        //asking for the RGB values for the top stripe of the flag
        UI.println("Please enter the RGB values for the top stripe");
        int redValue1 = UI.askInt("what is the first RGB (red)value of the color:");
        int greenValue1 = UI.askInt("what is the middle RGB (green) value of the color:");
        int blueValue1 = UI.askInt("what is the last (blue) RGB value of the color:");
        Color stripeTop = new Color(redValue1, greenValue1, blueValue1);   //making the color for top stripe
        //asking for RGB values for middle stripe of the flag
        UI.println("Please enter the RGB values for the middle stripe");
        int redValue2 = UI.askInt("what is the first RGB (red)value of the color:");
        int greenValue2 = UI.askInt("what is the middle RGB (green) value of the color:");
        int blueValue2 = UI.askInt("what is the last (blue) RGB value of the color:");
        Color stripeMiddle = new Color(redValue2, greenValue2, blueValue2); //making the color for the middle stripe
        //asking for RGB values for bottom line of the flag
        UI.println("Please enter the RGB values for the bottom stripe");
        int redValue3 = UI.askInt("what is the first RGB (red)value of the color:");
        int greenValue3 = UI.askInt("what is the middle RGB (green) value of the color:");
        int blueValue3 = UI.askInt("what is the last (blue) RGB value of the color:");
        Color stripeBottom = new Color(redValue3, greenValue3, blueValue3); //making the color for the bottom stripe
        //drawing the the stripes in their chosen colours
        UI.setColor(stripeTop);
        UI.fillRect(a, b, c, d);
        UI.setColor(stripeMiddle);
        UI.fillRect(a, b * 2, c, d);
        UI.setColor(stripeBottom);
        UI.fillRect(a, b * 3, c, d);
    }
    /** drawThreeStripeFlagVertical
    * method that after flag colors are taken in and is vertical
    * draws the vertical flag
    */
    private void drawThreeStripeFlagVertical() {
        int a = 50, b = 50, c = 50, d = 200;
        //asking for the RGB values for the left stripe of the flag
        UI.println("Please enter the RGB values for the left stripe");
        int redValue1 = UI.askInt("what is the first RGB (red)value of the color:");
        int greenValue1 = UI.askInt("what is the middle RGB (green) value of the color:");
        int blueValue1 = UI.askInt("what is the last (blue) RGB value of the color:");
        Color stripeLeft = new Color(redValue1, greenValue1, blueValue1); //making the color for left stripe
        //asking for RGB values for centre stripe of the flag
        UI.println("Please enter the RGB values for the middle stripe");
        int redValue2 = UI.askInt("what is the first RGB (red)value of the color:");
        int greenValue2 = UI.askInt("what is the middle RGB (green) value of the color:");
        int blueValue2 = UI.askInt("what is the last (blue) RGB value of the color:");
        Color stripeCentre = new Color(redValue2, greenValue2, blueValue2); //making the color for the centre stripe
        //asking for RGB values for right line of the flag
        UI.println("Please enter the RGB values for the bottom stripe");
        int redValue3 = UI.askInt("what is the first RGB (red)value of the color:");
        int greenValue3 = UI.askInt("what is the middle RGB (green) value of the color:");
        int blueValue3 = UI.askInt("what is the last (blue) RGB value of the color:");
        Color stripeRight = new Color(redValue3, greenValue3, blueValue3); //making the color for the right stripe
        //drawing the the stripes in their chosen colours
        UI.setColor(stripeLeft);
        UI.fillRect(a, b, c, d);
        UI.setColor(stripeCentre);
        UI.fillRect(a * 2, b, c, d);
        UI.setColor(stripeRight);
        UI.fillRect(a * 3, b, c, d);
    }
    /**
     * Main routine
     *
     */
    public static void main(String[] args) {
        FunWithFlags obj = new FunWithFlags();
        obj.whichFlag();
    }

}

