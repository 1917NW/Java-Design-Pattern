package builder;

import product.Room;

public class RoomBuilder {
    String door;

    String window;

    String floor;

    String wall;

    public RoomBuilder setDoor(String door) {
        this.door = door;
        return this;
    }

    public RoomBuilder setWindow(String window) {
        this.window = window;
        return this;
    }

    public RoomBuilder setFloor(String floor) {
        this.floor = floor;
        return this;
    }

    public RoomBuilder setWall(String wall) {
        this.wall = wall;
        return this;
    }

    public Room build() {
        Room room = new Room();
        room.door = this.door;
        room.window = this.window;
        room.floor = this.floor;
        room.wall = this.wall;
        return room;
    }
}
