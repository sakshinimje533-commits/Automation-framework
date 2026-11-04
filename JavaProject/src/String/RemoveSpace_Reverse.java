package String;

public class RemoveSpace_Reverse {
	
	public static void main(String[] args) {
		
	        String input = "This is a Java Program";

	        // Step 1: Remove spaces
	        String noSpaces = input.replaceAll("\\s+", "");

	        // Step 2: Reverse the string
	        String reversed = new StringBuilder(noSpaces).reverse().toString();

	        // Output
	        System.out.println("Original String: " + input);
	        System.out.println("Without Spaces: " + noSpaces);
	        System.out.println("Reversed String: " + reversed);
	        
	    }
		
	}



