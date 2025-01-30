import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subStr = scanner.nextLine();
        System.out.println(countOccurrences(str, subStr));
    }

    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        int subStrLength = subStr.length();

        for (int i = 0; i <= str.length() - subStrLength; i++) {
            boolean match = true;

            for (int j = 0; j < subStrLength; j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        return count;
    }
}