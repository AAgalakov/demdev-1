package homework2.arrays;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class PositiveNumbers {

	public static void main(String[] args) {
		int[] value = {3, 5, -6, 3, 2, -9, 0, -123};
		System.out.println(Arrays.toString(removeNegativeNumberAndMultiplyOnCountPositive(value)));
	}

	private static int[] removeNegativeNumberAndMultiplyOnCountPositive(int[] value) {
		int[] result = removeNegativeNumbers(value);
		multiplyOnLength(result);
		return result;
	}

	private static int[] removeNegativeNumbers(int[] value) {
		int size = 0;
		for (int j : value) {
			if (j >= 0) {
				size++;
			}
		}
		int[] result = new int[size];
		int counter = 0;
		for (int j : value) {
			if (j >= 0) {
				result[counter++] = j;
			}
		}
		return result;
	}

	private static void multiplyOnLength(int[] value){
		for (int i = 0; i < value.length; i++) {
			value[i] *= value.length;
		}
	}
}
