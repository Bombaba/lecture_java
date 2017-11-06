package matrix;

import java.util.Arrays;

public class Matrix_lib {
	
	public double[][] getTranspose(double[][] a)
	{
		double t[][] = new double[a[0].length][a.length];
		for (int i = 0; i < a[0].length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				t[i][j] = a[j][i];
			}
		}
		return t;
	}
	
	public double[][] getProduct(double[][] a, double[][] b)
	{
		double answer[][] = new double[a.length][b[0].length];
		double t[][] = this.getTranspose(b);
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b[0].length; j++)
			{
				answer[i][j] = this.getInnerProduct(a[i], t[j]);
			}
		}
		return answer;
	}
	
	public double getInnerProduct(double[] a, double[] b)
	{
		double answer = 0;
		for (int i = 0; i < a.length; i++)
		{
			answer += a[i] * b[i];
		}
		return answer;
	}

	public double[][] getCofactorMatrix(double[][] a, int row, int col)
	{
		double answer[][] = new double[a.length - 1][a[0].length -1];
		int p = 0, q = 0;
		for (int j = 0; j < a.length; j++)
		{
			if (j == row) continue;
			for (int k = 0; k < a[0].length; k++)
			{
				if (k == col) continue;
				answer[p][q++] = a[j][k];
			}
			p++;
			q = 0;
		}
		return answer;
	}
	
	public double getCofactor(double[][] a)
	{
		double cofactor = 0;
		if (a.length == 2)
		{
			cofactor = a[0][0] * a[1][1] - a[0][1] * a[1][0];
		}
		else
		{
			int index = 0;
			for (int i = 0; i < a.length; i++)
			{
				double[][] tmp = this.getCofactorMatrix(a, i, index);
				//System.out.println("tmp[" + i + "]" + Arrays.deepToString(tmp));
				cofactor += a[i][index] * Math.pow(-1, (i + index)) * this.getCofactor(tmp);
			}
		}
		return cofactor;
	}
	
	
	public double[][] getInverse(double[][] a)
	{
		double answer[][] = new double[a.length][a[0].length];
		double determinant = getCofactor(a);
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++)
			{
				
				double[][] mat_cofactor = this.getCofactorMatrix(a, i, j);
				answer[j][i] = getCofactor(mat_cofactor) * Math.pow(-1, (i + j)) / determinant;
			}
		}
		return answer;
	}
		
}
