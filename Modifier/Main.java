public class Main {
    // private	The code is only accessible within the declared class
    private String fname = "John";
    private String lname = "Doe";
    private String email = "john@doe.com";
    private int age = 24;
    
    public static void main(String[] args) {
      Main myObj = new Main();
       
      System.out.println("Name: " + myObj.fname + " " + myObj.lname);
      System.out.println("Email: " + myObj.email);
      System.out.println("Age: " + myObj.age);
}
}
 
//  class base {
    
//     protected void display(){
//         System.out.print("protected access modifier");
//     }
// }

// class child extends base{

// }

// class Main{
//     public static void main(String args[])
//     {
//         child obj=new child();
//         obj.display();
//     }
// }
 

//  abstract class A{

//     abstract void show();

// }

// class B extends A{
//     void show()
//     {
//         System.out.println("This is concept of abstract class");
//     }
// }

// public class Main{
//     public static void main(String args[]){

//         B obj=new B();
//         obj.show();
//     }
// }
