package Com.cg;

public class PerfectSquareOfnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 64;
		int root = (int) Math.sqrt(n);
		if(root*root !=n) {
			System.out.println("not a perfectSqaure");
		}
		else {
			System.out.println("perfect square");
		}
	}

}
