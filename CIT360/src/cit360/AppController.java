/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.HashMap;

/**
 *
 * @author josecovarrubias
 */
public class AppController {
    
    private HashMap<String, Handler> contactMap;
    
    public AppController(){
        // The next three lines create and populate the HashMap each time there 
        // is an object created.
        contactMap = new HashMap<String, Handler>();
        contactMap.put("save", new addContactHandler());
        contactMap.put("lookup", new lookupContactHandler());
    }
    
    public Object doCommand(String commandName, HashMap<String, Object> commandData) throws Exception{
        
        Handler command = contactMap.getOrDefault(commandName, null);
        if (command == null){
            throw new Exception("AppController class message " + commandName);
        }
        
        return command.handleIt(commandData); 
    }
}
