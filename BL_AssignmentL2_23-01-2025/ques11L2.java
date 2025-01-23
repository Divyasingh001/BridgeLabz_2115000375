import java.util.Scanner;

public class ques11L2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) { 
                    System.out.println(i); 
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}
