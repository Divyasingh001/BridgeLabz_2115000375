import java.util.Scanner;

public class ques3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.next();

        char[] userDefinedArray = getCharactersUsingMethod(inputString);
        char[] builtInArray = inputString.toCharArray();

        boolean comparisonResult = compareCharArrays(userDefinedArray, builtInArray);

        System.out.println("Characters using user-defined method: " + String.valueOf(userDefinedArray));
        System.out.println("Characters using built-in toCharArray method: " + String.valueOf(builtInArray));
        System.out.println("Comparison result: " + comparisonResult);
    }

    public static char[] getCharactersUsingMethod(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
