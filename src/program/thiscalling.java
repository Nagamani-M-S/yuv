package program;

public class thiscalling {
 thiscalling(int a)
 {
	System.out.println("aaa");
 }
 thiscalling(double b)
 {
	 this(10);
	 System.out.println("bbb");
 }
 thiscalling(int a,double b)
 {
	 this(56.45);
	 System.out.println("ccc");
 }
 thiscalling(double b,int a)
 {
	this(10,67.67);
	System.out.println("ddd");
 }

	public static void main(String[] args)
	{
	thiscalling t1=new thiscalling(67.67,10);
	}

}
