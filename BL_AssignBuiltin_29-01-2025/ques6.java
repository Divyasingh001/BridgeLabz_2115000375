import java.util.Scanner;

public class ques6{
    public static void main(String[] args) {
        int number = getInput("Enter a number: ");
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
