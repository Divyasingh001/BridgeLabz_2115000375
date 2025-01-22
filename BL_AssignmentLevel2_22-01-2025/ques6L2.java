import java.util.Scanner;

public class ques6L2{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter your base salary: ");
        double baseSalary = inputScanner.nextDouble();

        System.out.print("Enter your bonus amount: ");
        double bonusAmount = inputScanner.nextDouble();

        double totalIncome = baseSalary + bonusAmount;

        System.out.println("The base salary is INR " + baseSalary + " and the bonus is INR " + bonusAmount 
                           + ". Hence, the total income is INR " + totalIncome);
    }
}
