import java.util.*;

public class ques2L2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        int result1 = number1 + number2 * number3;
        int result2 = number1 * number2 + number3;
        int result3 = number3 + number1 / number2;
        int result4 = number1 % number2 + number3;
        
        System.out.println("The results of Integer Operations are " 
                            + result1 + ", " + result2 + ", " 
                            + result3 + " and " + result4);
    }
}
