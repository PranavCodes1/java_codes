public class Cylindercommandline
{
	public static void main(String args[])
	{
	System.out.println("Enter radius and height of Cylinder: ");
	double r = Integer.parseInt(args[0]);
	double h = Integer.parseInt(args[1]);

	double volume = 3.14 * r * r * h;

	System.out.println("Radius = " + r);
        System.out.println("Height = " + h);
	System.out.println("Volume of cylinder is: "+ volume);
	}
}

