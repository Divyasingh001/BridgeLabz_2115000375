import java.util.Scanner;
class ReverseString{
	public static String reverse(String str){
		StringBuilder result=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			char ch=str.charAt(i);
			result.append(ch);
		}
		return result.toString();
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(reverse(str));
	}
}