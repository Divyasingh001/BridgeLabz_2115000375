import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        double num1 = getInput("Enter first number: ");
        double num2 = getInput("Enter second number: ");
        char operation = getOperation();
        
        double result = performOperation(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    public static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose operation (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static double performOperation(double a, double b, char op) {
        switch (op) {
            case '+': return add(a, b);
            case '-': return subtract(a, b);
            case '*': return multiply(a, b);
            case '/': return divide(a, b);
            default: 
                System.out.println("Invalid operation.");
                return 0;
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}
