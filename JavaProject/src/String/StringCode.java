package String;

public class StringCode {
	
	public static void main(String[] args) {
		 String str = "Velocity class";
		 char result[] = str.toCharArray();
		 
		 for(int i = 0 ; i <str.length();i++) {
			 for(int j = i+1; j<str.length(); j++) {
				 if(result[i] == result[j]) {
					 System.out.println(result[i]);
				 }
			 }
		 }
	}

}
