package homework5.chats.task1;

public class Chat implements Comparable<Chat> {

	private final String name;
	private final Integer countOfUsers;

	public Chat(String name, int countOfUsers) {
		this.name = name;
		this.countOfUsers = countOfUsers;
	}

	public String getName() {
		return name;
	}

	public Integer getCountOfUsers() {
		return countOfUsers;
	}

	@Override
	public String toString() {
		return "Chat{" + "name='" + name + '\'' + ", countOfUsers=" + countOfUsers + '}';
	}

	@Override
	public int compareTo(Chat o) {
		return this.name.compareTo(o.getName());
	}
}
