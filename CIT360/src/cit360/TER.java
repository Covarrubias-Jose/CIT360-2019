/*
 * This class will demonstrate the use of threads, executors, and runnables.
 */
package cit360;

/*
 *
 * @author josecovarrubias
 * * Thread Class vs Runnable Interface
 *
 * "1. If we extend the Thread class, our class cannot extend any other class 
 * because Java doesn’t support multiple inheritance. But, if we implement the
 * Runnable interface, our class can still extend other base classes.
 *
 * 2. We can achieve basic functionality of a thread by extending Thread class 
 * because it provides some inbuilt methods like yield(), interrupt() etc. 
 * that are not available in Runnable interface."
 *
 * Source www.geeksforgeeks.org  
 * https://www.geeksforgeeks.org/multithreading-in-java/
 */
public class TER {
    public TER(){
    System.out.println("\n===================================================\n"
                      + "====================================================\n"
                      + "Threads, Executors, and Runnables Class"
                      + "\n================================================\n");
    
    MyThreadThread FirstThread = new MyThreadThread();
   }
}
