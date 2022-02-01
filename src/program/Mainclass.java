package program;
class Sample
{
	Sample()
	{
		System.out.println("hiiii");
	}
}
class Demo extends Sample
{
	Demo()
	{
	}
}
class Test extends Demo
{
	Test(int a)
	{
		super();
		System.out.println("byeeeee");
	}
}

public class Mainclass
{
	public static void main(String[]args)
	{
	new Test(10);
	}
}
