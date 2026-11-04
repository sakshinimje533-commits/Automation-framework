package Array;

public class AsscendingOrder {
	
	public static void main(String[] args) {
		System.out.println("Original Array");
		int x[] = {20,24,22,8,89,30,1,5,9};
		
		for(int i = 0 ; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
		
		int z;
		for(int i = 0; i<x.length; i++) {
			for(int j = i+1; j<x.length; j++) {
				if(x[i] > x[j]) {	
					
					z = x[i];
					x[i] = x[j];
					x[j] = z;
				}
			}
		}
		System.out.println("Accending Array");
		for(int i = 0; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

}
