package ex_02_Java_Basics;

public class Lab014_Variables {
    public static void main(String[] args){

        //Variable is a memory location that can hold data which can be changed anytime

        //DECLARATION

        //APPROACH 1 - IF VARIABLES ARE BELONGS TO SAME DATATYPE

        int a=100,b=200,c=300;

        //APPROACH 2 - IF VARIABLES ARE OF DIFFERENT DATATYPE

        int num1=100;
        double num2=30.5;
        char ch='z';

        //APPROACH 3 - IF VARIABLES OF SAME DATATYPE - DECLARATION IN SINGLE LINE AND THEN DEFINITION

        int x,y,z;
        x=45;
        y=55;
        z=299;

        System.out.println("the value of a is" +a);
        System.out.println("the value of b is" +b);
        System.out.println("the value of c is" +c);
        System.out.println("the value of num1 is" +num1);
        System.out.println("the value of num2 is" +num2);
        System.out.println("the value of ch is" +ch);
        System.out.println("the value of x is" +x);
        System.out.println("the value of y is" +y);
        System.out.println("the value of z is" +z);
    }
}
