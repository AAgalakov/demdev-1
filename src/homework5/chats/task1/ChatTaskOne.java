package homework5.chats.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static homework5.Util.getRandomInt;

public class ChatTaskOne {

	public static void main(String[] args) {
		List<Chat> chats = initChats();
		chats.forEach(System.out::println);
		System.out.println();
		removeLessThanThousand(chats);
		System.out.println("Размер после фильтра: " + chats.size());
		chats.forEach(System.out::println);
		System.out.println();
		sortByNameAndCountOfParticipants(chats);
		chats.forEach(System.out::println);
	}

	private static void removeLessThanThousand(List<Chat> chats) {
		for (Iterator<Chat> iterator = chats.iterator(); iterator.hasNext(); ) {
			Chat next = iterator.next();
			if (next.getCountOfUsers() < 1000) {
				iterator.remove();
			}
		}
	}

	private static void sortByNameAndCountOfParticipants(List<Chat> chats) {
		chats.sort(new ChatComparator());
	}

	private static List<Chat> initChats() {
		List<Chat> chats = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			chats.add(new Chat("Chat № " + getRandomInt(0, 100), getRandomInt(1, 5000)));
		}
		return chats;
	}
}
