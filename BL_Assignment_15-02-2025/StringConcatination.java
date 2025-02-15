import java.util.*;

class StringConcatination {
    public static String concatenateStrings(String[] words) {
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word); 
        }
        return sb.toString(); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] words = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        String result = concatenateStrings(words);  
        System.out.println("Concatenated String: " + result);
        sc.close();
    }
}
