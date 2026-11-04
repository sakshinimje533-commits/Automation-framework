package demo;

public class Sakshi {
	
	public static void main(String[] args) {
		
		
			String str = "Programming";
			char result[] = str.toCharArray();
			
			for(int i = 0; i<str.length(); i++) {
				for(int j = i+1; j<str.length(); j++) {
					if(result[i] == result[j] ) {
					System.out.print(result[i]);
						
				
				
					}
				}
			}
			
		}

		
	

}
