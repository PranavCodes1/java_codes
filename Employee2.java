import java.util.Scanner;

public class Employee2
{

	int Empid;
	String Empname;
	String Empdesignation;
	double Empsal;

	Employee2(int Empid,String Empname, String Empdesignation,double Empsal)
	{
		this.Empid = Empid;
		this.Empname = Empname;
		this.Empdesignation = Empdesignation;
		this.Empsal = Empsal;
	}

	public String toString()
	{
		return "Employee id=" + Empid+ "\nEmployee name=" +Empname+ "\nEmpdesignation=" +Empdesignation+"\n Empsal=" +Empsal;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int empid = sc.nextInt();
		 sc.nextLine();

		System.out.println("Enter employee name: ");
		String empname = sc.nextLine();

		System.out.println("Enter employee designation: ");
		String empdesignation = sc.nextLine();

		System.out.println("Enter employee salary: ");
		double empsal = sc.nextDouble();

		Employee2 emp = new Employee2(empid,empname,empdesignation,empsal);

		 System.out.println("\nEmployee Details:");

		System.out.println(emp.toString());
	}
}

