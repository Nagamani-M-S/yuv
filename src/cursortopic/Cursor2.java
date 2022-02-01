package cursortopic;

import java.util.ArrayList;
import java.util.ListIterator;

public class Cursor2 {

	public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20.40);
	l1.add("hello");
	l1.add('a');
	ListIterator itr=l1.listIterator();
	while(itr.hasNext())
	{
		Object o1=itr.next();
		System.out.println(o1);
	}
	while(itr.hasPrevious())
	{
		Object o2=itr.previous();
		System.out.println(o2);
	}

	}
}

