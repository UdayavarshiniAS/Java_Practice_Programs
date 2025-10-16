package ex_02_Java_Basics;

public class Lab021_Constants {
    public static void main(String[] args){

        //Normal variable ----> if value is assigned once, can be changed at anytime

        int nvar=23;
        nvar=2004; // value of the variable is changed

        System.out.println("Normal variable : "+nvar);

        //Constant variable

        //A variable can be made as constant by using the final keyword

        //syntax:  final datatype var_name= value;

        //example:

        final double pi=3.14;

        System.out.println("Constant variable : "+pi);
    }
}
