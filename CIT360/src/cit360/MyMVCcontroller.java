
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
        //Create Object of the VIEW.
        MyMVCview ContactNew = new MyMVCview();

        //This instance is to display the welcome message.
        ContactNew.WelcomeMessage();

        ContactNew.createContact();
        
        //create object of the MODEL.
        MyMVCmodel callingModel = new MyMVCmodel();
        
        //use the method of the MODEL to save the data.
        callingModel.saveContactInfo(ContactNew.Cname(), ContactNew.Cnumber());
        
        //use the method of the MODEL to get info from the HASHMAP.
        String info = callingModel.getContactInfo(ContactNew.lookupContact());
        
        ContactNew.showMyContact(info);
        

    }
}
