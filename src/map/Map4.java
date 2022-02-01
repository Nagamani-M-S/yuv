package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map4 {

	public static void main(String[] args) {
	Map<String,Integer>a=new HashMap<String,Integer>();
	String[]arr={"pappa","mamma","mumma","puppa","pappa"};
	for(String r:arr)
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
	for(Entry<String, Integer> o1:a.entrySet())
	{
		System.out.println(o1.getKey()+" "+o1.getValue());
	}
}
}
