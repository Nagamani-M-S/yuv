package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map11 {

	public static void main(String[] args) {
	Map<Boolean,Integer>a=new HashMap<Boolean,Integer>();
	boolean[]arr={true,false,true,true};
	for(Boolean r:arr)
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
	for(Entry<Boolean, Integer> o1:a.entrySet())
	{
		System.out.println(o1.getKey()+" "+o1.getValue());
	}
}
}
