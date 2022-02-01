package collectiontopic;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector l1=new Vector(4);
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
System.out.println(l1);
System.out.println("capacity is "+l1.capacity());
System.out.println("size is "+l1.size());
	}
}
