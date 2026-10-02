import java.util.Scanner;

class InsufficientFundException extends Exception
{
	InsufficientFundException(String message)
	{
		super(message);
		
	}

}

class SavingAccount
{
	int acno;
	String name;
	double balance;

	SavingAccount(int acno,String name,double balance)
	{
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}

	void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Amount deposited successfully.");
   	}
	
	void withdraw(double amount) throws InsufficientFundException
	{
		if(balance - amount < 500)
		{
			throw new InsufficientFundException("Insufficient Balance. Minimum balance of 500 must be maintained."
            );		}
		else
		{
			balance = balance - amount;
			System.out.println("Amount Withdraw successfully");
		}
	}
	void viewbalance()
	{
		System.out.println("Account Number: " + acno);
        	System.out.println("Name: " + name);
       	 	System.out.println("Balance: " + balance);
    	}
	
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int acno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

	SavingAccount account = new SavingAccount(acno,name,balance);

	int choice;

	do
	{
		System.out.println("\n1. Deposit");
		System.out.println("2. Withdraw");
            	System.out.println("3. View Balance");
            	System.out.println("4. Exit");

		System.out.println("Enter your choice: ");
		choice = sc.nextInt();

	try
	{
		if(choice == 1)
		{
			System.out.println("Enter amount to deposit: ");
			double amount = sc.nextDouble();

			account.deposit(amount);
		}
		else if(choice == 2)
		{
			System.out.println("Enter amount to withdraw: ");
			double amount = sc.nextDouble();

			account.withdraw(amount);
		}
		else if(choice == 3)
                {
                    account.viewbalance();
                }
                else if(choice == 4)
                {
                    System.out.println("Thank you.");
                }
                else
                {
                    System.out.println("Invalid choice.");
                }
            }
	catch(InsufficientFundException e)
	{
		System.out.println(e.getMessage());
	}

    } while(choice != 4);
    }
}

    
