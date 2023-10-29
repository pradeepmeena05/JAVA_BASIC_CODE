class myclass{

    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n)
    {
         name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
}

public class Empolyee{
    public static void main(String args[]){

        myclass obj=new myclass();
        //  obj.name="pradeep";  Empolyee.java:19: error: name has private access in myclass
         
             
        obj.setName("pradeep meena");
        obj.setId(101);
        System.out.println("name: "+obj.getName());
        System.out.println("Id: "+obj.getId());
    }
}