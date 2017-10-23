package combination;

public class Combination_lib {
	public int getFactorial(int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * getFactorial(n - 1);
		}
	}
}
