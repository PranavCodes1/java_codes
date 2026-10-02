import java.io.*;

class CountDigits
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number: ");
		int n = Integer.parseInt(br.readLine());

		int count = 0;
		while(n != 0)
		{
			n = n/10;
			count++;
		}
		 System.out.println("Number of digits = " + count);
    }
}
