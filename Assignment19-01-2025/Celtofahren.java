import java.util.Scanner;
class Celtofahren{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in celcius");
		int cel=sc.nextInt();
		int Fahrenheit = (cel * 9/5) + 32;
		System.out.println("temperaturein Fahrenheit is "+ Fahrenheit);
	}
}