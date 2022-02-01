package java1;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
    int swap=sc.nextInt();
	String s1=sc.next();
	char[]arr=s1.toCharArray();
	for(int j=1;j<=swap;j++)
	{
		char temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
			arr[arr.length-1]=temp;
		}
	for(int k=0;k<arr.length;k++)
	{
		System.out.print(arr[k]);
	}

	}

}
