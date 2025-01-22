import java.util.Scanner;

public class ques11L2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principalAmount = inputScanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double interestRate = inputScanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double timePeriod = inputScanner.nextDouble();

        double simpleInterest = (principalAmount * interestRate * timePeriod) / 100;

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal amount " 
                           + principalAmount + ", Rate of Interest " + interestRate + "% and Time period " + timePeriod + " years.");
    }
}
