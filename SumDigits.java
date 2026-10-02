class SumDigits
{
    public static void main(String args[])
    {
	    int n = Integer.parseInt(args[0]);

	    int temp = n;
	    int sum = 0;
	    while(temp != 0)
	    {
		    int digits = temp % 10;
		    sum = sum + digits;
		    temp = temp / 10;
	    }

	    System.out.println("Sum of digits = " + sum);
    }
}
		    
