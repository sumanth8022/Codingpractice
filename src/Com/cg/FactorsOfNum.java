package Com.cg;

public class FactorsOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		System.out.print("The Factors of Number : " + " ");
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}
	}

}
