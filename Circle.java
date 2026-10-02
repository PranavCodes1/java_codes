import java.util.Scanner;

interface Operation
{
	double PI = 3.142;

	void area();
	void circumference();
}

class Circle implements Operation
{
	double radius;

	Circle(double r)
	{
		this.radius = r;
	}

	public void area()
	{
		System.out.println("Area of circle = " + PI * radius * radius);

	}

	public void circumference()
	{
		System.out.println("Circumference of circle= " + 2 * PI * radius);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
        	double r = sc.nextDouble();

		Circle c = new Circle(r);
		c.area();
		c.circumference();
	}
}

