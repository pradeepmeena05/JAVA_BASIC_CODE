public class Example {
    
  

        public int sum(int a,int b)
        {
            return a+b;
        }

        public float sum(float a,float b,float c)
        {
            return a+b+c;
        }
    

    public static void main(String args[]){
         
          Example obj=new Example();

         System.out.println("sum of integer number "+obj.sum(10,9));
         System.out.println("sum of floating number "+obj.sum(10,99,82));

    }
}
