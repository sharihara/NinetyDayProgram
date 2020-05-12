package NinetyDaysProgram;

public class PalindromeMethod2 {
	public static void main(String[] args) {
		String str="malayalam";
		
		StringBuffer stb=new StringBuffer(str);
		StringBuffer reverse=stb.reverse();
		String rev=reverse.toString();
		if(rev.contentEquals(str)) {
			System.out.println("Palindrome");
		}
			else {
				System.out.println("Not a palindrome");
			}
		}
		
}

