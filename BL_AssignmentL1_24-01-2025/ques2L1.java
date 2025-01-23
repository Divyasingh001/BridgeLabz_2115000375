import java.util.Scanner;

public class ques2L1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
        scanner.close();
    }
}