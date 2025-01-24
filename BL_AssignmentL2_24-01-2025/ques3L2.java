import java.util.Scanner;

public class LargestAndSecondLargestFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0; 
        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Max digit limit reached, remaining digits are not added.");
                break;
            }
            digits[index] = number % 10; 
            number /= 10; 
            index++;
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}

