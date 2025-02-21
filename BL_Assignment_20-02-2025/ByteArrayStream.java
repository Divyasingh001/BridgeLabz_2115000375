import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
public class ByteArrayStream{
    public static void main(String[] args) {
        String inputImagePath = "input.jpg"; 
        String outputImagePath = "output.jpg";
        try {
            byte[] imageBytes = imageToByteArray(inputImagePath);
            byteArrayToImage(imageBytes, outputImagePath);
           
            if (verifyImages(inputImagePath, outputImagePath)) {
                System.out.println("The original and output images are identical.");
            } else {
                System.out.println("The images are not identical.");
            }
        } catch (IOException e) {
            System.err.println("Error processing the image: " + e.getMessage());
        }
    }

    public static byte[] imageToByteArray(String imagePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            Files.copy(new File(imagePath).toPath(), baos);
            return baos.toByteArray();
        }
    }

    public static void byteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static boolean verifyImages(String originalPath, String outputPath) throws IOException {
        byte[] originalBytes = Files.readAllBytes(new File(originalPath).toPath());
        byte[] outputBytes = Files.readAllBytes(new File(outputPath).toPath());
        return Arrays.equals(originalBytes, outputBytes);
    }
}
