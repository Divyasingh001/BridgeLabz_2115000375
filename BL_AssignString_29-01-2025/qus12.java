import java.util.Scanner;

public class ques12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();
        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();
        String modifiedSentence = sentence.replace(wordToReplace, replacementWord);
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}
