import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char charToRemove = scanner.next().charAt(0);
        System.out.println("Modified string: " + removeCharacter(str, charToRemove));
    }

    public static String removeCharacter(String str, char charToRemove) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}