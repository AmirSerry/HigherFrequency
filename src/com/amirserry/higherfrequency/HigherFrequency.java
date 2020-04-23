package com.amirserry.higherfrequency;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HigherFrequency {

	public static int higherFrequency(int[] nums) {
		Map<Integer, Integer> content=new HashMap<Integer, Integer>();
		for(int item :nums) {
			if(!content.containsKey(item)) {
				content.put(item, 0);
			}
			else {
				int count= content.get(item)+1;
				content.put(item, count);
			}
		}
		Entry<Integer, Integer> maxEntry = Collections.max(content.entrySet(), (Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) -> e1.getValue()
		        .compareTo(e2.getValue()));
		
		     if(maxEntry.getValue() < 1) {
		    	 return -1;
		     }
		    return maxEntry.getKey();
		
	}
}
