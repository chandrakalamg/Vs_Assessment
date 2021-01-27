import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Multiplier {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
    //ArrayList<Integer> arr = new ArrayList<Integer>();
	List<Integer> list = new ArrayList<>();
    System.out.print("Enter integers please ");
    System.out.println("(EOF or non-integer to terminate): ");

    while(scan.hasNextInt()){
    	list.add(scan.nextInt());
    }
        System.out.println("Original Input ArrayList : " + list); 
        List<Integer> arr = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Input ArrayList: "+ arr); 
    divisibilityCheck(arr, arr.size());
	}
	
	static void divisibilityCheck(List<Integer> arr, int size) {
		
	//	static void divisibilityCheck(List<Integer> arr, int size) {
			//int count = 0;
			List<Integer> arr_out = new ArrayList<Integer>();
				System.out.println("Multiplier of 4 or 6 :");
				for(int i = 0; i<size; i++){			
					if (arr.get(i)!=0 || size>0) {
						if((arr.get(i)%6==0) || (arr.get(i)%4==0)) {					
							arr_out.add(arr.get(i));
							System.out.println(arr.get(i));
						}
					}	
					else {
						System.out.println("Value is:"+arr.get(i));
					}
				}

		}
}
	 