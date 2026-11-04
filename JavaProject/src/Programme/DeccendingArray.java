package Programme;

public class DeccendingArray {
	
	public static void main(String[] args) {
		
		int x[] = {34,82,29,10,2,97,26,87,45};
		
		int z;
		for(int i = 0; i < x.length; i++) {
			for(int j = i+1; j <x.length;j++) {
				if(x[i] < x[j]) {
					z = x[i];
					x[i] = x[j];
					x[j] = z;
				}
			}
		}
		System.out.println("Deccending Order");
		for(int i = 0 ; i < x.length; i++) {
			System.out.print(x[i]+ " ");
		}
		System.out.println();
		
	}
}
