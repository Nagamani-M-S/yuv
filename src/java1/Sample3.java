package java1;

import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s1=sc.nextLine();
	String[] arr=s1.split(" ");
	for(int i=0;i<arr.length;i++)
	{
		if(i%2==0)
		{
			System.out.print(rev(arr[i])+" "+arr[i].length()+" ");
		}
		else
		{
			System.out.print(arr[i]+" "+arr[i].length()+" ");
		}
	}
	}
		/*System.out.print(rev(arr[i])+" ");
	}
	}*/
	static String rev(String s1)
	{
		String rev=" ";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
return rev;
	}

}

