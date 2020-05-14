package NinetyDaysProgramDay3;

public class ValidPassword {

	public static void main(String[] args) {
		String regex =
				"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";
		String userid = "Hari@gmail1.com";
	      System.out.println("The User ID is: " + userid);
	      System.out.println(userid.matches(regex));


	}

}
