import java.util.Scanner;

public class ques17L1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service.");
        }
        scanner.close();
    }
}
