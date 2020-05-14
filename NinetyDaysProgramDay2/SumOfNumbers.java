package NinetyDaysProgramDay2;

public class SumOfNumbers {

	public static void main(String[] args) {
		int sum=0;
		String s = "asdf1qwer9as8d7";
		String NumStr=s.replaceAll("\\D", "");
		System.out.println(NumStr);
		for(int i=0; i<NumStr.length(); i++) {
		    char temp = NumStr.charAt(i);
		    //if (Character.isDigit(temp)) {
		        int b = Integer.parseInt(String.valueOf(temp));
		        sum=sum+b;
		    }
		System.out.println(sum);
	}
	
		

	}

//}
