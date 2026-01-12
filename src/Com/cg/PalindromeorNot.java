package Com.cg;

public class PalindromeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9989;
		int temp=n;
		int rev =0;
		while(temp!=0) {
			int rem = temp%10;
			rev = rev*10+rem;
			temp=temp/10;
			}
		if(rev==n) {
			System.out.println("The number is a palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}
		

	}

}
