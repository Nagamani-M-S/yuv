package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap11 {
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
			//int largest=0;
			//String s=null;
			for(Entry<String, Integer> o1:a.entrySet())
			{
				//System.out.println(o1.getKey()+" "+o1.getValue());
			if(o1.getValue()<=1)
			{
				/*largest=o1.getValue();
				s=o1.getKey();*/

				System.out.println(o1.getKey()+" "+o1.getValue());
			}
			
		}
		}
}
