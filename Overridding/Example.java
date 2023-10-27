
class Base {

    void display(){
          System.out.println("This is base class");
    }    
}
class Derived extends Base{

    void display()
    {
        System.out.println("This is derived class");
    }
}

public class Example{
public static void main(String args[]){

    Base obj=new Derived();
    obj.display();
}
}