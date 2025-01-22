import java.util.Scanner;

public class ques9L2{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double lengthOfSide1 = inputScanner.nextDouble();
        System.out.print("Enter the length of side 2 (in meters): ");
        double lengthOfSide2 = inputScanner.nextDouble();
        System.out.print("Enter the length of side 3 (in meters): ");
        double lengthOfSide3 = inputScanner.nextDouble();

        double trackPerimeter = lengthOfSide1 + lengthOfSide2 + lengthOfSide3;

        double distanceToRun = 5000; // 5 kilometers in meters

        double totalRounds = distanceToRun / trackPerimeter;

        System.out.println("The total number of rounds the athlete will run is " 
                           + Math.ceil(totalRounds) + " to complete 5 km");
    }
}
