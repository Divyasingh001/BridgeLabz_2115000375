import java.util.Scanner;

public class ques5L2{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitTemperature = inputScanner.nextDouble();
        
        double celsiusTemperature = (fahrenheitTemperature - 32) * 5 / 9;
        
        System.out.println("The " + fahrenheitTemperature + " Fahrenheit is " + celsiusTemperature + " Celsius");
    }
}
