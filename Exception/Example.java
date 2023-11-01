// public class Example {
    
//     public static void main(String args[]){


//         try {
//             int[] myNumbers = {1, 2, 3};
//             System.out.println(myNumbers[10]);// when error occur try block run
//           } catch (Exception e) {
//             System.out.println("Something went wrong.");
//           }

//           finally{
//             System.out.println("finally always run.");
//           }
//     }
// }

// The throw statement is used together with an exception type. 
// There are many exception types available in Java: ArithmeticException,
//  FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

public class Example {
    static void checkAge(int age) {
      if (age < 18) {
        throw new ArithmeticException("Access denied - You must be at least 18 years old.");
      }
      else {
        System.out.println("Access granted - You are old enough!");
      }
    }
  
    public static void main(String[] args) {
      checkAge(15); // Set age to 15 (which is below 18...)
     
    }
  }