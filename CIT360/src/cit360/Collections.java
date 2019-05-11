/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author josecovarrubias
 */
public class Collections {
    public Collections(){
    System.out.println("**///////// A regular array in Java ///////////**"); 
        //let's create an commun array in Java name regArray
        int[] regArray;
        //we need to give the array the number of elements/items it will have
        regArray = new int[4];      
        //let's give each index a value, the [] brakets represent
        //the index possition in the array.
        regArray[0]=101; 
        regArray[1]=102;
        regArray[2]=103;
        regArray[3]=104;
//        System.out.println(regArray);
        /*This will print everything on the array. If I want to add more stuff
        to this array I will have to modify the array's index number on line 25
        and also add the new value to the actual array, or add a new method and
        receive new input from the user to be added to the array*/ 
        for(int i:regArray){
        System.out.print(i);
        System.out.println();}
////////////////////////////////////////////////////////////////////////////////
        /*              COLLECTION LIST         */
       System.out.print("\n////////////////////////////////////////////\n"
                       + "**///////// Collections LIST ///////////////////**");       
       /*Different from regular arrays, collections can be a lot more simple
         and complex at the same time. For example a List can hava duplicates
         of the data in it as long is the same type of data. 
         It means that I can have 2 or more of the same thing, as shown  here.*/
        List stuff = new ArrayList();
        //data stored in the List collection.
        stuff.add("car3");
        stuff.add("car1");
        stuff.add("car4");
        stuff.add("car4");
        //this displays the list.
        System.out.println();
        System.out.println(stuff);
        // Creating the comparator you give the SORT method the value to 
        // sort the list.
        Comparator sortStuff = null;
        stuff.sort(sortStuff); 
        System.out.println("was the new value added? "+stuff.add("car6"));
        System.out.println(stuff);
////////////////////////////////////////////////////////////////////////////////
        /*              COLLECTION SET 
        A collection Set can have different types of data as shown here,
        but they cannot repeat. This could be helpful whe working with arrays
        that require that data is enter only once. 
        */
        System.out.print("\n////////////////////////////////////////////\n"
                        + "**//////////// Collection SET /////////////////**\n"); 
        Set colSet = new HashSet(); //creates a new object of SET
        colSet.add(2);
        colSet.add("bike");
        colSet.add(3.5);
        
        System.out.println(colSet);
        System.out.println("#of index "+colSet.size());
        System.out.println();
        System.out.println("/////// same colSet array with ITERATOR /////////");
        Iterator colIterator = colSet.iterator();
        while(colIterator.hasNext()){
                Object data = colIterator.next();
                System.out.print(data + ", ");}
              
       //Here are some methods that can be used with most collection interfaces.
        System.out.println();
        System.out.println("Does this collection SET has 4 values? "+colSet.contains(4)); 
        System.out.println("Is this collection SET empty? "+colSet.isEmpty());
        System.out.println("Was the bike removed from this SET? "+colSet.remove("bike"));
        System.out.println(colSet);
        
 ///////////////////////////////////////////////////////////////////////////////
        /*             COLLECTION TREESET
        The TREESET is a collction that can sort the array for you. data has
        to be of the same type. Duplicates will not show. */
        System.out.println("\n////////////////////////////////////////////\n"
                          +"**////////// NOW USING THE TREESET //////////**");
        TreeSet sortItForMe = new TreeSet();
            sortItForMe.add(305);
            sortItForMe.add(303);
            sortItForMe.add(303); //this item will not show.
            sortItForMe.add(305); //this item will not show.
            sortItForMe.add(208);
            System.out.println(sortItForMe);
            
////////////////////////////////////////////////////////////////////////////////
        /*          COLLECTION MAP
        Map collections can function well creating list/arrays 
        that can be used in phone directories or other data lists that 
        need 2 sets of information. However, it does not take duplicate key 
        values, but it does on the second parameter value.
        */
        System.out.println("\n////////////////////////////////////////////\n"
                          + "**//////////// NOW USING THE MAP ////////////**");
        Map raceCarNum = new HashMap();
            raceCarNum.put("blue","1");
            raceCarNum.put("red","5");
            raceCarNum.put("black","3");
            raceCarNum.put("pink","8");   //example of duplicate value for the
            raceCarNum.put("gray","8");   //second parameter. This one is 
            raceCarNum.put("neon","8");   //allowed, but not the key value.
            System.out.println("Cars and their Numbers");
            System.out.println(raceCarNum);
            //it only prints the key/first value
            System.out.println(raceCarNum.keySet());
            //it prints both the key/1st value and the value/2nd value
            System.out.println(raceCarNum.entrySet());
            //this method is used to return the value of an specified key
            System.out.println("The GET method for the key red = " 
                              + raceCarNum.get("red"));
            
////////////////////////////////////////////////////////////////////////////////
        /*        COLLECTION QUEUE
        Queue collections have an interesting function, I will quote from 
        www.geeksforgeeks.org "Typically order elements in FIFO 
        (first-in-first-out) order except exceptions like PriorityQueue."
        */
        System.out.println("\n////////////////////////////////////////////\n"
                          + "**//////////// NOW USING QUEUE ////////////**");
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("one");
        myQueue.add("two");
        myQueue.add("three");
        myQueue.add("2");
        System.out.println("My QUEUE has the following strings = " 
                           + myQueue + "\n");
        //this returns the number of elements on the queue using size() method.
        System.out.println(myQueue.size() 
                + " (using the method size())is the size of the Queue.");
        //this returns the first/head of the queue using the peek() method.
        System.out.println("The method PEEK() in QUEUE [" + myQueue.peek() + "]");
        
        int i = 0;
        //this WHILE loop wil remove the head/first item in the QUEUE until 
        //there is not one left. 
        while (i < myQueue.size())
            System.out.println("I just removed " 
                              + myQueue.remove()// removes the value 
                              + " from the queue.");
        
        System.out.println("My QUEUE now contains = " + myQueue);

    } 
}
