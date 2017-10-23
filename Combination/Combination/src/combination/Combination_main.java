package combination;

import java.util.Scanner;

public class Combination_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combination_lib clib = new Combination_lib();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a number s>");
		int s = Integer.parseInt(scan.next());
		System.out.println("Input a number r>");
		int r = Integer.parseInt(scan.next());

		System.out.println(s + "C" + r + " = "
			+ clib.getFactorial(s) / (clib.getFactorial(r)*clib.getFactorial(s-r)));
	}

}
