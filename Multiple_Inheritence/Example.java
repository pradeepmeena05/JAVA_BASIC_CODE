
class A{
   public  void display1()
    {
        System.out.println("A is a super class");
    }
}
class B extends A{
    public void display2()
    {
        System.out.println("B is a derived class of A");
    }
}
class C extends B{
   public void display3()
    {
        System.out.println("C  is a derived class of B");
    }
}

public class Example{
    public static void main(String args[]){

        C obj=new C();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}