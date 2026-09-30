import java.util.Scanner;

public class Product
{
	int id;
	String name;
	double price;

	void accept()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Product ID: ");
        	id = sc.nextInt();
        	sc.nextLine();

       		System.out.print("Enter Product Name: ");
       		name = sc.nextLine();

        	System.out.print("Enter Product Price: ");
        	price = sc.nextDouble();
   	 }


	public static void main(String args[])
	{
		Product p[] = new Product[5];

		for(int i=0;i<5;i++)
		{
			p[i] = new Product();

			System.out.println("Enter details of product "+(i +1));
			p[i].accept();

		}

		int min = 0;

		for(int i=0;i<5;i++)
		{
			if(p[i].price < p[min].price)
			{
				min = i;
			}
		

		}

		 System.out.println("\nProduct with Minimum Price:");
        	System.out.println("Name: " + p[min].name);
        	System.out.println("Price: " + p[min].price);
	}
}





