import java.util.Scanner;

public class ques10L2{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the total number of chocolates: ");
        int totalChocolates = inputScanner.nextInt();

        System.out.print("Enter the number of children: ");
        int totalChildren = inputScanner.nextInt();

        int chocolatesPerChild = totalChocolates / totalChildren;
        int remainingChocolates = totalChocolates % totalChildren;

        System.out.println("Each child receives " + chocolatesPerChild + " chocolates, and there are " 
                           + remainingChocolates + " remaining chocolates.");
    }
}
