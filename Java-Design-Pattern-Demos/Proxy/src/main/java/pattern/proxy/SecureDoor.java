package pattern.proxy;

import pattern.target.Door;

public class SecureDoor {
    private Door door;

    public SecureDoor(Door door) {
        this.door = door;
    }

    public void open(String password) {
        if (authenticate(password)) {
            door.open();
        } else {
            System.out.println("Big no! It ain't possible.");
        }
    }

    private boolean authenticate(String password) {
        return password.equals("$ecr@t");
    }
}
