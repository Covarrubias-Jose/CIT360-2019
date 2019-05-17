/*
 */
package cit360;

/**
 *
 * @author josecovarrubias
 */
class MyThreadRun implements Runnable {
       @Override 
       public void run(){
          System.out.println("Calling the thread in the implements interface = " 
                          + Thread.currentThread().getName());//Get thread name
        }
       /*
       In the IMPLEMENTS interface if I don't add a method start() I can't 
       call this class with the object instance and use start() as I do
       in the extends class.
       */
       public void start(String name){ 
          String myName = name;
        System.out.println("Calling the thread in the implements interface = "
                          + myName 
                          + Thread.currentThread().getName());//Get thread name
        }
}
