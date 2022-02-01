package cursortopic;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor1 {

	public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add("hello");
	l1.add('a');
	l1.add(true);
	l1.add(50.30);
Iterator itr=l1.iterator();
	while(itr.hasNext())
	{
		Object o1=itr.next();
		System.out.println(o1);
	}

	}

}
