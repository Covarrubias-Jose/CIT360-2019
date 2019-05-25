/*
 * 
 */
package cit360;

import java.util.Scanner;

/**@author josecovarrubias*/
public class CIT360 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("This Java program will prompt you to enter a \n"
                          + "number to select a topic to be displayed.\n");
        //Print the list of topics to choose from. 
        System.out.println("================================================\n"+
                           "1.-Java Collections\n" +
                           "2.-Threads, Executors, and Runnables\n" +
                           "3.-Application Controller Pattern\n" +
                           "4.-MVC\n" +
                           "5.-Hibernate\n" +
                           "6.-QCJSON and JSON\n" +
                           "7.-Android HttpUrlConnection\n" +
                           "8.-Servlets\n" +
                           "9.-JUnit Tests\n" +
                           "10.-System Level Tests\n" +
                           "================================================");
        
        System.out.println("Please enter a number: ");
//        
        Scanner userInput = new Scanner(System.in);
        String selection = userInput.nextLine();
        
        while (selection.isEmpty()){ //repeat the prompt if no # was entered 
            
            System.out.println("You must enter a number: ");
            selection = userInput.nextLine();
        }
        if (selection.equals("0")){
        System.out.println("You must enter a number greater than 0: "); 
            selection = userInput.nextLine();
        }
        switch (selection){
            case "1":
                //this calls the Collections class.
                Collections MyCollections = new Collections();
                System.out.println(MyCollections);
                break;
            case "2":
                //this calls the Threads, Executors, and Runnables (TER) class.
                TER MyTER = new TER(); 
                System.out.println(MyTER); 
                break;
            case "3":
                //this calls the Application Controller pattern classes
                //creating a thread.
                AppConPattern MyACP = new AppConPattern();
                MyACP.run();
                break;
            default:
                System.out.println("Next time select something from the list.");
                
            }
          
        
    }
}    
        
        
       
 
