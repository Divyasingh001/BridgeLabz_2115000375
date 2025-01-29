import java.util.Scanner;
class ques3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str1=sc.nextLine();
		int left=0;
		int right=str1.length()-1;
		boolean isPalindrome=true;
		while(left<right){
			if(str1.charAt(left)!=str1.charAt(right)){
				isPalindrome=false;
				break;
			}
			left++;
			right--;
		}
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}