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
public class Christmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Integer thisMonth = 7;
       Integer theYear = 12;
       
       ToChristmas tochristmas = new ToChristmas();
       Integer celebrate = tochristmas.countMounths(thisMonth, theYear);
       
       System.out.println("In "+celebrate+ " months you can celebrate Christmas.");
    }
    
}
