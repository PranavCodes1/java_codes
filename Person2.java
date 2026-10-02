import java.util.Scanner;

class Person
{
    String pname;
    String pmobno;

    Person(String pname, String pmobno)
    {
        this.pname = pname;
        this.pmobno = pmobno;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first person name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter first person mobile number: ");
        String mob1 = sc.nextLine();

        System.out.print("Enter second person name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter second person mobile number: ");
        String mob2 = sc.nextLine();

        Person p1 = new Person(name1, mob1);
        Person p2 = new Person(name2, mob2);

        int hash1 = p1.hashCode();
        int hash2 = p2.hashCode();

        System.out.println("\nHash Code of Person 1: " + hash1);
        System.out.println("Hash Code of Person 2: " + hash2);

        if(hash1 == hash2)
        {
            System.out.println("Hashcodes are equal");
        }
        else
        {
            System.out.println("Hashcodes are not equal");
        }
    }
}
