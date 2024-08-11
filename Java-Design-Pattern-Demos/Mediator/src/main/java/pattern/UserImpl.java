package pattern;

public class UserImpl extends User{
    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sends: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " received: " + message);
    }
}
