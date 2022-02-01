package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map7 {

	public static void main(String[] args) {
	Map<Byte,Integer>a=new HashMap<Byte,Integer>();
	Byte[]arr={10,20,30,40,40};
	for(Byte r:arr)
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
	for(Entry<Byte, Integer> o1:a.entrySet())
	{
		System.out.println(o1.getKey()+" "+o1.getValue());
	}
}
}
