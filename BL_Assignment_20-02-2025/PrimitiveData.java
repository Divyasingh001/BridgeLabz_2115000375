import java.io.*;

public class PrimitiveData{
    public static void main(String[] args) {
        String fileName = "students.dat"; 
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            dataOutputStream.writeInt(101);
            dataOutputStream.writeUTF("Alice Johnson");
            dataOutputStream.writeDouble(3.85);

            dataOutputStream.writeInt(102);
            dataOutputStream.writeUTF("Bob Smith");
            dataOutputStream.writeDouble(3.75);

            System.out.println("Student details saved successfully!");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Student Data:");

            while (dataInputStream.available() > 0) {
                int rollNumber = dataInputStream.readInt();
                String name = dataInputStream.readUTF();
                double gpa = dataInputStream.readDouble();

                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
