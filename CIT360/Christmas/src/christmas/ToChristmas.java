/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmas;

/**
 *
 * @author josecovarrubias
 */
public class ToChristmas {
    
    // Method to calculate how many months away is Christmas.
    // It taks two paramethers.
    public Integer countMounths(Integer currentMonth, Integer monthsOfTheYear){
        
        // Logic, it substracts the current month from 
        // the total months of the year.
        Integer monthsToChristmas = monthsOfTheYear - currentMonth;
        
        // Returns the result of the above logic.
        return monthsToChristmas;
	}
    
    // Just a simple method to showcase the assertNull.
    public String countWithString(){
        String justANull = null;
        return justANull; 
    }
    
    public String[] ChristmasMonth(){
        String[] DecMonth = {"Christmas"," is", " in", " December."};
        return DecMonth; 
    }
}
