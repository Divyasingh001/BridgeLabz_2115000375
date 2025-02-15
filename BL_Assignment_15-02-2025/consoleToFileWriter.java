import java.io.*;

public class consoleToFileWriter {
    public static void main(String[] args) {
        String filePath = "divya.txt";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath, true); 
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            while (true) {
                input = br.readLine(); 
                if ("exit".equalsIgnoreCase(input)) {
                    break; 
                }
                bw.write(input); 
                bw.newLine();
            }
            bw.close();
            fw.close();
            br.close();
            isr.close();

            System.out.println("User input has been saved to " + filePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
