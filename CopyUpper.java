import java.io.*;
import java.util.Scanner;


class CopyUpper
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter source file name: ");
		String source = sc.nextLine();

		System.out.println("Enter detsination file: ");
		String destination = sc.nextLine();

		BufferedReader br = new BufferedReader(new FileReader(source));

		BufferedWriter bw = new BufferedWriter(new FileWriter(destination));

		String line;

		while((line = br.readLine()) != null)
		{
			bw.write(line.toUpperCase());
			bw.newLine();
		}

		br.close();
		bw.close();
		  System.out.println("File copied successfully in uppercase.");
    }
}
