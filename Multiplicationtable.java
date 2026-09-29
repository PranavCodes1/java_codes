class Multiplicationtable
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);

		System.out.println("Multiplication table of" +n);

		for(int i=1;i<=10;i++)
		{
			System.out.println(n + "x" + i + "=" + (n * i));
		}
	}

}

