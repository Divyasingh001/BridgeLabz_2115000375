import java.util.Scanner;
class Rectangleperimeter{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int length=sc.nextInt();
		System.out.println("Enter the width of rectangle");
		int width=sc.nextInt();
		int perimeter=2 *(length+width);
		System.out.println("The perimeter of rectangle is: "+ perimeter);
	}
}