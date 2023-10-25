/* The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names can also begin with $ 
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names */


class Var{
   public static void main(String []args){
        int my_var=10;
        int $var=20;
        System.out.println(my_var+" "+$var);
    }
}