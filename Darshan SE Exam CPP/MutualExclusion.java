
class Control
{
	public static boolean flag= false;
}
class MyThreadOne extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			while(Control.flag==true){}
			System.out.print("A");
			Control.flag=true;
		}
	}
}
class MyThreadTwo extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			while(Control.flag==false){}
			System.out.print("B");
			Control.flag=false;
		}
	}
}
class MutualExclusion
{
	public static void main(String [] args)
	{
		Thread t1= new MyThreadOne();
		Thread t2= new MyThreadTwo();
		
		t1.start();
		t2.start();
	}
}
		