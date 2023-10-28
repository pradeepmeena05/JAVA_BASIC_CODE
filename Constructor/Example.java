public class Example{

    int age;
    String name;

    public Example(int myage,String myname )
    {
       age=myage;
       name=myname;
    }

     public static void main(String args[]){

        Example obj=new Example(19,"pradeep");

        System.out.println(obj.age+" "+obj.name);
     }
}