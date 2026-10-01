import java.io.*;
import java.util.Scanner;

public class CustomerFile
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.println("Enter number of customers: ");
			int n = sc.nextInt();
			sc.nextLine();

			DataOutputStream dos = new DataOutputStream(new FileOutputStream("customer.dat"));

			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Details of Customer: "+ (i + 1));
				System.out.println("Enter customer id: ");
				int id = sc.nextInt();

				sc.nextLine();

				System.out.println("Enter customer name: ");
				String cname = sc.nextLine();

				System.out.println("Enter customer address: ");
				String address = sc.nextLine();
	
				System.out.println("Enter customer mobile number: ");
				String mobile_no = sc.nextLine();

				dos.writeInt(id);
				dos.writeUTF(cname);
				dos.writeUTF(address);
				dos.writeUTF(mobile_no);
			}
			dos.close();

		 	System.out.println("\nCustomer details stored successfully.");
   	 	

		System.out.println("\nCustomer Details:");

            DataInputStream dis =
                new DataInputStream(
                    new FileInputStream("customer.dat"));

            while (dis.available() > 0)
            {
                int id = dis.readInt();
                String name = dis.readUTF();
                String address = dis.readUTF();
                String mobile = dis.readUTF();

                System.out.println("\nCustomer ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Address: " + address);
                System.out.println("Mobile: " + mobile);
            }

            dis.close();
		}
	
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}




