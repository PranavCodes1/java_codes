import java.util.Scanner;

import utility.CapitalString;


public class Person
{

	String name;
   	String city;

	Person(String name, String city)
    	{
        	this.name = name;
        	this.city = city;
   	 }


	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = sc.nextLine();

		System.out.println("Enter city: ");
		String city = sc.nextLine();

		Person p = new Person(name,city);

		CapitalString c = new CapitalString();

		String capitalName = c.convert(p.name);
		
		System.out.println("Name in Capital: " + capitalName);

		System.out.println("City: " + p.city);
	}
}

