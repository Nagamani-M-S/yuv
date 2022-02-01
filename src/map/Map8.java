package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map8 {
		public static void main(String[] args) {
		Map<Character,Integer>a=new HashMap<Character,Integer>();
		char[]arr={'a','b','c','a','c'};
		for(char r:arr)
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
		for(Entry<Character, Integer> o1:a.entrySet())
		{
			System.out.println(o1.getKey()+" "+o1.getValue());
		}
	}
	}

