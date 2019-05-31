
package cit360;

import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 * 
 * The VIEW
 * is in charge of presenting an interface to the user.
 */
public class MyMVCview {
    
   private String cName;
   private String cNumber;
   private String lookupName;
    
    //method to create a message.
    public void WelcomeMessage(){
        System.out.println("=================================================\n"
                          + "This part is displayed by the VIEW as part of \n"
                          + "the MVC architecture.\n"
                          + "================================================");
    }
    //method to create a contact.
    public void createContact(){
        Scanner contactInfo =new Scanner(System.in);
        System.out.println("Contact Name: ");
        cName = contactInfo.nextLine();
        
        System.out.println("Contact Number: ");
        cNumber = contactInfo.nextLine();
    }
    
    public String Cname(){
        return cName;
        
    }
    public String Cnumber(){
        return cNumber; 
    }
    public String lookupContact(){
        System.out.println("What contact you need to lookup for? ");
        Scanner lookup = new Scanner(System.in);
        lookupName = lookup.nextLine();
        return lookupName;
    }
    public void showMyContact(String showName){
        System.out.println(lookupName.toUpperCase() 
                          + "\'S phone number is: " 
                          + showName);
    }
    
}
