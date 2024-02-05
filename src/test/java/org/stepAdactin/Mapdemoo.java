package org.stepAdactin;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdemoo {

	public static void main(String[] args) {
	      
		  Map<Integer,String> mp= new HashMap<Integer,String>();
		mp.put(1,"java");
		mp.put(2,"Selenium");
		mp.put(3,"FrameWork");
		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);
		Collection<String> values = mp.values();
		System.out.println(values);
		Set<Entry<Integer,String>> es=mp.entrySet();

		//Set<entry<Integer,String>> es=mp.entrySet();

		for(Entry x:es)
		{
			Object key = x.getKey();
			
			Object value = x.getValue();
			System.out.println(key);
			System.out.println(value);
		}
		
	

	}

}
