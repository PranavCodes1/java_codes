import java.util.Scanner;

class MyDate
{
	int dd,mm,yy;

	MyDate(int dd,int mm,int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	void display()
	{
		System.out.println("Date= " + dd + "-" + mm + "-" + yy);
	}

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date: ");
		int d = sc.nextInt();
		
		System.out.println("Enter month: ");
		int m = sc.nextInt();

		System.out.println("Enter year: ");
		int y = sc.nextInt();

		MyDate date = new MyDate(d,m,y);

		date.display();
	}
}



