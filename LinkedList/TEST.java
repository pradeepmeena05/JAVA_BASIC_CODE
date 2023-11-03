 //For access all method please remove comment one by one

import java.util.LinkedList;
import java.util.Collections;

public class TEST {
   public static void main(String args[]){

       // Arraylist Syntax
       LinkedList<Integer>list=new LinkedList<>();
      // add items
      list.addFirst(22); //element will be add at first position.
       list.add(77);
       list.add(9);
       list.add(38);
       list.add(39);
       list.add(22);
       list.add(94);
       list.addLast(63); //element will be add at last position.

       System.out.println(list); 
      
    //  Access an item
        // System.out.println(list.getFirst());
        // System.out.println(list.getLast());

       //change an item
        //  list.set(0,88);
        // System.out.println(list.get(0));

        // remove an item
        // list.removeFirst();
        // list.removeLast();
        // System.out.println(list);
        

       // To remove all the elements in the ArrayList, use the clear() method:
    //    list.clear();
    //    System.out.println(list);

    //Arraylist size

    //  System.out.println(list.size());

   // Loop Through an ArrayList
    // for(int i:list) 
    // {
    //     System.out.println(i);
    // }

    //Sort an ArrayList

     Collections.sort(list);
     System.out.println("after sort "+list);

   
    
   
    }
}