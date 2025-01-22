import java.util.Scanner;

public class ques7L2{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first number (firstNumber): ");
        int firstNumber = inputScanner.nextInt();

        System.out.print("Enter the second number (secondNumber): ");
        int secondNumber = inputScanner.nextInt();

        int temporaryStorage = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporaryStorage;

        System.out.println("The swapped numbers are " + firstNumber + " and " + secondNumber);
    }
}
