package NinetyDaysProgramDay9;

public class FibonnaciReverse {
	public static void main(String[] args) {
		int n, count = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i = 1; i <= 10000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
               // System.out.println(b);
                sum = sum + (b * b * b);
                // System.out.println(sum);
                n = n / 10;
                // System.out.println(n);
                                         
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }  
		
}
}

