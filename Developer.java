import java.util.Scanner;

class Employee
{
	String name;
	double salary;

	Employee(String name,double salary)
	{
		this.name = name;
		this.salary = salary;
	}


}

public class Developer extends Employee
{
	String projectname;

	Developer(String name, double salary, String projectname)
	{
		super(name,salary);
		this.projectname = projectname;
	}

	void display()
	{
		System.out.println("Developer details: ");
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
		System.out.println("Project name = " + projectname);

	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter developer name; ");
		String name = sc.nextLine();

		System.out.println("Enter salary: ");
		double sal = sc.nextDouble();
		 sc.nextLine();

		System.out.println("Enter projectname: ");
		String pname = sc.nextLine();

		Developer d = new Developer(name,sal,pname);
		d.display();
	}
}


