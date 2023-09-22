package homework2.cycles;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобиться функция возведение числа в степень: Math.pow(число, степень)
 */
public class Reverse {

	public static void main(String[] args) {
		System.out.println(toReverse(4700));
	}

	public static int toReverse(int value){
		StringBuilder result = new StringBuilder();
		while (value > 0){
			result.append(value % 10);
			value = value / 10;
		}

		return Integer.parseInt(result.toString());
	}
}
