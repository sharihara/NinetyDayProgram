package NinetyDaysProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindNumberOfOccurancesMethod2 {

	public static void main(String[] args) {
		
		
		String txt = "you have no choice other than following me!";
		// I need to find the number of 'o' in the above string

		// Create a counter variable to count the number of 'o'
		int count=0;
		
		// Converting sentence into sequence of characters
		char[] array=txt.toCharArray();
		
		for(int i=0;i<array.length;i++) {
			if(array[i]=='o') {
				count=count+1;
			}
		}
		//Print the value of the count
		System.out.println("Occurance of o is: "+count);
	}
}