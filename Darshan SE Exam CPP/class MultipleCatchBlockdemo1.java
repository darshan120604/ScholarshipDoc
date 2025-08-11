class MultipleCatchBlockdemo1
{
	public static void main(String [] args)
        {
	int a=0;
	String s= new String("A");
	try
	{
 		a=Integer.parseInt("A");
		int b[i]= b[a];
		for(int i=0;i<10;i++)
		{
			b[i]=i;
		}
	}
	catch(NumberFormatException)
	{
		System.out.println("Number format Exception");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally()
	{
		System.out.println("Program Ends");
	}
        }
}

	