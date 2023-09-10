package homework1;

public class Triangle {

	public static void main(String[] args) {
		double sqrtTr1 = sqrt(2.0, 2.0, 3.0);
		double sqrtTr2 = sqrt(2.0, 2.0, 3.0);
		result(sqrtTr1, sqrtTr2);
	}

	public static void result(double sqrtTriangle1, double sqrtTriangle2) {
		if (sqrtTriangle1 > sqrtTriangle2) {
			System.out.println("первый треугольник больше");
		} else if (sqrtTriangle1 < sqrtTriangle2) {
			System.out.println("первый треугольник меньше");
		} else {
			System.out.println("первый треугольник равен второму");
		}
	}

	public static double sqrt(double a, double b, double c) {
		double pp = (a + b + c) / 2.0;
		return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
	}
}
