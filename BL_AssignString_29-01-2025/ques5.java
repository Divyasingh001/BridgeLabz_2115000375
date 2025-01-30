import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(findLongestWord(sentence));
    }

    public static String findLongestWord(String sentence) {
        String longestWord = "", currentWord = "";
        int maxLength = 0, currentLength = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                currentWord += ch;
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    longestWord = currentWord;
                }
                currentWord = "";
                currentLength = 0;
            }
        }

        return longestWord;
    }
}