package homework5.chats.task1;

import java.util.Comparator;

public class ChatComparator implements Comparator<Chat> {
	@Override
	public int compare(Chat o1, Chat o2) {
		int i = o1.getName().compareTo(o2.getName());
		if (i == 0) {
			return o1.getCountOfUsers().compareTo(o2.getCountOfUsers());
		} else {
			return i;
		}
	}
}
