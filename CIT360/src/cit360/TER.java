/*
 * This class will demonstrate the use of threads, executors, and runnables.
 */
package cit360;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
    @SuppressWarnings("SleepWhileInLoop")
    public TER() throws InterruptedException{
    System.out.println("\n===================================================\n"
                      + "===================================================\n"
                      + "Threads, Executors, and Runnables Class\n"
                      + "==================================================\n");
    
    /*
    Calling an EXTENDS THREAD class requires that we create an object per 
    thread, which we can do manually or with a LOOP.
    What is importatnt to note here is that if I was to call the 
    "MyThreadThread" class using only one instance, I will get 
    an exception/error.
    */
    MyThreadThread FirstThread = new MyThreadThread();
    FirstThread.start(); //If I use this method again without creating another
    Thread.sleep(300);   //instance I get the error. 
    MyThreadThread SecondThread = new MyThreadThread();
    SecondThread.start();
    
    // Creating multiple threads with a loop in the extends class
    for (int i = 0; i < 4; i++){
        Thread.sleep(300);
        MyThreadThread MultiThread = new MyThreadThread();
        MultiThread.start();
    }
    
    MyThreadThread ThirdThread = new MyThreadThread();
    ThirdThread.run();  //I can repeat this method many times
    ThirdThread.run();  //not possible with the start() method
    
    for (int i = 0; i < 4; i++){
    MyThreadThread MultiThread2 = new MyThreadThread();
    MultiThread2.run();
    }
    
    MyThreadRun runThread =  new MyThreadRun();
    runThread.run();
    runThread.run();
    runThread.run();
    
    MyThreadRun runThread2 =  new MyThreadRun();
    runThread2.start("Jose's "); //passing a parameter into the method
    
    Thread.sleep(500);
    System.out.println("Let's use the Executors now.");
    Thread.sleep(500);
    
    MyThreadRun runThread3 =  new MyThreadRun();
        // this executor has the variable of "nameIt"
        // This is similar to an array
        ExecutorService nameIt = Executors.newFixedThreadPool(3);
        Thread.sleep(500);
        
        nameIt.execute(runThread3);
        // This "for" loop is started by the executor.          
          for (int j = 0; j < 3; j++) {
              System.out.println("A new line in the implements interface = "
                                +Thread.currentThread().getName()); 
                    } 
        // With executors you have to manualy shutdown it, otherwise 
        // it will keep running on the RAM.
         nameIt.shutdown();
                
        System.out.println("END OF THREAD ");
   }
}
