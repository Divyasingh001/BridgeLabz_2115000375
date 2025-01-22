import java.util.*;

public class ques3L2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        
        double result1 = number1 + number2 * number3;
        double result2 = number1 * number2 + number3;
        double result3 = number3 + number1 / number2;
        double result4 = number1 % number2 + number3;
        
        System.out.println("The results of Double Operations are " 
                            + result1 + ", " + result2 + ", " 
                            + result3 + " and " + result4);
    }
}
