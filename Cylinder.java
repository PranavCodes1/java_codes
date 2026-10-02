import java.util.Scanner;

abstract class Shape
{
	abstract void area();
	abstract void volume();
}

class Cylinder extends Shape
{
	double radius;
	double height;

	Cylinder(double r, double h)
	{
		this.radius = r;
		this.height = h;
	}

	void area()
	{
		double a = 2 * 3.14 * radius * (radius + height);
		System.out.println("Surface Area of Cylinder = " + a);
	}

	void volume()
	{
		double v = 3.14 * radius * radius * height;
		System.out.println("Volume of Cylinder = " +v);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of cylinder= ");
		double r = sc.nextDouble();

		System.out.print("Enter height: ");
      	 	double h = sc.nextDouble();

		Cylinder c = new Cylinder(r,h);

		c.area();
		c.volume();
	}
}

