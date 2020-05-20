package NinetyDaysProgramDay6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PrintMap2 {

	public static void main(String[] args) {
Map<String, Integer> mp= new HashMap<String, Integer>();
		
		// add the entry
		
		mp.put("A",1);
		mp.put("B", 2);
		mp.put("C", 3);
		mp.put("D", 4);
		mp.put("E", 5);
			
	
				// 1. using Iterator
				Iterator<String> itr = mp.keySet().iterator();
				Iterator<Integer> itr1 = mp.values().iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next()+"->"+itr1.next());
				}
		
		
	}

}
