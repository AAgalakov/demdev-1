package homework2.cycles;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class OddEventNumber {

	public static void main(String[] args) {
		int value = 228910;
		System.out.println(countOddNumber(value));
		System.out.println(countEventNumber(value));
	}

	public static int countOddNumber(int value) {
		int counter = 0;
		while (value > 0) {
			if (value % 2 == 0) {
				counter++;
			}
			value = value / 10;
		}

		return counter;
	}

	public static int countEventNumber(int value) {
		int counter = 0;
		while (value > 0) {
			if (value % 2 != 0) {
				counter++;
			}
			value = value / 10;
		}

		return counter;
	}
}
