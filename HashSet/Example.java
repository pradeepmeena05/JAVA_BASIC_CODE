import java.util.HashSet;

public class Example {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
   set.add(22);
   set.add(23);
   set.add(24);
   set.add(25);
   set.add(26);
   set.add(26);// hashset not contain duplicate element



    System.out.println(set);

    // System.out.println(set.contains(22));

    // System.out.println(set.remove(25));
    // System.out.println(set);

    // set.clear();
    // System.out.println(set);

    // System.out.println(set.size());

    // for (int i : set) {
    //     System.out.println(i);
    //   }

    
  }

}