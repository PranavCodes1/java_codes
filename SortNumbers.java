class SortNumbers
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);


		int temp;

		if(a > b)
		{
			temp = a;
			a = b;
			b  = temp;
		}

		if(a > c)
		{
			temp = a;
			a = c;
			c = temp;
		}
		if(b > c)
		{
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println("Numbers in Ascending Order:");
		System.out.println(a + " " + b + " " + c);
	}
}

