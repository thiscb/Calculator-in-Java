package Calculator;

import java.util.Scanner; // Using Scanner class so we can input numbers to use operations on it
import java.io.*; //using java.io class to  provides a set of input streams and a set of output streams used to
// read and write data to files or other input and output sources.
public class CalculatorUserInput {
    Scanner sc = new Scanner(System.in); // we create new instance of the scanner class
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // we create new instance of the BufferedReader class
    double[] numbers = new double[2]; // declaring array "numbers" with double data type
    double[] array; // declaring array "array" with double data type

    public double[] insertNumbers() {
        System.out.println("Enter First Number: ");
        // input first number from user
        numbers[0] = sc.nextDouble();

        System.out.println("Enter Second Number: ");
        // input second number from user
        numbers[1] = sc.nextDouble();

        return numbers;
    }

    public double[] insertArray() {
        System.out.println("Enter size of array: ");
        // Getting size of array from user
        int size = sc.nextInt();
        array = new double[size];
        // using for loop to create a user input array on run time
        for(int i=0; i<array.length ; i++) {
            System.out.print("Enter Number " + i + " : ");
            array[i] = sc.nextDouble();
        }
        return array; // returning our final array
    }
}
