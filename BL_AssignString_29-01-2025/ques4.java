import java.util.Scanner;
class ques4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String input=sc.nextLine();
		sc.close();
		StringBuilder result=new StringBuilder();
		boolean seen[] =new boolean[256];
		for (char ch:input.toCharArray()){
			if(!seen[ch]){
				seen[ch]=true;
				result.append(ch);
			}
		}
		System.out.println("String after removing duplicates:"+result);
	}
}