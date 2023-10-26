public class Example {
    public static void main(String args[]){

        String [] student={"name","age","roll.no"};

        for(int i=0;i<student.length;i++){
            System.out.println(student[i]);
        }

        int arr[]={22,44,55,32,2,214543,133};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //Java Multi-Dimensional Arrays

        int mularr[][]={{2,3,45,6},{66,8,2,55,}};

        for(int i=0;i<mularr.length;i++)
        {
          for(int j=0;j<mularr[i].length;j++)
          {
            System.out.println(mularr[i][j]);
          }
        }
    }
}