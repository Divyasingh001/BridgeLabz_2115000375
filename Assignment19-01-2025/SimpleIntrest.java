import java.util.Scanner;

class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount here");
        double princi = sc.nextDouble();
        System.out.print("Enter the Rate of interest here");
        double rate = sc.nextDouble();
        System.out.print("Enter the Time period here");
        double time = sc.nextDouble();
        double SI = (princi * rate * time) / 100;
        System.out.println("The Simple Interest is " + SI);
    }
}

