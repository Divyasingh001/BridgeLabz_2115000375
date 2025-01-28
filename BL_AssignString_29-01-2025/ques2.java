import java.util.Scanner;

public class ques2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        String substringUsingCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);
        String substringUsingBuiltIn = inputString.substring(startIndex, endIndex);

        boolean comparisonResult = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        System.out.println("Substring using charAt method: " + substringUsingCharAt);
        System.out.println("Substring using built-in substring method: " + substringUsingBuiltIn);
        System.out.println("Comparison result: " + comparisonResult);
    }

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

	