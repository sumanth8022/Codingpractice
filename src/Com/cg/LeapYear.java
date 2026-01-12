package Com.cg;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2007;
		if(n%400==0) {
			System.out.println("leap year");
		}
		else if((n%4==0)&& (n%100 !=0)) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
