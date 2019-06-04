
package cit360;

/**
 *
 * @author josecovarrubias
 * 
 * The Controller makes it possible for the View and the Model to use the data
 * from the user to be manipulated. 
 */
public class MyMVCcontroller{
    
   
    public void MyMVCcontroller(){
        //Creates Object of the VIEW.
        MyMVCview ContactNew = new MyMVCview();

        //Calls the method in the VIEW to create the welcome message.
        ContactNew.WelcomeMessage();
       
        //Calls the method in the VIEW to create a contact.
        ContactNew.createContact();
        
        //Creates object of the MODEL.
        MyMVCmodel callingModel = new MyMVCmodel();
        
        // Uses the method of the MODEL to save the data. The name and number
        // are sent as parameters extracted from the VIEW 
        callingModel.saveContactInfo(ContactNew.Cname(), ContactNew.Cnumber());
        
        //Uses the method of the MODEL to get info from the HASHMAP.
        String info = callingModel.getContactInfo(ContactNew.lookupContact());
        
        ContactNew.showMyContact(info);
        

    }
}
