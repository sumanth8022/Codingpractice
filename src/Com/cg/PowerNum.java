package Com.cg;

public class PowerNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int pow = 2;
		while(pow!=0) {
			n = n * pow;
			pow--;
		}
		System.out.println(n);

	}

}
