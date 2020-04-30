package exceptions;

public class ListOfNumbers {
    // instance variable | Property
    public int[] arrayOfNumbers = new int[10];

    public void writeList() {
        try {
            arrayOfNumbers[10] = 11;
        } catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
        }
    }
}
