package Com.cg;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("It is a even number");
		}
		else {
			System.out.println("It is a odd number");
		}

	}

}
