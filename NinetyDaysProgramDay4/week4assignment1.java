package NinetyDaysProgramDay4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class week4assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="paypal India";
		char[] charArray = text.toCharArray();
		Set<Character> values=new LinkedHashSet<Character>(); 
		Set<Character> dupvalues=new LinkedHashSet<Character>(); 
		for (Character eachchar : charArray) {
			if(values.add(eachchar)) {
				dupvalues.add(eachchar);
			}
				
				}
					
				
				
			
				
		
		System.out.println(dupvalues);

	}

}
