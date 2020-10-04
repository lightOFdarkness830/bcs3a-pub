import java.util.Arrays;
import java.util.Scanner;

public class Question2pt2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array that is to be created: ");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<size; i++)
		{
			myArray[i] = sc.nextInt();
		}
		System.out.println("The Array created is: "+Arrays.toString(myArray));
		System.out.println("Resultant array: ");
		int pos = myArray.length-1;
		for(int i = myArray.length-1; i>=0; i--)
		{
			if(myArray[i]!=0)
			{
				myArray[pos]=myArray[i];
				pos--;
			}
		}
		while(pos>=0)
		{
			myArray[pos] = 0;
			pos--;
		}
		System.out.println("The Array created is: "+Arrays.toString(myArray));
	}
}

/* OUTPUT

Enter the size of the array that is to be created: 
5
Enter the elements of the array: 
2
3
0
1
0
The Array created is: [2, 3, 0, 1, 0]
Resultant array: 
The Array created is: [0, 0, 2, 3, 1] */
