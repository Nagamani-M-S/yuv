package collectiontopic;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
System.out.println(l1);
System.out.println(l1.get(2));
System.out.println(l1.peek());
System.out.println(l1);
System.out.println(l1.poll());
System.out.println(l1);
	}

}
