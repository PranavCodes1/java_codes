import java.io.*;


class Factorial{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number:");
		int n = Integer.parseInt(br.readLine());

		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}

		System.out.println("Factorial of "+ n + " = " + fact);
	}

}
