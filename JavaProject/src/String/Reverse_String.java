package String;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String str = "Fujitsu"; // store the string
		String rev = " "; // then i create an empty string
		
		for(int i = str.length()-1 ; i>=0 ; i--) { //Start the loop from the last character
			rev = rev + str.charAt(i); //rev stores the reversed String.
			//str.charAt(i) retrieves the current character from the original String,
			//and using rev + str.charAt(i),
			//I append that character to rev in reverse order."
			
		}
		System.out.println(rev);
	}

}

