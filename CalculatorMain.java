package Calculator;

/*
By Najeeb Fariduddin Saiyed
PRN - 21070126057
AIML A3
*/

import java.util.Scanner; // Using Scanner class so we can input numbers to use operations on it

public class CalculatorMain{
    static double[] array;    // "array" is declared which as array of elements of type double
    static double[] result;   // "result" is declared as an array of elements of type double
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // we create new instance of the scanner class

        Calculator Calculator = new Calculator();  // creating object for the class 'Calculator'

        CalculatorUserInput CalculatorUserInput = new CalculatorUserInput(); // creating object for the class 'CalculatorUserInput'

        String text = "Calculator Program\n 1. Add\n 2. Subtract\n 3. Divide\n 4. Multiplication\n 5. Exponential\n 6. Sum\n 7. Variance\n 8. Std Dev\n 9. Exit \n\nEnter your choice: ";
        System.out.println(text);
        String input = sc.nextLine();

        // Using switch case for different operations so user can choose we operation is to be carried out by him/her.
        // here we take 'input' as input
        switch(input){
            case "1":
                array = CalculatorUserInput.insertNumbers(); // storing numbers in 'array' variable
                result = Calculator.add(array); // storing result in 'result' variable
                System.out.println("Result of addition is: " + result[0]);
                System.out.println(" ");

            case "2":
                array = CalculatorUserInput.insertNumbers(); // storing numbers in 'array' variable
                result = Calculator.subtract(array); // storing result in 'result' variable
                System.out.println("Result of subtraction is: " + result[0]);
                System.out.println(" ");

            case "3":
                array = CalculatorUserInput.insertNumbers(); // storing numbers in 'array' variable
                result = Calculator.divide(array); // storing result in 'result' variable
                System.out.println("Result of division is: " + result[0]);
                System.out.println(" ");

            case "4":
                array = CalculatorUserInput.insertNumbers(); // storing numbers in 'array' variable
                result = Calculator.multiplication(array); // storing result in 'result' variable
                System.out.println("Result of multiplication is: " + result[0]);
                System.out.println(" ");

            case "5":
                array = CalculatorUserInput.insertNumbers(); // storing numbers in 'array' variable
                result = Calculator.exponential(array); // storing result in 'result' variable
                System.out.println("Result of exponentiation is: " + result[0] + " and " + result[1]);
                System.out.println(" ");

            case "6":
                array = CalculatorUserInput.insertArray(); // storing arrays of numbers in 'array' variable
                result = Calculator.sum(array); // storing result in 'result' variable
                System.out.println("Result of sum is: " + result[0]);
                System.out.println(" ");

            case "7":
                array = CalculatorUserInput.insertArray(); // storing arrays of numbers in 'array' variable
                result = Calculator.variance(array); // storing result in 'result' variable
                System.out.println("Result of variance is: " + result[0]);
                System.out.println(" ");

            case "8":
                array = CalculatorUserInput.insertArray(); // storing arrays of numbers in 'array' variable
                result = Calculator.standarddev(array); // storing result in 'result' variable
                System.out.println("Result of standard deviation is: " + result[0]);
                System.out.println(" ");

            case "9":
                break; // for exiting switch case

            default:
                System.out.print("Please check your input and try again!"); // If user inputs wrong input
        }
    }

}
