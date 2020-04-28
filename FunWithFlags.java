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
 * @author (your name)
 * @version (a version number or a date)
 */
public class FunWithFlags{

    /**
     * Constructor for objects of class FunWithFlags 
     */
    public FunWithFlags(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }


    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        FunWithFlags obj = new FunWithFlags();
    }

}

