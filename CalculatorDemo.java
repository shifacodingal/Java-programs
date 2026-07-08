// Java Program: Calculator using Inheritance

// Parent Class
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

// Child Class
class AdvancedCalculator extends Calculator {

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not possible.");
            return 0;
        }
        return (double) a / b;
    }
}

// Main Class
public class CalculatorDemo {

    public static void main(String[] args) {

        // Creating object of child class
        AdvancedCalculator calc = new AdvancedCalculator();

        int num1 = 20;
        int num2 = 5;

        System.out.println("First Number : " + num1);
        System.out.println("Second Number: " + num2);

        System.out.println("\nCalculator Operations");
        System.out.println("----------------------");
        System.out.println("Addition       : " + calc.add(num1, num2));
        System.out.println("Subtraction    : " + calc.subtract(num1, num2));
        System.out.println("Multiplication : " + calc.multiply(num1, num2));
        System.out.println("Division       : " + calc.divide(num1, num2));
    }
}
