 class one{

    public void printone()
    {
        System.out.println("This is one class");
    }
}
class two extends one{
    public void printtwo()
    {
        System.out.println("This is two class");
    }
}
public class Example{
    public static void main(String args[]){

      
        two obj2=new two();

        obj2.printtwo();
        obj2.printone();

       

    }
}