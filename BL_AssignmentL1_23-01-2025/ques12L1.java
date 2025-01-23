import java.util.Scanner;

public class ques12L1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumUsingFormula = n * (n + 1) / 2;
            int sumUsingLoop = 0;
            int counter = 1;
            while (counter <= n) {
                sumUsingLoop += counter;
                counter++;
            }
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using while loop: " + sumUsingLoop);
            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("The results from both computations match.");
            } else {
                System.out.println("The results from both computations do not match.");
            }
        }
        scanner.close();
    }
}
