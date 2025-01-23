import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {   
            int sumusingFormula = n * (n + 1) / 2;
            int sumusingLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumusingLoop += i;
            }
            System.out.println("Sum using formula: " + sumusingFormula);
            System.out.println("Sum using for loop: " + sumusingLoop);
            if (sumusingFormula == sumusingLoop) {
                System.out.println("The results from both computations match.");
            } else {
                System.out.println("The results from both computations do not match.");
            }
        }
        scanner.close();
    }
}
