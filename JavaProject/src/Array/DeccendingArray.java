package Array;

public class DeccendingArray {
	
	public static void main(String[] args) {
		
		System.out.println("Original Array");
		int x[] = {87,99,20,24,65,73,1,8,5};
		
		for(int i = 0; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
		int z;
		for(int i = 0; i<x.length; i++) {
			for(int j = i+1; j<x.length; j++) {
				if(x[i] < x[j]) {
					
					z = x[i];
					x[i] = x[j];
					x[j] = z;
					
				}
			}
		}
		
		System.out.println("Deccending Array");
		for(int i = 0; i< x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

}
