package homework2.arrays;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class SymbolToNumber {

	public static void main(String[] args) {
		char[] chars = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
		printValueAboveArithmeticMean(chars);
	}

	public static void printValueAboveArithmeticMean(char[] value) {
		if (value.length > 0) {
			int length = value.length;
			int[] intArray = new int[length];
			double sum = 0;
			for (int i = 0; i < length; i++) {
				int intValue = value[i];
				intArray[i] = intValue;
				sum += intValue;
			}
			double sumDivSize = sum / length;
			for (int i = 0; i < length; i++) {
				int intValue = intArray[i];
				if (intValue > sumDivSize) {
					System.out.println(intValue);
				}
			}
		}
	}
}
