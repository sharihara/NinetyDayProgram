package NinetyDaysProgramDay2;

public class SumOfNumbersRE {

	public static void main(String[] args) {
		int sum=0;
		String s = "asdf1qwer9as8d7";
		for(int i=0; i<s.length(); i++) {
		    char temp = s.charAt(i);
		    if (Character.isDigit(temp)) {
		        int b = Integer.parseInt(String.valueOf(temp));
		        sum=sum+b;
		    }
		}
		System.out.println(sum);

	}

}
