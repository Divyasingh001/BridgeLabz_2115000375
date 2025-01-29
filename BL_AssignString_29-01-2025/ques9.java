import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] freq = new int[256];
        int maxCount = 0;
        char mostFrequentChar = '\0';

        for (char ch : input.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequentChar = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
