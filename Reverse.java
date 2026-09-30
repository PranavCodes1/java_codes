import java.io.*;

class Reverse
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int n = Integer.parseInt(br.readLine());

		int temp = n;
		
		int rev = 0;
		while(temp != 0)
		{
			int digits = temp % 10;
			rev = rev * 10 + digits;
			temp = temp / 10;
		}
	

		System.out.println("Reverse number: " +rev);
	}
}


