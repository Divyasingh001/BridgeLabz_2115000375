import java.util.Scanner;

public class ques4L2{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsiusTemperature = inputScanner.nextDouble();
        
        double fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;
        
        System.out.println("The " + celsiusTemperature + " Celsius is " + fahrenheitTemperature + " Fahrenheit");
    }
}
