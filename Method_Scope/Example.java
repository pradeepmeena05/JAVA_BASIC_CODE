public class Example {
    public static void main(String args[]){
      int y=10;
        //block scope
        {
            int x=7;
            System.out.println("x is in local scope "+x);
            System.out.println(" y is in global  scope "+y);
        }

        System.out.println("global  scope "+y);
    }
}