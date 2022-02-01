package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map9 {

	public static void main(String[] args) {
	Map<Long,Integer>a=new HashMap<Long,Integer>();
	long[]arr={100,200,300,400,400};
	for(Long r:arr)
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
	for(Entry<Long, Integer> o1:a.entrySet())
	{
		System.out.println(o1.getKey()+" "+o1.getValue());
	}
}
}
