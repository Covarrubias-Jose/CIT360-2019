/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 */
public class addContactHandler implements Handler {

    public addContactHandler() {
    }
    
    @Override
    public Object handleIt(HashMap<String, Object> data){
        
        //prompt for name
        System.out.println("Name: ");
        Scanner contactInfo = new Scanner(System.in);
        String nameInput = contactInfo.nextLine();
        
        //prompt for the phone number
        System.out.println("Phone number: ");
        String phone = contactInfo.nextLine(); 
        return null; 
    }
}
