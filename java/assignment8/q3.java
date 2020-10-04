import java.util.Scanner;

public class Question3
{
	static int getLLessThanN(int num, int digit)
	{
		char c = Integer.toString(digit).charAt(0);
		for (int i= num; i > 0; i--)
		{
			if(Integer.toString(i).indexOf(c) == -1)
			{
				System.out.println(i);
				break;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the digit to be not present: ");
		int digit = sc.nextInt();
		getLLessThanN(num, digit);
	}
}
