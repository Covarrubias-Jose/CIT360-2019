/*
 * 
 */
package cit360;

import java.util.Scanner;

/**@author josecovarrubias*/
public class CIT360 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This Java program will prompt you to enter a "
        + "number to select a topic to be displayed.");
        
        Scanner userInput = new Scanner(System.in);
        String selection = userInput.nextLine();
        
        while (selection == null){
        switch (selection){
            case "1":
                System.out.println("that was 1");
                break;
            case "2":
                System.out.println("that was 2");
                break;
            default:
                System.out.println("This time select something");
        }
        }
        
        //this calls the Collections class.
        //Collections MyCollections = new Collections();
        //System.out.println(MyCollections);
        
        //this calls the Threads, Executors, and Runnables (TER) class.
       // TER MyTER = new TER();
        //System.out.println(MyTER);
    }
    
}
