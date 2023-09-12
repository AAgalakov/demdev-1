package homework1;

public class Time {

	public static void main(String[] args) {
		print(13);
		print(17);
		print(37);
		print(47);
		print(69);
	}

	public static void print(int interval){
		if (interval < 0 || interval > 59){
			throw new IllegalArgumentException("Неправильное число");
		}
		int i = interval / 15;
		switch (i) {
			case 0 -> System.out.println("Первая");
			case 1 -> System.out.println("Вторая");
			case 2 -> System.out.println("Третья");
			case 3 -> System.out.println("Четвертая");
		}
	}



}
