import java.util.Scanner;
public class ques14L1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
            long factorial = 1;
            int counter = number;
            while (counter > 1) {
                factorial *= counter;
                counter--;
            }
            System.out.println("The factorial of" + number + "is: " + factorial);
        }
        scanner.close();
    }
}
