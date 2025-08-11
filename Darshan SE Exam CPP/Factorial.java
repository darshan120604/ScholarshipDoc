import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
{
	int f=1,i;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	for(i=1; i<=n; i++)
	{
		f=f*i;
	}
	System.out.println("Factorial="+f);
}
}
