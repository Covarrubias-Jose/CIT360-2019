
package cit360;

/*
 * @author Jose Covarrubias
 *
 * This class is used to demonstrate the use of APPLICATION CONTROLLER PATTERN
 */
public class AppConPattern extends Thread{
    
        @Override
        public void run(){ 
        //display instructions for the user.
        System.out.println("=================================================\n" 
                          + "Select to save a contact or to lookup a name. \n"
                          + "================================================");
        
        AppController callAPC = new AppController();
    }
}
