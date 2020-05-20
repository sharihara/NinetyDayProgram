package NinetyDaysProgramDay6;

import java.util.HashMap;
import java.util.Map;

public class PrintMap4 {

	public static void main(String[] args) {
		
Map<String, Integer> mp= new HashMap<String, Integer>();
		
		// add the entry
		
		mp.put("A",1);
		mp.put("B", 2);
		mp.put("C", 3);
		mp.put("D", 4);
		mp.put("E", 5);
System.out.println(mp);
mp.forEach((eachKey,eachValue)->System.out.println(eachKey+"->"+eachValue));

	}

}
