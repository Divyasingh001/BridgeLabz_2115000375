import java.util.Scanner;

class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base here-");
        double b = sc.nextDouble();
        System.out.print("Enter the exponent here-");
        double e= sc.nextDouble();
        double r = Math.pow(b, e);
        System.out.println(b + " raised to the power of " + e+ " is " + r);
    }
}
