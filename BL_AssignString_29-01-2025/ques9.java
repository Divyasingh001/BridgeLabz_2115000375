import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(findMostFrequentCharacter(str));
    }

    public static char findMostFrequentCharacter(String str) {
        int maxCount = 0;
        char mostFrequentChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
}