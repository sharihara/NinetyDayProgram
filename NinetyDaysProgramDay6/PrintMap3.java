package NinetyDaysProgramDay6;

import java.util.HashMap;
import java.util.Map;

public class PrintMap3 {

	public static void main(String[] args) {
		
Map<String, Integer> mp= new HashMap<String, Integer>();
		
		// add the entry
		
		mp.put("A",1);
		mp.put("B", 2);
		mp.put("C", 3);
		mp.put("D", 4);
		mp.put("E", 5);
		// 3. Java 8 - Collection.iterator() + Iterator.forEachRemaining()
				mp.keySet().iterator()
						.forEachRemaining(System.out::println);
				mp.values().iterator()
				.forEachRemaining(System.out::println);
				
				//Extra learning --
				mp.entrySet().forEach((eachEntry)->{
					if(eachEntry.getKey().equals("A")||eachEntry.getKey().equals("C")) {
						eachEntry.setValue(10);
				}	
				});
				System.out.println(mp);
				

	}

}
