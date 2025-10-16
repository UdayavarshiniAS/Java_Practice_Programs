package ex_02_Java_Basics;

public class Lab018_Variables {
    public static void main(String[] args){

        //can we declare Enum as a variable name

        /* yes, its possible since enum is the keyword but not Enum
        Java is case sensitive*/

        //Keywords should not/cannot be used as varible names or function name or class name in java

        double Enum=89.01234;

        System.out.println("The value of Enum is " +Enum);


        /*can we have any value for boolean datatype
                No, for boolean variable only two values are possible either true or false
*/
        boolean val= true;

        System.out.println("the value of the variable val is: " +val);

    }
}
