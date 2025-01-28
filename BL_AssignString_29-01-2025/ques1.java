import java.util.Scanner;
class ques1{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first String");
		String str1=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
	    boolean equalsResult=str1.equals(str2);
    
		boolean charAtResult=compareStringUsingcharAt(str1,str2);
		 System.out.println("Comparison using charAt method: " + charAtResult);
        System.out.println("Comparison using equals method: " + equalsResult);
        System.out.println("Results match: " + (charAtResult == equalsResult));
	}
		public static boolean compareStringUsingcharAt(String string1,String string2){
			if(string1.length()!=string2.length()){
				return false;
			}
			for(int i=0;i<string1.length();i++){
				if(string1.charAt(i)!=string2.charAt(i)){
					return false;
				}
			}
			return true;
			}
		}
	