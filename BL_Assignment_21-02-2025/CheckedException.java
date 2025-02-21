import java.io.*;

public class CheckedException{
    public static void main(String[] args) {
        String filePath = "data.txt"; 
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("File Contents:");
            while ((line = reader.readLine()) != null) { 
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath); 
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage()); 
        }
    }
}
