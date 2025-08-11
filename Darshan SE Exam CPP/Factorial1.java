import java.util.Scanner;
class Factorial1
{
	public static int fact(int n)
	{
		int f=1;
		if(n==0)
			return 1;
		else
		{
			f=n*fact(n-1);
			return f;
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner();
		int n=sc.nextInt();
		int z=fact(n);
		System.out.println("Factorial="+z);
	}
}

					