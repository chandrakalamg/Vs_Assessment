//import all the required libraries
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// This is our main class
// Input type - Integer, numbers
// Output - numbers which are divisible by 4 and 6
public class Function_Multiplier {

	public static void main(String[] args) {
		// Data input from console to an integer arraylist
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
	    	System.out.print("Enter numbers ");
	    	System.out.println("(EOF or non-integer to terminate): ");
	    // Add numbers to array list and print the values in console
	    while(scan.hasNextInt()){
	    	list.add(scan.nextInt());
	    }
	        System.out.println("Original Input ArrayList : " + list); 
	        //Check for duplicate elements and remove
	        List<Integer> arr = list.stream().distinct().collect(Collectors.toList());
	        System.out.println("Input ArrayList: "+ arr);
	    //Call the ismultiplier method
	    ismultiplier(arr, arr.size());
	    
	    //arraycheck(arr, arr.size());
	}

	// Function to fetch numbers divisible by 4 or 6 and both
	//Input - array list
	//Output - Console output with required numbers divisible by 4 or 6 and both
	public static void ismultiplier(List<Integer> arr, int size) {
		System.out.println("\nMultiplier of 4: ");		
	for(int i = 0; i<size; i++){
		if (arr.get(i)%4==0 && arr.get(i)!=0)
		System.out.print(arr.get(i) +", ");			
	}			
			
		System.out.println("\n\nMultiplier of 6: ");
	for(int i = 0; i<size; i++){
		if (arr.get(i)%6==0 && arr.get(i)!=0) System.out.print(arr.get(i) +", ");			
	}
			
		System.out.println("\n\nMultiplier of both 4 & 6: ");			
	for(int i = 0; i<size; i++){
		if (arr.get(i)%4==0 && arr.get(i)%6==0 && arr.get(i)!=0) 
			System.out.print(arr.get(i) +", ");			
	}
	System.out.println("\n");
}

	//-----------------------------------------------------------------------//
	/*public static void arraycheck(List<Integer> arr, int size) {
		System.out.println("Function2:Multiplier of 4 and 6: ");		
		for(int i = 0; i<size; i++) {
			if (arr.get(i)!=0) 
				if (arr.get(i)%4==0 || arr.get(i)%4==0)
					System.out.print(arr.get(i) +", ");					
			}
		//System.out.println("\n");
	}
*/
}
