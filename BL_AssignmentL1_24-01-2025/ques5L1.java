import java.util.Scanner;

public class ques5L1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] multiplicationResults = new int[4]; 
        for (int i = 0; i < 4; i++) {
            multiplicationResults[i] = number * (i + 6); 
        }
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " x " + (i + 6) + " = " + multiplicationResults[i]);
        }
        scanner.close();
    }
}