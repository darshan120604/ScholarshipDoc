
class MultipleCatchDemo
{
	public static void main(String args[]){
	int a=0;
	String s= new String("A");
	try
	{
		a=Integer.parseInt(s);
		int b[] = new int [a];
		for(int i=0; i<10; i++)
		{
			b[i]=i;
		}
	}
	catch(NumberFormatException e)
	{
		System.out.println("NumberFormetException");
	}
	catch(Exception e)
	{
		System.out.println("sorry some other error");
	}
	finally
	{
		System.out.println("Program Ends");
	}
}}
	