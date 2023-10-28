import java.util.*;
public class Example{

    public static void main(String args[]){

        String str="pradeep";

        System.out.println("character at position 3 "+ str.charAt(3));

        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println("compare to method "+ myStr1.compareTo(myStr2));//if equals return 0 else 1;

        System.out.println("equals method "+myStr1.equals(myStr2));

        String Str1 = "Hello";
        String Str2 = "hello";
        System.out.println(Str1.compareToIgnoreCase(Str2));

        System.out.println("concat two string "+ Str1.concat(Str2));

        System.out.println("contains method "+Str1.contains("llo"));

        System.out.println(Str1.contains("LLO"));

        System.out.println("endsWith method "+Str1.endsWith("llo"));
        System.out.println("startsWith method "+Str2.startsWith("hel"));


        String ss="engineering";
        
        System.out.println("index of i= "+ss.indexOf("i"));
        System.out.println("index of i= "+ss.lastIndexOf("i"));

        System.out.println("length of string ss= "+ss.length());


        System.out.println("replace e with E = "+ss.replaceFirst("e","E"));
        System.out.println("replace e with E = "+ss.replaceAll("e","E"));

        System.out.println("covert string ss to uppercase= "+ss.toUpperCase());
        System.out.println("covert string ss to uppercase= "+ss.toLowerCase());

        System.out.println("substring = "+ss.substring(2,6));
        
        char ch[]=ss.toCharArray();

        for(char i:ch)
        System.out.println(i+" "+"ascii value "+ (int)i);

        String myStr = "       Hello World!       ";
        System.out.println(myStr);
         System.out.println(myStr.trim());

        
    }
}