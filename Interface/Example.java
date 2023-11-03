interface A{
    void display();
   
}

interface B{
    void show();
}

class demo implements  A,B{

    @Override
    public void display()
{
    System.out.println("in display");
}
 @Override
 public void show()
{
    System.out.println("in show");
}
}


public class Example{
    public static void main(String[]args)
    {
        demo obj=new demo();

        obj.display();
        obj.show();
    }
}