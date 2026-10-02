import java.io.*;

class Factors
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Factors of " + n + ":");

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
