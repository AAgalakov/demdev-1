package homework5;

import java.util.Random;

public final class Util {

	private Util() {}

	public static int getRandomInt(int min, int max) {
		return new Random().nextInt(min, max);
	}
}
