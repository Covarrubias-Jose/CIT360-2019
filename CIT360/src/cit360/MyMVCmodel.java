
package cit360;

import java.util.HashMap;

/*
 *
 * @author josecovarrubias
 * 
 * 
 * The model holds the data.
 */
public class MyMVCmodel {
    HashMap<String, String> contactHashmap = new HashMap();
    
    //Saves the contact information in a pair value HashMap.
    public void saveContactInfo(String name, String number){
        contactHashmap.put(name, number);
    }
    
    //Gets the contact information.
    public String getContactInfo(String number){
        String info;                       //The get.() obtains the value of 
        info = contactHashmap.get(number); // the key, in this case the number
        return info;                       // we are looking for.
                                           
    }
   
}
