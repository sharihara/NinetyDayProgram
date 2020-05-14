package NinetyDaysProgramDay3;

public class ValidEmailMethod2 {

	public static void main(String[] args) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		String email = "hari.123@gmail.com";
	      System.out.println("The E-mail ID is: " + email);
	      System.out.println(email.matches(regex));

	}

}
