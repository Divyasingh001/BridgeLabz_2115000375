import java.util.Scanner;

public class ReplaceWordInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();
        
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();
        
        System.out.println("Updated sentence: " + replaceWord(sentence, oldWord, newWord));
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        int i = 0;

        while (i < sentence.length()) {
            boolean match = true;

            for (int j = 0; j < oldWord.length(); j++) {
                if (i + j >= sentence.length() || sentence.charAt(i + j) != oldWord.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                result += newWord;
                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }

        return result;
    }
}
