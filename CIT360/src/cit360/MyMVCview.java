
package cit360;

import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 * 
 * The VIEW.
 * It's in charge of presenting an interface to the user.
 * At no time does the view calls or knows of the controller or the model. 
 */
public class MyMVCview {
   
    //Set of variables only accessible in this class. 
   private String cName;
   private String cNumber;
   private String lookupName;
    
    //Method to create a message.
    public void WelcomeMessage(){
        System.out.println("=================================================\n"
                          + "This part is displayed by the VIEW as part of \n"
                          + "the MVC architecture.\n"
                          + "================================================");
    }
    //Method to create a contact.
    public void createContact(){
        Scanner contactInfo =new Scanner(System.in);
        
        //prompt for the name.
        System.out.println("Contact Name: ");
        cName = contactInfo.nextLine();
        
        //prompt for the number.
        System.out.println("Contact Number: ");
        cNumber = contactInfo.nextLine();
    }
    //Method to request the name.
    public String Cname(){
        return cName; 
    }
    //Method to request the number. 
    public String Cnumber(){
        return cNumber; 
    }
    //Method to prompt user for the name to lookup.
    public String lookupContact(){
        System.out.println("Who's number do you need to find? ");
        Scanner lookup = new Scanner(System.in);
        lookupName = lookup.nextLine();         //variable
        return lookupName;
    }
    /*
    * Method to display the contact information.
    * It takes one parameter which receives from the controller, and assigns it
    * to the variable "showName".
    * It also uses the global variable "lookupName", translates it to uppercase.
    */
    public void showMyContact(String showNumber){
        System.out.println(lookupName.toUpperCase() 
                          + "\'S phone number is: " 
                          + showNumber); 
    }
    
}
