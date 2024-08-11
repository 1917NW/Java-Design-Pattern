import pattern.proxy.SecureDoor;
import pattern.target.Door;

public class Main {
    public static void main(String[] args) {
        SecureDoor door = new SecureDoor(new Door());
        door.open("invalid");
        door.open("$ecr@t");
    }
}
