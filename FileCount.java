import java.io.*;
import java.util.Scanner;

class FileCount
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String filename = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(filename));

        int characters = 0;
        int lines = 0;
        int words = 0;

        String line;

        while((line = br.readLine()) != null)
        {
            lines++;
            characters += line.length();
            words += line.split(" ").length;
        }

        br.close();

        System.out.println("Characters = " + characters);
        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
    }
}
