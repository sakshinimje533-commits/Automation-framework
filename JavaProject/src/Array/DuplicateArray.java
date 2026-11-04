package Array;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int x[] = {23,76,1,1,2,3,4,2,6,8,4,9,11};
		
		for(int i = 0 ; i<x.length; i++) {
			for(int j = i+1; j<x.length; j++) {
				if(x[i] == x[j]) {
					System.out.println(x[i] + " ");
				}
			}
		}
	}

}
