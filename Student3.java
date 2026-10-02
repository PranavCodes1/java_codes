import java.util.Scanner;

class RollnoNotWithinRangeException extends Exception
{
	RollnoNotWithinRangeException(String message)
	{
		super(message);
	}
}

class Student3
{
	int rollno;
	String name;
	int age;
	String course;

	Student3(int rollno,String name,int age,String course)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	void checkRollno() throws RollnoNotWithinRangeException
	{
		if(rollno <13001 || rollno > 13080)
		{
			throw new RollnoNotWithinRangeException("Roll no is not within range");
		}
	}


	 void display()
    	{
       		System.out.println("\nStudent Details:");
        	System.out.println("Roll No: " + rollno);
        	System.out.println("Name: " + name);
        	System.out.println("Age: " + age);
        	System.out.println("Course: " + course);
    	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter Roll No: ");
        	int rollno = sc.nextInt();
        	sc.nextLine();

        	System.out.print("Enter Name: ");
        	String name = sc.nextLine();

        	System.out.print("Enter Age: ");
        	int age = sc.nextInt();
        	sc.nextLine();

        	System.out.print("Enter Course: ");
        	String course = sc.nextLine();

		Student3 s = new Student3(rollno,name,age,course);

		try
		{
			s.checkRollno();
			s.display();
		}
		catch(RollnoNotWithinRangeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
