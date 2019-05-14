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
                          + "number to select a topic to be displayed.\n");
        
        System.out.println("Please enter a number: ");
        
        Scanner userInput = new Scanner(System.in);
        int selection = userInput.nextInt();
        
        while (selection < 1){ 
            
            System.out.println("You must enter a number: ");
            selection = userInput.nextInt();
        }
        
        switch (selection){
            case 1:
                //this calls the Collections class.
                Collections MyCollections = new Collections();
                System.out.println(MyCollections);
                break;
            case 2:
                //this calls the Threads, Executors, and Runnables (TER) class.
                TER MyTER = new TER();
                System.out.println(MyTER);
                break;
            default:
                System.out.println("Next time select something from the list.");
            }
        
        
        }
}    
        
        
       
 
