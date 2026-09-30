class Sphere
{
	public static void main(String args[])
	{
		double r = Double.parseDouble(args[0]);

		double area = 4 * 3.14 * r * r;
		double volume = (4.0/3.0) * 3.14 * r * r * r;

		System.out.println("Radius = " + r);
        	System.out.println("Surface Area = " + area);
        	System.out.println("Volume = " + volume);
    	}
}
