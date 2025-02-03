class Employee{
	private static String Companyname="Capgemini";
	private String name;
	private final int id;
	private String designation;
	private static int totalEmployees=0;
	public Employee(String name,int id,String designation){
		this.name=name;
		this.id=id;
		this.designation=designation;
		totalEmployees++;
	}
	public static void displaytotalEmployees(){
		System.out.println("Total employees are :"+totalEmployees);
	}
	public void displayemployeeinfo(){
		if(this instanceof Employee){
		System.out.println("Name of employee: "+name);
		System.out.println("id of Employee: "+id);
		System.out.println("designation of employee: "+designation);
		}
		else{
			System.out.println("Invalid Employee object");
		}
	}
	public static void main(String args[]){
		Employee emp1=new Employee("divya",375,"software developer");
		Employee emp2=new Employee("Ayush",001,"analyst");
		emp1.displayemployeeinfo();
		System.out.println("----------------------");
		emp2.displayemployeeinfo();
		System.out.println("----------------------");
		Employee.displaytotalEmployees();
	}
}
		
	
	
	
		
	