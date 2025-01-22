import java.util.Scanner;

public class ques8L2{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String passengerName = inputScanner.nextLine();

        System.out.print("Enter your departure city: ");
        String departureCity = inputScanner.nextLine();

        System.out.print("Enter your transit city: ");
        String transitCity = inputScanner.nextLine();

        System.out.print("Enter your destination city: ");
        String destinationCity = inputScanner.nextLine();

        System.out.print("Enter the distance from " + departureCity + " to " + transitCity + " in miles: ");
        double distanceToTransit = inputScanner.nextDouble();

        System.out.print("Enter the distance from " + transitCity + " to " + destinationCity + " in miles: ");
        double distanceToDestination = inputScanner.nextDouble();

        System.out.print("Enter the time taken for the journey in hours: ");
        double journeyTime = inputScanner.nextDouble();

        double totalDistance = distanceToTransit + distanceToDestination;
        double averageSpeed = totalDistance / journeyTime;

        System.out.print("Enter the total fee: ");
        double totalFee = inputScanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = inputScanner.nextDouble();

        double discountAmount = totalFee * (discountPercentage / 100);
        double finalFee = totalFee - discountAmount;

        System.out.println("Journey Summary:");
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " miles/hour");
        System.out.println("Final Fee after discount: $" + finalFee);
    }
}
