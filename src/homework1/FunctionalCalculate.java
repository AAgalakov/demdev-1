package homework1;

public class FunctionalCalculate {

	public static void main(String[] args) {
		System.out.println(result(24.4, 10.1, '+'));
	}

	public static double result (double operand1, double operand2, char operation){
		switch (operation) {
			case '+' -> {
				return operand1 + operand2;
			}
			case '-' -> {
				return operand1 - operand2;
			}
			case '*' -> {
				return operand1 * operand2;
			}
			case '/' -> {
				return operand1 / operand2;
			}
			case '%' -> {
				return operand1 % operand2;
			}
			default -> throw new IllegalArgumentException("Неизвестный символ");
		}
	}
}
