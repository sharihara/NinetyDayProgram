package NinetyDaysProgramDay8;

public class SortAndReverse {

	public static void main(String[] args) {
		 //Initialize array     
        int [] arr = new int [] {20, 30, 25, 35, -16, 60, -100};     
        int temp = 0;   
        int total=0;
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }


        /* arr.length returns the number of elements 
         * present in the array
         */
        double average = total / arr.length;
        
        /* This is used for displaying the formatted output
         * if you give %.4f then the output would have 4 digits
         * after decimal point.
         */
        System.out.format("The average is: %.3f", average);
	}
}
