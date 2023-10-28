public class Main {
    public static void main(String args[])
    {
         System.out.println("sum of 10 numbers is "+sum(10));
    }

    public static int sum(int n)
    {
        if(n>0)
        {
            return n +sum(n-1);
        }
        else
        {
            return 0;
        }
    }
}
