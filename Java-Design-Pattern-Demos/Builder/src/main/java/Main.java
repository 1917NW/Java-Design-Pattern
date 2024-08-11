import builder.RoomBuilder;
import product.Room;

public class Main {
    public static void main(String[] args) {
        RoomBuilder roomBuilder = new RoomBuilder();
        Room room = roomBuilder.setDoor("wooden door")
                .setWindow("iron window")
                .setFloor("black floor")
                .setWall("white wall").build();
        System.out.println(room);
    }
}
