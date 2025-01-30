import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 'a' + 'A');
            } else if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch - 'A' + 'a');
            } else {
                result += ch;
            }
        }

        return result;
    }
}