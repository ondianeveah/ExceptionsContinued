package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void checkID(int age){
        if(age < 21){
            throw new ArithmeticException("Not old enough to drink");
        }else{
            System.out.println("Party like a rock star");
        }
    }

public static void main(String[] args) {
    try{
        checkID(13);
    }catch(ArithmeticException a) {
        System.out.println(a.getMessage());
    }


    


//        try{
//            int divideByZero = 5 / 0;
//            System.out.println(divideByZero);
//        }catch (ArithmeticException e){
//            System.out.println("ArithmeticException => " + e.getMessage());
//        } /*finally {
//            System.out.println("This will run no matter what");
//        } */

        try {
            int [] testArray = new int[3];
            testArray[0] = 1;
            testArray[1] = 10;
            testArray[2] = 100;
            System.out.println(testArray[3]);
        }catch(IndexOutOfBoundsException ex){
            System.out.println("You are trying to access an index out of the bounds of your array " + ex);
        }

        ListOfNumbers listOfNumbers = new ListOfNumbers();
        listOfNumbers.writeList();
    }
}
