import java.util.Scanner;

public class ques4L1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        int index = 0;
        double total = 0.0;
        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            double number = scanner.nextDouble();
            if (number <= 0) {
                break;
            }
            if (index >= 10) {
                System.out.println("Array limit reached.");
                break;
            }
            numbers[index] = number;
            index++;
        }
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\nSum of numbers: " + total);
        scanner.close();
    }
}