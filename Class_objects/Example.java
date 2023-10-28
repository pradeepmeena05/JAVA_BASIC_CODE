public class Example {
    

    public void print(){
        System.out.println("Public methods must be called by creating objects");
    }

    static void mystatic(){
        System.out.println("Static methods can be called without creating objects");
    }
    public static void main(String args[]){

        Example obj=new Example();
        obj.print();
        mystatic();

       // print(); its gives error because its public not static 
    }
}