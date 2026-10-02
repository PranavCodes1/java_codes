import java.util.Scanner;

class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int temp = n;
		int sum = 0;

		while(temp != 0)
		{
			int digit = temp % 10;
			sum = sum + (digit * digit * digit);
			temp = temp / 10;
		}
		if(sum == n)
		{
			System.out.println(n + " is a armstrong number");
		}
		else
		{
			System.out.println(n + " is not a armstrong number");
		}
	}
}

