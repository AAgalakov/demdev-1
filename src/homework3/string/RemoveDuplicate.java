package homework3.string;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		String string = "abc Cpddd Dio OsfWw";
		System.out.println(run(string));
	}

	private static String run(String string) {
		StringBuilder result = new StringBuilder();
		char[] charArray = string.toUpperCase().replaceAll(" ", "").toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i != 0) {
				char c = result.charAt(result.length() - 1);
				if (c == charArray[i]) {
					continue;
				}
			}
			result.append(charArray[i]);
		}

		return result.toString();
	}
}
