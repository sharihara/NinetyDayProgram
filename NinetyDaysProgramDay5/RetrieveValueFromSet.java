package NinetyDaysProgramDay5;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RetrieveValueFromSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hashset = new LinkedHashSet<Integer>();
		hashset.add(1);
		hashset.add(2);
		hashset.add(3);
		hashset.add(4);
		hashset.add(5);
		hashset.add(6);
		hashset.add(7);
		hashset.add(8);
		hashset.add(9);
		
		for (Integer num : hashset) {
			if(num.equals(7)) {
			System.out.println(num);
			}
		}
			}
	

}
