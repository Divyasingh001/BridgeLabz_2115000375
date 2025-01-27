import java.util.Scanner;

public class ques1L1 {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("The Simple Interest is "+ simpleInterest+" for Principal "+ principal +", Rate of Interest "+rate +", and Time"+ time +" years.\n");
        scanner.close();
    }
}
