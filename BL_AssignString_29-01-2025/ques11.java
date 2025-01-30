import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String sortedStr1 = sortString(str1);
        String sortedStr2 = sortString(str2);

        for (int i = 0; i < sortedStr1.length(); i++) {
            if (sortedStr1.charAt(i) != sortedStr2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static String sortString(String str) {
        String sorted = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sorted += ch;
        }
        
        char[] arr = sorted.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return new String(arr);
    }
}