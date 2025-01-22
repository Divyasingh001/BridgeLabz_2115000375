import java.util.Scanner;

public class ques12L2{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = inputScanner.nextDouble();

        double weightInKilograms = weightInPounds / 2.2;

        System.out.println("The weight of the person is " + weightInPounds + " pounds, which is equivalent to "
                + weightInKilograms + " kilograms.");
    }
}
