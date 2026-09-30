import java.util.Scanner;

class BMI
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First name: ");
		String fname = sc.nextLine();


		System.out.println("Enter Last name: ");
		String lname = sc.nextLine();


		System.out.println("Enter Weight: ");
		double weight = sc.nextDouble();


		System.out.println("Enter Height: ");
		double height = sc.nextDouble();

	
		double bmi = weight / (height * height);

		System.out.println("Name: " + fname + " " + lname);
		System.out.println("BMI=" + bmi);
	}
}
