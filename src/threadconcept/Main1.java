package threadconcept;
class Sample1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
public class Main1 {

	public static void main(String[] args) {
	Sample1 s1=new Sample1();
	Thread th1=new Thread();
	th1.start();
	}

}
