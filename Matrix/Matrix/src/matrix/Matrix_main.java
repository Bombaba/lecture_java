package matrix;

import java.util.Arrays;

public class Matrix_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[][] = {{0, 1}, {2, 0}, {0, 3}};
		double b[][] = {{1, -1, 2}, {3, 0, 4}};
		
		Matrix_lib mlib = new Matrix_lib();
		System.out.println(
			"Product = " + Arrays.deepToString(mlib.getProduct(a, b)));
		System.out.println(
			"Transpose = " + Arrays.deepToString(mlib.getTranspose(b)));
		
		double c[][] = {{3, 1, 1, 2}, {5, 1, 3, 4}, {2, 0, 1, 0}, {1, 3, 2, 1}};
		System.out.println("Cofactor = " + (mlib.getCofactor(c)));
		double c_inv[][] = mlib.getInverse(c);
		System.out.println("Inverse = " + Arrays.deepToString(c_inv));
		
		System.out.println(Arrays.deepToString(mlib.getProduct(c, c_inv)));
	}

}
