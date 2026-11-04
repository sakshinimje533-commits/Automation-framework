package Programme;

public class AsscendingArray {
	public static void main(String[] args) {
		
		 int x[] = {2, 8, 1, 9, 4, 6, 44, 3, 10};

	        int z;

	        for (int i = 0; i < x.length; i++) {

	            for (int j = i + 1; j < x.length; j++) {

	                if (x[i] > x[j]) {

	                    z = x[i];
	                    x[i] = x[j];
	                    x[j] = z;
	                }
	            }
	        }
            System.out.println("Asscending Array");
	        for (int i = 0; i < x.length; i++) {
	            System.out.print(x[i] + " ");
	        }

	        System.out.println();
	}

}
