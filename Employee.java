import java.util.Scanner;

class Employee
{
	String name;
	double salary;

	void accept()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee name: ");
		name = sc.nextLine();

		System.out.println("Enter employee salary: ");
		salary = sc.nextDouble();
		sc.nextLine();
	}


	void display()
	{
		System.out.println("Employee name=" + name);
		System.out.println("Employee salary=" + salary);
	}

	public static void main(String args[])
	{
		Employee emp[] = new Employee[5];

		for(int i=0;i<5;i++)
		{
			emp[i] = new Employee();
			
			System.out.println("Enter details of employee" + (i+1));
			emp[i].accept();
		}

		int max=0;

		for(int i=1;i<5;i++)
		{
			if(emp[i].salary > emp[max].salary)
			{
				max = i;
			}
		}

		System.out.println("\n Employee having maximum salary: ");
		emp[max].display();
	}
}


