package combination;

import java.util.Scanner;

public class Combination_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combination_lib clib = new Combination_lib();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a number >");
		int s = Integer.parseInt(scan.next());
		System.out.println(s + "! = " + clib.getFactorial(s));
	}

}
