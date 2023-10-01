package homework3.string;

import java.util.Arrays;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class SumNumbers {

	public static void main(String[] args) {
		String string = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
		int[] a = onlyNumbers(string);
		System.out.println(Arrays.toString(a));
		System.out.println(sumArray(a));
	}

	private static int[] onlyNumbers(String s) {
		String replaced = s.replaceAll("\\D", "");
		int length = replaced.length();
		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			int c = Integer.parseInt(String.valueOf(replaced.charAt(i)));
			result[i] = c;
		}
		return result;
	}

	private static int sumArray(int[] value) {
		int result = 0;
		for (int number : value) {
			result += number;
		}
		return result;
	}
}
