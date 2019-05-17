
package cit360;

/*
 * @author josecovarrubias
 */
public class MyThreadThread extends Thread{
    @Override
    public void run(){
        try{
          System.out.println("Calling the thread in the extended class = " 
                          + Thread.currentThread().getName());//Get thread name
        }
        catch (Exception e){
          System.out.println("There was an Exception. ");
        }
    }
    
}
