import java.util.Scanner;
public class kilotomiles{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in kilotomiles");
		double kilotomiles=sc.nextInt();
		double Miles = kilotomiles * 0.621371;
		System.out.println("the distance in miles are " + Miles);
	}
}