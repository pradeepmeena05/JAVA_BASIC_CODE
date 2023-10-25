public class Logical {
    public static void main(String[] args) {
        
        int x = 5;
    System.out.println(x > 3 && x < 10); // 	Returns true if both statements are true 

    System.out.println(x > 3 || x < 4); //	Returns true if one of the statements is true

    System.out.println(!(x > 3 && x < 10)); //	Reverse the result, returns false if the result is true
    }
}
