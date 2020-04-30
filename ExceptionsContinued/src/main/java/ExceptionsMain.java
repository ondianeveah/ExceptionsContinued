import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class ExceptionsMain {
    public static void main(String[] args) {
        numbersExceptionHandling();
        calculateSalary(60.0, 9.75);
        createNewFile();
        createNewFileRethrow();
        }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        Scanner fileReader = null;
        try{
            file.createNewFile();
        }catch(IOException e){ //can catch the superclass "Exception", any of parents of IOException can be used
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow()  {
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch(IOException e){ //can catch the superclass "Exception", any of parents of IOException can be used
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        try(Scanner fileReader =  new Scanner(file)){ //only works with classes that implement closeable and autocloseable interfaces
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }/*catch (Exception e){ //compilation error because exception is the top class and there's no way the code can make it to FileNotFound/InputMismatch, if added to end will work
        }*/ catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }
    }

    public static void calculateSalary(double hours, double rate) {
        if(hours > 40){
            throw new IllegalArgumentException("We do not allow overtime");
        }
    }
}

