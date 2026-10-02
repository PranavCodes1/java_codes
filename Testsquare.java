import java.util.Scanner;
import Series.Square;

public class Testsquare
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		Square s = new Square();

		s.display(n);
	}
}
