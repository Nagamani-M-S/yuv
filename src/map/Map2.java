package map;

import java.util.LinkedHashMap;

public class Map2 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
		l1.put("dinga",10);
		l1.put("dingi",20);
		l1.put("pinga",30);
		l1.put("cuinga",40);
		System.out.println(l1);
	}

}
