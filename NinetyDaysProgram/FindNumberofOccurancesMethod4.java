package NinetyDaysProgram;

public class FindNumberofOccurancesMethod4 {
	public static void main(String[] args) {
	String txt = "you have no choice other than following me!";
			// I need to find the number of 'o' in the above string
	
			// Create a counter variable to count the number of 'o'
			int count=0;
			
			// Converting sentence into sequence of characters
			String replace=txt.replaceAll("[^o]", "");
			
			System.out.println("Occurance of o is: "+replace.length());
			}
			
}


