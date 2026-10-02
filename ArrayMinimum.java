import java.util.Scanner;

class ArrayMinimum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter " + n + "elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements are= ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}

		System.out.println("Minimum element of array: ");
		int min = arr[0];

		for(int i=1;i<n;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum number = " + min);
    }
}
