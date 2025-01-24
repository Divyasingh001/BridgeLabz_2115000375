import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEE_COUNT = 10;
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        System.out.println("Enter the salary and years of service for each of the 10 employees:");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            while (true) {
                try {
                    System.out.print("Employee " + (i + 1) + " Salary: ");
                    salaries[i] = Double.parseDouble(scanner.nextLine());
                    if (salaries[i] <= 0) {
                        throw new NumberFormatException("Invalid salary.");
                    }
                    System.out.print("Employee " + (i + 1) + " Years of Service: ");
                    yearsOfService[i] = Double.parseDouble(scanner.nextLine());
                    if (yearsOfService[i] < 0) {
                        throw new NumberFormatException("Invalid years of service.");
                    }
                    break; 
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee Bonus and Salary Details:");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d - Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f\n",
                              (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }
        System.out.println("\nSummary:");
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}
