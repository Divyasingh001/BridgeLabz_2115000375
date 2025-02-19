import java.util.*;

public class wordfrequencymap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordCount = new HashMap<>();

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        String[] words = input.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        scanner.close();
    }
}
