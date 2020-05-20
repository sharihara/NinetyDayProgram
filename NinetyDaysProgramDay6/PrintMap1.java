package NinetyDaysProgramDay6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PrintMap1 {

	public static void main(String[] args) {
Map<String, Integer> mp= new HashMap<String, Integer>();
		
		// add the entry
		
		mp.put("A",1);
		mp.put("B", 2);
		mp.put("C", 3);
		mp.put("D", 4);
		mp.put("E", 5);
			
	
		// 2 dimension for each
		
		for (Entry<String,Integer> eachEntry : mp.entrySet()) {
			System.out.println(eachEntry.getKey()+"->"+eachEntry.getValue());
		}
		
				
	}

}
