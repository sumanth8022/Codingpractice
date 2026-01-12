package Com.cg;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9876;
		int sum=0;
		while(n!=0) {
			int rem = n %10;
			sum += rem;
			n=n/10;
		}
System.out.println("The sum of number is : " +sum);
	}

}
