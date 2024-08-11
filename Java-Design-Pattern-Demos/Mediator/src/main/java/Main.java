import pattern.ChatMediator;
import pattern.ChatMediatorImpl;
import pattern.User;
import pattern.UserImpl;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new UserImpl(chatMediator, "User 1");
        User user2 = new UserImpl(chatMediator, "User 2");
        User user3 = new UserImpl(chatMediator, "User 3");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.sendMessage("Hello");
    }
}
