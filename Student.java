import java.util.Scanner;

class AgeNotWithinRangeException extends Exception
{
	AgeNotWithinRangeException(String message)
	{
		super(message);
	}
}

class Student
{
	int roll_no;
	String name;
	int age;
	String course;

	Student(int roll_no, String name,int age,String course)
	{
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	void checkAge() throws AgeNotWithinRangeException
	{
		if(age < 15 || age > 21)
		{
			throw new AgeNotWithinRangeException("Age not within range");
		}
	}


	void display()
	{

		System.out.println("\nStudent Details:");
		System.out.println("roll no= " + roll_no);
		System.out.println("name= " + name);
		System.out.println("age= " + age);
		System.out.println("course= " + course);
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

		Student s = new Student(rollno,name,age,course);

		try
		{
			s.checkAge();
			s.display();
		}
		catch(AgeNotWithinRangeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}


