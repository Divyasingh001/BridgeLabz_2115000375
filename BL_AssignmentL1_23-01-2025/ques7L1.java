public class ques7L1 {
    public static void main(String[] args) {
        // Ensure that two arguments (month and day) are provided
        if (args.length < 2) {
            System.out.println("Please provide both month and day as command-line arguments.");
            return;
        }
        
        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);     
            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Please enter a value between 1 and 12.");
                return;
            }
            if (day < 1 || day > 31) {
                System.out.println("Invalid day. Please enter a value between 1 and 31.");
                return;
            }
            boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||
                               (month == 4 && day >= 1 && day <= 30) ||
                               (month == 5 && day >= 1 && day <= 31) ||
                               (month == 6 && day >= 1 && day <= 20);
            if (isSpring) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for month and day.");
        }
    }
}
