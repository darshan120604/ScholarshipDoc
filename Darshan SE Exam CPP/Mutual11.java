class Control
{
	public static boolean flag=false;
}
class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			while(Control.flag==true){}
			System.out.print("A");
			Control.flag=true;
		}
	}
}
class T2 extends Thread
{
	public void run()
	{
	for(int i=1; i<=5; i++)
	{
		while(Control.flag==false){}
		System.out.print("B");
		Control.flag=false;
	}
	}
}
class Mutual11
{
	public static void main(String args[])
	{
		T1 t1=new T1();
		T2 t2=new T2();
		t1.start();
		t2.start();
	}
}