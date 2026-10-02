import java.util.Scanner;
import java.io.*;
import java.util.Date;

class FileInfo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file name");
		String filename = sc.nextLine();

		File f = new File(filename);

		if(f.exists())
		{
			System.out.println("File exists");
			System.out.println("File length " + f.length() + " bytes");
			System.out.println("Last modified time = " +new Date(f.lastModified()));
		}
		else
		{
			System.out.println("File does not exists");
		}
	}
}
