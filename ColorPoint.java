class Point
{
	int x,y;

	Point()
	{
		x = 0;
		y = 0;
	}

	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	
	}

		void display()
	{
		System.out.println("X = " +x);
		System.out.println("Y = " +y);
	}



}

class ColorPoint extends Point
{
	String color;
	ColorPoint(int x,int y, String color)
	{
		super(x,y);
		this.color = color;
	}

	void display()
	{
		System.out.println("X = " +x);
		System.out.println("Y = " +y);
		System.out.println("Color = " +color);
	}

	public static void main(String args[])
	{
		ColorPoint cp = new ColorPoint(1,2,"red");
		cp.display();

	}
}

