package Array;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		System.out.println("Original Array");
		int x[] = {1,2,3,4,5,6,7};
		
		for(int i = 0 ; i<=x.length-1; i++) {
			System.out.print(x[i] + " ");	
		}
		System.out.println();
		
		int z;
		for(int i = 0; i <= x.length/2 ; i++) {
			
			z = x[i];
			x[i] = x[(x.length-1) - i];
			x[(x.length-1) - i] = z;
		}
		
		System.out.println("Reverse Array");
		for(int i = 0 ; i<=x.length-1; i++) {
			System.out.print(x[i] + " ");
		}
		
	}

}
