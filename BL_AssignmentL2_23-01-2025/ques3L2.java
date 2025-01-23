import java.util.Scanner;
public class ques3L2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter Physics marks ");
	int physics=sc.nextInt();
	System.out.print("Enter Chemistry marks ");
	int chemistry=sc.nextInt();
	System.out.print("Enter Maths marks ");
	int maths=sc.nextInt();
	double averageMarks=(double)(physics+chemistry+maths)/3;
	String grade;
	String remarks;
	if(averageMarks>=80){
	    grade="A";
	    remarks="Level 4, above agency-normalized standards";
	}
	else if(averageMarks>=70 && averageMarks<80){
	    grade="B";
	    remarks="Level 3, at agency-normalized standards";
	}
	else if(averageMarks>=60 && averageMarks<70){
	    grade="C";
	    remarks="Level 2, below, but approaching agency-normalized standards";
	}
	else if(averageMarks>=50 && averageMarks<60){
	    grade="D";
	    remarks="Level 1, weel below agency-normalized standards";
	}
	else if(averageMarks>=40 && averageMarks<50){
	    grade="E";
	    remarks="Level 1-, too below agency-normalized standards";
	}
	else{
	    grade="R";
	    remarks="Remedial standards";
	}
	System.out.println("Average Marks: "+averageMarks);
	System.out.println("Grade: "+grade);
	System.out.println("Remarks: "+remarks);
    }
}