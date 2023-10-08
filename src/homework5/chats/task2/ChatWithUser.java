package homework5.chats.task2;

import java.util.List;

public class ChatWithUser implements Comparable<ChatWithUser> {

	private final String name;
	private final List<User> userList;

	public ChatWithUser(String name, List<User> userList) {
		this.name = name;
		this.userList = userList;
	}

	public String getName() {
		return name;
	}

	public List<User> getUserList() {
		return userList;
	}

	@Override
	public int compareTo(ChatWithUser o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "ChatWithUser{" + "name='" + name + '\'' + ", userList=" + userList + '}';
	}
}
