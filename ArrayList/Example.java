import java.util.ArrayList;
import java.util.Collections;

public class Example {
    public static void main(String args[]){

       // Arraylist Syntax
       ArrayList<Integer>list=new ArrayList<>();

       list.add(77);
       list.add(9);
       list.add(38);
       list.add(39);
       list.add(22);
       list.add(94);

       //Access an item
        // System.out.println(list.get(3));

       //change an item
         //list.set(0,88);
        // System.out.println(list.get(0));

        //remove an item
        // list.remove(0);

       // To remove all the elements in the ArrayList, use the clear() method:
    //    list.clear();

    //Arraylist size

    // System.out.println(list.size());

   // Loop Through an ArrayList
    // for(int i:list) //for each loop
    // {
    //     System.out.println(i);
    // }

    //Sort an ArrayList

     Collections.sort(list);

    for(int i:list) //for each loop
     {
         System.out.print("\n"+i);
     }

    

    }
}