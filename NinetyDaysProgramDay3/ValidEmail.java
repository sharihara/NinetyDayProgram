package NinetyDaysProgramDay3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {

	public static void main(String[] args) {
		//String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		String email = "hari.123@gmail.com";
		String pattern="[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
		Pattern compile = Pattern.compile(pattern);
		System.out.println(compile);
		Matcher matcher = compile.matcher(email);
		System.out.println(matcher);
	      System.out.println("The E-mail ID is: " + email);
	      System.out.println(matcher.matches());

	}

}
