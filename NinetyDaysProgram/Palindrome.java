package NinetyDaysProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String a = "";
		String b = "";
		System.out.print("Check the palindrome of the given string");
        Scanner s = new Scanner(System.in);
         a = s.nextLine();
         
        //a="Malayalam";
         //a="Testleaf"
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Yes, Palindrome");
        }
        else
        {
            System.out.println("No, not a palindrome");
        }
    }

}
