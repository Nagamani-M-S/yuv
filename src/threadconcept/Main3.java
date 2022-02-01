package threadconcept;
class Demo implements Runnable
{
	public void run()
	{
		for(int i=100;i<=110;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Sample2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Main3 {

	public static void main(String[] args) {
	
Sample2 s2=new Sample2();
Thread th1=new Thread(s2);
th1.start();
Demo d1=new Demo();
Thread th2=new Thread(d1);
th2.start();
	}

}
