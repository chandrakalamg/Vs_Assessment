import java.util.Scanner;

//Palindrome function
// Input - String
// Output - Console output with validation
public class Function_Palindrome {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str, string1,rev = "";
		    Scanner sc = new Scanner(System.in);

		     System.out.println("Enter a string:");
		     str = sc.nextLine();
		     //Convert the input string to lower case
		     string1= str.toLowerCase();
		     int length = string1.length();
		     //Loop through and concatenate string in reverse order
		     if (length>1)
		    	for ( int i = length - 1; i >= 0; i-- )
		    		 rev = rev + string1.charAt(i);
		    // Validate the input string
     		if (string1.equals(rev))
     			System.out.println(str+" is a palindrome");
     		else
     			System.out.println(str+" is not a palindrome");
		}

	}

