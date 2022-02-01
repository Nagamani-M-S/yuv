package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map5 {

	public static void main(String[] args) {
	Map<Integer,Integer>a=new HashMap<Integer,Integer>();
	int[]arr={10,20,30,40,10};
	for(int r:arr)
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
	for(Entry<Integer, Integer> o1:a.entrySet())
	{
		System.out.println(o1.getKey()+" "+o1.getValue());
	}
}
}
