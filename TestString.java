import java.util.Scanner;
import StringOperation.Con;
import StringOperation.Comp;

class TestString
{
	  public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter string 1: ");
		String s1 = sc.nextLine();

		System.out.println("Enter string 2: ");
		String s2 = sc.nextLine();

		Con c = new Con();
		Comp cp = new Comp();

		c.Concatenate(s1,s2);
		cp.Compare(s1,s2);
	}
}
