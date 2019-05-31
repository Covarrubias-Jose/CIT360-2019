
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
    
    //save the contact information in a pair value HashMap.
    public void saveContactInfo(String name, String number){
        contactHashmap.put(name, number);
    }
    
    //get the contact information.
    public String getContactInfo(String name){
        String info;
        info = contactHashmap.get(name);
        return info;
     
    }
   
}
