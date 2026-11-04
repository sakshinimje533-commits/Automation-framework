package Programme;

public class PalimdromeString {
	
	public static void main(String[] args) {

 String str = "Sanvi";
 String rev = " ";
 for(int i = str.length()-1; i>=0; i--) {
	 rev = rev +str.charAt(i);
	 
 }
 if(str.equals(rev)) {
	 System.out.println("palindrome");
 } else {
	 System.out.println("Not Palindrome");
 }
 

}
}