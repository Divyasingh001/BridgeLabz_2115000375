import java.io.*;
class WriterThread extends Thread {
    private PipedOutputStream outputStream;
    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from WriterThread!";
            outputStream.write(message.getBytes()); 
            outputStream.close();
        } catch (IOException e) {
            System.err.println("Writer Error: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream inputStream;
    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }
    @Override
    public void run() {
        try {
            int data;
            System.out.print("Reader received: ");
            while ((data = inputStream.read()) != -1) { 
                System.out.print((char) data);
            }
            System.out.println("Reader finished reading.");
            inputStream.close(); 
        } catch (IOException e) {
            System.err.println("Reader Error: " + e.getMessage());
        }
    }
}

public class PipedStream{
    public static void main(String[] args) {
        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream); 

            Thread writer = new WriterThread(outputStream);
            Thread reader = new ReaderThread(inputStream);

            writer.start();
            reader.start();

            writer.join(); 
            reader.join(); 

        } catch (IOException | InterruptedException e) {
            System.err.println("Main Error: " + e.getMessage());
        }
    }
}
