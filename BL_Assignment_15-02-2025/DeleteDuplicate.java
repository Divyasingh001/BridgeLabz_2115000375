import  java.util.*;
class DeleteDuplicate{
	public static String delete(String str){
		StringBuilder sb=new StringBuilder();
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<str.length()-1;i++){
			char ch=str.charAt(i);
			if(!set.contains(ch)){
				sb.append(ch);
				set.add(ch);
			}
		}
		return sb.toString();
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(delete(str));
	}
}