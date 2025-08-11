class DivideBy0
{
	public static float divide(float a, float b) throws Exception
	{
		if(b==0)
			throw ( new Exception());
		else
			return a/b;
	}
	public static void main (String args[])
	{
		float x=2.5f, y=1.0f;
		try
		{
			float z=divide(x,y);
			System.out.println("Division is" +z);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}