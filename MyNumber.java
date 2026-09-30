class MyNumber
{
	private int num;

	MyNumber()
	{
		num = 0;
	}

	MyNumber(int num)
	{
		this.num = num;
	}

	void isNegative()
	{
		if(num < 0)
			System.out.println("Number is negative");
		else
			System.out.println("Number is not negative");

	}

	void isPositive()
	{
		if(num > 0)
			System.out.println("Number is positive");
		else
			System.out.println("Number is not positive");

	}

	void isOdd()
	{
		if(num % 2 != 0)
			System.out.println("Number is odd");
		else
			System.out.println("Number is not odd");
	}

	void isEven()
	{
		if(num % 2 == 0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}

	public static void main(String args[])
	{

		int value = Integer.parseInt(args[0]);
		MyNumber obj = new MyNumber(value);

		obj.isNegative();
		obj.isPositive();
		obj.isOdd();
		obj.isEven();
	}
}






