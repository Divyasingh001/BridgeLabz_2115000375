import java.util.*;

public class ques1L2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " 
                           + dividend + " and " + divisor);
    }
}

