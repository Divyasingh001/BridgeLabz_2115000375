import java.util.Scanner;

public class ques15L1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factorial using for loop");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
       
            long factorial = 1; 
            for (int i = 1; i <= number; i++) {
                factorial *= i; 
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        scanner.close();
    }
}
