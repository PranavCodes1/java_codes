import java.io.*;

public class Student2
{
	int rollno;
	String name;
	String cls;
	double percentage;

	Student2(int r, String n, String c, double p)
	{
		this.rollno = r;
		this.name = n;
		this.cls = c;
		this.percentage = p;
	}

	void display()
	{
		System.out.println("\nStudent Details:");
       		System.out.println("Roll No: " + rollno);
        	System.out.println("Name: " + name);
        	System.out.println("Class: " + cls);
        	System.out.println("Percentage: " + percentage);
    	}

	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter roll number: ");
		int r = Integer.parseInt(br.readLine());

		System.out.println("Enter name: ");
		String n = br.readLine();

		System.out.print("Enter Class: ");
        	String c = br.readLine();

        	System.out.print("Enter Percentage: ");
       		double p = Double.parseDouble(br.readLine());

		Student2 s = new Student2(r,n,c,p);

		s.display();
	}
}

