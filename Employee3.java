import java.util.Scanner;

class Employee3
{
	int id;
	String name;
	String deptname;
	double salary;

	static int count = 0;

	Employee3()
	{
		id = 0;
		name= "";
		deptname = "";
		salary = 0;
		count++;
	}

	Employee3(int id, String name, String deptname,double salary)
	{
		this.id = id;
		this.name = name;
		this.deptname = deptname;
		this.salary = salary;
		count++;
	}

	void display()
	{
		System.out.println("ID = " + id);
		System.out.println("Name: " + name);
        	System.out.println("Department: " + deptname);
       		System.out.println("Salary: " + salary);
    	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();

		Employee3 emp[] = new Employee3[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details of employee " + (i+1));
			System.out.print("Enter ID: ");
            		int id = sc.nextInt();
            		sc.nextLine();

            		System.out.print("Enter Name: ");
            		String name = sc.nextLine();

            		System.out.print("Enter Department: ");
            		String deptname = sc.nextLine();

           		System.out.print("Enter Salary: ");
            		double salary = sc.nextDouble();
            		sc.nextLine();

			emp[i] = new Employee3(id,name,deptname,salary);

			System.out.println("Object created "+ count);
		}

		System.out.println("\nEmployee Details:");

		for(int i=0;i<n;i++)
		{
			System.out.println("\nEmployee " + (i + 1));
            		emp[i].display();
        	}
    	}
}



