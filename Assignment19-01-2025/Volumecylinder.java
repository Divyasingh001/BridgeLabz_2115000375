import java.util.Scanner;
class Volumecylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder-");
        double r = sc.nextDouble();
        System.out.print("Enter the height of the cylinder-");
        double h = sc.nextDouble();
        double pi = 3.14; 
        double v = pi * r* r * h;
        System.out.println("The volume of the cylinder is: " + v);
    }
}
