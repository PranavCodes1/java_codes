import java.util.Scanner;

class Greeting
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username:");

		String name = sc.nextLine();

		name = name.toUpperCase();

		System.out.println("Hello " + name + " nice to meet you!");
	}
}

