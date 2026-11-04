package Programme;

public class DuplicateString {
	
	
			public static void main(String[] args) {
				 String str = "programming"; //store the string
				  char result[] = str.toCharArray();
				  for(int i = 0; i<str.length(); i++) {
					  for(int j = i+1; j<str.length();j++) {
						  if(result[i] == result[j]) {
							  System.out.println(result[i]); 
						  }  
					  }
				  }
				 
				 
				 
			}
}


//"I first convert the String into a character array using toCharArray(). 
//Then I use two nested for loops. 
//The outer loop selects each character, 
//and the inner loop compares that character with the characters after it. 
//If both characters are equal, the character is duplicated, so I print it. 
//I use break after finding the duplicate to avoid unnecessary comparisons and repeated printing."

