import java.util.HashMap;
public class Example {
    public static void main(String[] args) {

        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    
        // Add keys and values (Name, jersey no)
        map.put("virat", 18);
        map.put("dhoni", 7);
        map.put("jadeja", 18);

        System.out.println(map);

        // Access an Item

        // System.out.println(map.get("dhoni")); //it gives value of key

        // Remove an Item
        // System.out.println(map.remove("dhoni"));
        // System.out.println(map);


        // To remove all items, use the clear() method:
        // map.clear();
        // System.out.println(map);
      
        // System.out.println(map.size());


        // Use the keySet() method if you only want the keys, and use the values() method if you only want the values

        // System.out.println("only keys will be print");
        // for(String i:map.keySet())
        // {
        //     System.out.println(i);
        // }

        // System.out.println("only values will be print");
        // for(int i:map.values())
        // {
        //     System.out.println(i);
        // }


    
    
}
}