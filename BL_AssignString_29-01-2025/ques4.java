
public class ques4 {

    public static void main(String[] args) {
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        handleNullPointerException();
    }

    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }
}
