import java.util.Scanner;

public class ques6L3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first, second;
        String op;
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();
        
        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();
        double result = 0;
        boolean validOperator = true;

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid Operator!");
                validOperator = false;
                break;
        }
        if (validOperator) {
            System.out.println("The result is: " + result);
        }
        scanner.close();
    }
}

