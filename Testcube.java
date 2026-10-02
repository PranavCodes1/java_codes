import java.util.Scanner;
import Series.Cube;

public class Testcube
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		Cube c = new Cube();
		c.display(n);
	}
}
