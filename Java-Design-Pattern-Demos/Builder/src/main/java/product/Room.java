package product;

public class Room {

    public String door;

    public String window;

    public String floor;

    public String wall;


    @Override
    public String toString() {
        return "Room{" +
                "door='" + door + '\'' +
                ", window='" + window + '\'' +
                ", floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                '}';
    }

}
