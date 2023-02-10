package Calculator;

// creating class calculator that is going to be doing the calculator operations
public class Calculator {
    public double[] add(double[] numbers){ // creating a method "add"

        double[] result = new double[1];
        result[0] = numbers[0] + numbers[1]; // adding the two numbers and saving it in a variable "result"
        return result;
    }

    public double[] subtract(double[] numbers){ // creating a method "subtract"

        double[] result1 = new double[1];
        result1[0] = numbers[0] - numbers[1]; // subtracting the two numbers and saving it in a variable "result"
        return result1;
    }

    public double[] divide(double[] numbers){ // creating a method "divide"

        double[] result = new double[1];
        result[0] = numbers[0] / numbers[1]; // dividing the two numbers and saving it in a variable "result"
        return result;
    }

    public double[] multiplication(double[] numbers){ // creating a method "multiplication"

        double[] result = new double[1];
        result[0] = numbers[0] * numbers[1]; // multiplying the two numbers and storing it in a variable "result"
        return result;
    }

    public double[] exponential(double[] numbers){ // creating a method "exponential"

        double[] result = new double[2];
        result[0] = numbers[0] * numbers[0]; // explonentiating the two numbers and storing it in a variable "result"
        result[1] = numbers[1] * numbers[1];
        return result;
    }

    public double[] sum(double[] array){ // creating a method "sum"
        double sum = 0;
        double variance = 0;
        //storing the sum of the elements of array in "sum" variable
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        return new double[]{sum};
    }

    public double[] variance(double[] array){ // creating a method "variance"
        double mean = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // calculating sum of the array
        }
        mean = sum / array.length; // calculating mean of the array

        double variance = 0;
        for (int i = 0; i < array.length; i++) {
            variance += Math.pow(array[i] - mean, 2);
        }
        variance /= array.length - 1; // calculating the variance of the array

        return new double[]{variance};
    }
    public double[] standarddev(double[] array) { // creating a method standarddev
        double[] result;
        double sum = 0.0;
        double standardDeviation = 0.0;
        int length = array.length;

        for (double num : array) {
            sum += num; // calculating sum of the elements of the array
        }

        double mean = sum / length;

        for (double num : array) {
            standardDeviation += Math.pow(num - mean, 2); // in the process of calculating standard deviation
        }
        result = new double[]{Math.sqrt(standardDeviation / length)}; // storing final answer in result
        return result;
    }
}
