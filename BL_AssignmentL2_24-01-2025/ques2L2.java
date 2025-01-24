import java.util.Scanner;
public class YoungestAndTallestFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        System.out.println("Enter the age and height of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    System.out.print(friends[i] + "'s Age: ");
                    ages[i] = Integer.parseInt(scanner.nextLine());
                    if (ages[i] <= 0) {
                        throw new NumberFormatException("Age must be positive.");
                    }
                    System.out.print(friends[i] + "'s Height (in cm): ");
                    heights[i] = Double.parseDouble(scanner.nextLine());
                    if (heights[i] <= 0) {
                        throw new NumberFormatException("Height must be positive.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid numbers for age and height.");
                }
            }
        }
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("\nResults:");
        System.out.println("Youngest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
    }
}
