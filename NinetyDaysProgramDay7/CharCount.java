package NinetyDaysProgramDay7;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	

		
				// TODO Auto-generated method stub
				
				String txt = "Karma is powerful than God";
				
				char ch;
				
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
				
				int count=0;
				for(int i=0;i<txt.length();i++) {
				/*if(txt.charAt(i)==ch) {
				count=count+1;	
						}
				if (count>1) {
				mp.put(ch, count);
				}*/
				}
				System.out.println(mp);

			}


			}	



