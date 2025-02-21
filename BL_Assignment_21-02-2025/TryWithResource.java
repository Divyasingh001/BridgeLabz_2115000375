import java.io.*;

public class TryWithResource {
    public static void main(String[] args) {
        String filePath = "info.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First Line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
