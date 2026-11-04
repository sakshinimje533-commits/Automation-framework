package Array;

public class Smallest_Lagrest_Array {
	
	public static void main(String[] args) {
		
		int x[] = {12 , 4 , 6 , 8 , 10 , 2 , 5};
		
		int min = x[0];
		int max = x[0];
		
		for(int i = 0; i<x.length; i ++) {
			if(x[i] < min) {
				min = x[i];
			}
		}
		System.out.println("Smallest Number is" + min);
		
		for(int i = 0; i<x.length; i++) {
			if(x[i] > max) {
				max = x[i];
				
			}
		}
		System.out.println("Largest Array is "+ max);
	}

}
