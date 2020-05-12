package NinetyDaysProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt = "you have no choice other than following me!";
		char ch='o';
		
		Map<Character,Integer>mp=new HashMap<Character,Integer>();
		
		char[] stringArray=txt.toCharArray();
		
		for(char c:stringArray) {
			if(mp.containsKey(c)) {
				
				mp.put(c, mp.get(c)+1);
			}
			else
			{
				
				mp.put(c,1);	
			}
			
		}
		for (Entry<Character,Integer> eachEntry : mp.entrySet()) {
			if(eachEntry.getKey().equals('o')) {
			System.out.println("Occurance of "+eachEntry.getKey()+" is: "+eachEntry.getValue());
		}
		}
		/*int count=0;
		for(int i=0;i<txt.length();i++) {
		if(txt.charAt(i)==ch) {
		count=count+1;	
			
		
		}
		mp.put(ch, count);
		}
		System.out.println(mp);

	}

*/
	}	
	}
