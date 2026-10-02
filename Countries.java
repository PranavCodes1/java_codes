import java.util.Scanner;

class Countries
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of countries: ");
        int n = sc.nextInt();
        sc.nextLine();

        String country[] = new String[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter country " + (i + 1) + ": ");
            country[i] = sc.nextLine();
        }

        System.out.println("\nCountry Names in Capital Letters:");

        for(int i = 0; i < n; i++)
        {
            System.out.println(country[i].toUpperCase());
        }
    }
}
