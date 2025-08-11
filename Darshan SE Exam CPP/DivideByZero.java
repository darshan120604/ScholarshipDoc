class DivideByZero
{
	public static float divide(Float a, float b) throws Exception
	{
		if(b==0)
			throw(new Exception());
		else
			return (a/b);
	}
	public static void main(String args[])
	{
		float x=2.4f, y=1.0f;
		try
		{
			float z=divide(x,y);
			System.out.println("Division="+z);
		}
		catch(Exception e)
		{
			System.out.println("Division not possible");
		}
	}
}


	