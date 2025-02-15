import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        compareStringConcatenation();
        compareFileReading("largeFile.txt"); 
	}
    public static void compareStringConcatenation() {
        int iterations = 1_000_000;
        String appendText = "hello";
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(appendText);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(appendText);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static void compareFileReading(String filePath) {
        System.out.println("\nComparing File Reading Performance...");
        long startTime = System.nanoTime();
        int wordCount1 = countWordsUsingFileReader(filePath);
        long endTime = System.nanoTime();
        System.out.println("FileReader: " + wordCount1 + " words, Time: " + (endTime - startTime) / 1_000_000 + " ms");
        startTime = System.nanoTime();
        int wordCount2 = countWordsUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader: " + wordCount2 + " words, Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
    public static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); 
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }
        return wordCount;
    }
    public static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        return wordCount;
    }
}
