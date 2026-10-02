import java.util.Scanner;

class Employee
{
	String name;
	double salary;

	Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

}
class Programmer extends Employee
{
	String proglanguage;

	Programmer(String name,double salary, String proglanguage)
	{
		super(name,salary);
		this.proglanguage = proglanguage;

	}

	void display()
    {
        System.out.println("\nProgrammer Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + proglanguage);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Programming Language: ");
        String language = sc.nextLine();

	Programmer p = new Programmer(name,salary,language);
	p.display();
    }
}
