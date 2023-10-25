/* Data types are divided into two groups:

Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)


Data Type	Size	Description
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values
 */


package JAVA_BASIC_CODE.Data_Type;

public class Data {
    public static void main(String[] args) {
        
       int myNum=55;

       String mystr="pradeep";

       char myLetter = 'D';    

       boolean mybool=true;

       float myfloat=5.55f;

       System.out.println(myNum +" "+ mystr +" "+ myLetter+ " "+ myfloat+" "+mybool);

    }
}
