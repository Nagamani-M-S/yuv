package collectiontopic;

import java.util.ArrayList;

public class List5 {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.56);
		l1.add('A');
		l1.add(null);
		l1.add("hello");
		l1.add(true);
		System.out.println(l1);
		if(l1.contains(10)){
			
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}

	}

}
