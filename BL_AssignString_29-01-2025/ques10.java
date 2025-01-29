import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);
        String modifiedStr = str.replaceAll(String.valueOf(charToRemove), "");
        System.out.println("Modified String: " + modifiedStr);
    }
}
