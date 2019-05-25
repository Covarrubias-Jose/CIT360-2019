
package cit360;

import java.util.Scanner;

/*
 * @author Jose Covarrubias
 *
 * This class is used to demonstrate the use of APPLICATION CONTROLLER PATTERN
 */
public class AppConPattern extends Thread{
    
        @Override
        public void run(){ 
        //display instructions for the user.
        System.out.println("==============================================\n" 
                          + "Populate your contacts book by entering \n"
                          + "a name and a phone number: \n"
                          + "==============================================");
        
        //prompt for name
        System.out.println("Name: ");
        Scanner name = new Scanner(System.in);
        String nameInput = name.nextLine();
        
        //prompt for the phone number
        System.out.println("Phone number: ");
        String phone = name.nextLine();
        
        
    }
}
