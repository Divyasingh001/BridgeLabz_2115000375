import java.util.Scanner;

public class ques7L2 {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
         ques7L2 checker = new  ques7L2();
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            boolean canVote = checker.canStudentVote(studentAges[i]);
            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered for student " + (i + 1) + ". Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible to vote.");
            }
        }

        scanner.close();
    }
}
