package NinetyDaysProgramDay9;

public class AmstrongNumbers {
	public static void main(String[] args) {
		int a[] = new int[10]; 
	      
        // assigning first and second elements 
        a[0] = 0; 
        a[1] = 1; 
      
        for (int i = 2; i < 10; i++) 
        { 
      
            // storing sum in the 
            // preceding location 
            a[i] = a[i - 2] + a[i - 1]; 
        } 
      
        for (int i = 9; i >= 0; i--)  
        { 
      
            // printing array in 
            // reverse order 
            System.out.print(a[i] +" "); 
        }  
		
}
}

