class Control
{
	public static boolean flag=false;
}

class Thread1 extends Thread
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

class Thread2 extends Thread
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

class MuExclusion1
{
	public static void main(String args[])
	{
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2();

		t1.start();
		t2.start();
	}
}