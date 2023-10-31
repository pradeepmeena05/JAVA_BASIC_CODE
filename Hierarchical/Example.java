class parent{

    void diplay(){
        System.out.println("I am a parent of all child");
    }
}

class child1 extends parent{

    void print()
    {
        System.out.println("I am child1 of parent");
    }
}
class child2 extends parent{
    void show(){
        System.out.println("I am child2 of parent");
    }
}
public class Example{
    public static void main(String args[]){
        
        System.out.println("This is Hierarchical_inheritence");
        child1 obj2=new child1();
         obj2.diplay();
         obj2.print();

        child2 obj3=new child2();
         obj3.diplay();
         obj3.show();
        
    }
}