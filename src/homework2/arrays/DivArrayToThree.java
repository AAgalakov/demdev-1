package homework2.arrays;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * 								[-4, -18]
 * [-4, 0, 1, 9, 0, -18, 3] -> 	[0, 0]
 * 								[1, 9, 3]
 */
public class DivArrayToThree {

	public static final String NUMBER_SEPARATOR = ",";

	public static void main(String[] args) {
		int[] value = {-4, 0, 1, 9, 0, -18, 3};
		int[][] result = separateArray(value);
		for (int[] array : result) {
			System.out.println(Arrays.toString(array));
		}
	}

	public static int[][] separateArray(int[] intArray) {
		StringBuilder positive = new StringBuilder();
		StringBuilder negative = new StringBuilder();
		StringBuilder zero = new StringBuilder();
		for (int i : intArray) {
			if (i > 0) {
				positive.append(i).append(NUMBER_SEPARATOR);
			} else if (i < 0) {
				negative.append(i).append(NUMBER_SEPARATOR);
			} else
				zero.append(i).append(NUMBER_SEPARATOR);
		}

		return new int[][]{convertStringToIntArray(negative.toString()), convertStringToIntArray(zero.toString()),
			convertStringToIntArray(positive.toString())};
	}

	private static int[] convertStringToIntArray(String value) {
		if (value.isEmpty()) {
			return new int[0];
		}
		String[] split = value.split(NUMBER_SEPARATOR);
		int[] result = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			result[i] = Integer.parseInt(split[i]);
		}

		return result;
	}
}
