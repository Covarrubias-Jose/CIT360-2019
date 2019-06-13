
package cit360;

import java.util.Scanner;

/*
 * @author Jose Covarrubias
 *
 * This class is used to demonstrate the use of APPLICATION CONTROLLER PATTERN
 */
public class AppConPattern extends Thread{
    
        @Override //Allows for THREAD creation. 
        public void run(){ 
        //indicates that Application Controller pattern starts here. 
        System.out.println("=================================================\n" 
                          + "Initializing Application Control Pattern \n"
                          + "================================================");
        System.out.println("Type save or lookup to continue \n"
                          + "with the application. \n"
                          + "==============================================\n");
        // creates the object of the controller.
        AppController callAPC = new AppController();
        
        //receives the inut from the user. 
        Scanner input = new Scanner(System.in);
        String selection = input.nextLine();
        
        //implements the controller method.
       // callAPC.doCommand(selection, commandData);
        
        
    }
}
