package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map10 {

	public static void main(String[] args) {
	Map<Short,Integer>a=new HashMap<Short,Integer>();
	Short[]arr={10,20,30,40,40};
	for(Short r:arr)
	{
if(!a.containsKey(r))
{
a.put(r, 1);
}
else
{
	int count=a.get(r);
	a.put(r,count+1);
}
}
	for(Entry<Short, Integer> o1:a.entrySet())
	{
		System.out.println(o1.getKey()+" "+o1.getValue());
	}
}
}

