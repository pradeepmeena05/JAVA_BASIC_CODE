import java.util.*;
public class Example {
    public static void main(String[]args)
    {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(221);
        list.add(7);
        list.add(22);
        list.add(70);
        list.add(21);
        list.add(90);
        list.add(111);
        list.add(45);

        Iterator<Integer>it=list.iterator();

        while(it.hasNext())
        {
            int i=it.next();
            if(i>50)
            {
                System.out.println(i);
            }
        }

        
    }
}