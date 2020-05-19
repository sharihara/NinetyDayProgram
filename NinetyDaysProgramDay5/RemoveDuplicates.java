package NinetyDaysProgramDay5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
List<String> arraylist=new ArrayList<String>();
		
		// |To store value in List
arraylist.add("A");
arraylist.add("B");
arraylist.add("C");
arraylist.add("D");
arraylist.add("A");
arraylist.add("D");
arraylist.add("E");
arraylist.add("F");
	
System.out.println("Before Removing duplicate elements:"+arraylist);
    
    HashSet<String> hashset = new HashSet<String>();
    
    /* Adding ArrayList elements to the HashSet
     * in order to remove the duplicate elements and 
     * to preserve the insertion order.
     */
    hashset.addAll(arraylist);
 
    // Removing ArrayList elements
    arraylist.clear();
 
    // Adding LinkedHashSet elements to the ArrayList
    arraylist.addAll(hashset );
 
    System.out.println("After Removing duplicate elements:"+arraylist);
}
}