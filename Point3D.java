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
		System.out.println("X= " +x);
		System.out.println("Y =" +y);
	}

}

class Point3D extends Point
{
	int z;

	Point3D(int x, int y, int z)
	{
		super(x,y);
		this.z = z;
	}

	void display()
	{
			System.out.println("X= " +x);
			System.out.println("Y =" +y);
			System.out.println("Z = " +z);
	}
	
	public static void main(String args[])
	{

		Point3D p3 = new Point3D(2,3,4);
		p3.display();
	}
}


