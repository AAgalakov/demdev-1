package homework5.chats.task2;

import java.util.ArrayList;
import java.util.List;

import static homework5.Util.getRandomInt;

public class ChatTaskTwo {

	public static void main(String[] args) {
		List<ChatWithUser> chatWithUsers = initChats();
		List<User> userList = convertToListUsers(chatWithUsers);
		System.out.println("Средний возраст: " + getAverage(userList));
	}

	private static double getAverage(List<User> userList) {
		double result = 0.0;
		for (User user : userList) {
			result += user.getAge();
		}
		return result / userList.size();
	}

	private static List<User> convertToListUsers(List<ChatWithUser> chatWithUsers) {
		List<User> result = new ArrayList<>();
		for (ChatWithUser chat : chatWithUsers) {
			for (User user : chat.getUserList()) {
				isOlderThan18(user, result);
			}
		}
		return result;
	}

	private static void isOlderThan18(User user, List<User> result) {

		if (user.getAge() > 18) {
			result.add(user);
		}
	}

	private static List<ChatWithUser> initChats() {
		List<ChatWithUser> chats = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			List<User> userList = new ArrayList<>();
			for (int j = 1; j < 30; j++) {
				userList.add(new User(j, "User name " + j, getRandomInt(1, 80)));
			}
			chats.add(new ChatWithUser("Chat № " + getRandomInt(0, 100), userList));
		}
		return chats;
	}
}
