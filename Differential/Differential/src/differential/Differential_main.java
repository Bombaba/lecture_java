package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.print("Input value of a> ");
			double a = Double.parseDouble(scan.next());
			System.out.print("Input value of h> ");
			double h = Double.parseDouble(scan.next());
			
			Differential_lib dlib = new Differential_lib(a, h);
			System.out.println("f(x) = x^2 の x = " + a + "における微分係数は" + dlib.getRx());
			System.out.println("f(x) = x^2 の x = " + a + "における数値微分は" + dlib.getDx());
			System.out.println("相対誤差は" + dlib.calcRelativeError());
			
			System.out.println("\n** 最小誤差を求める(何かキーを入力してください) **");
			scan.next();
			
			double error_min = Double.MAX_VALUE;
			for (int i = 1; i < Integer.MAX_VALUE ; i++)
			{
				h = 1.0 / Math.pow(10, i);
				dlib = new Differential_lib(a, h);
				double error = dlib.calcRelativeError();
				System.out.println("h:" + h + " -> Relative Error:" + error);
				if (error < error_min)
				{
					error_min = error;
				}
				else
				{
					double epsilon = Double.MIN_VALUE;
					
					double h_min = h;
					double h_max = 10 * h_min;
					double h_middle_prev = h;
					double h_middle = (h_min + h_max) / 2.0;
					while (Math.abs(h_middle - h_middle_prev) > epsilon )
					{
						dlib = new Differential_lib(a, h_middle);
						error = dlib.calcRelativeError();
						System.out.println("h:" + h_middle + " -> Relative Error:" + error);
						if (error < error_min)
						{
							error_min = error;
							h_max = h_middle;
						}
						else
						{
							h_min = h_middle;
						}
						h_middle_prev = h_middle;
						h_middle = (h_min + h_max) / 2.0;
					}
					System.out.println("\nh = " + h_middle + " のとき、最小誤差 " + error_min);
					break;
				}
			}
						
	}

}
