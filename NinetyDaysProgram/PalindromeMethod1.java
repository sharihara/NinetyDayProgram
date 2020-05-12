package NinetyDaysProgram;

public class PalindromeMethod1 {
	public static void main(String[] args) {
		String str="testleaf";
		
		String rev="";
		int n = str.length();
        for(int i = n - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(str.equalsIgnoreCase(rev)?"Yes,Palindrome":"Not a palindrome");
	}
}

