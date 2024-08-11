package pattern;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {

    private static final Map<String, Circle> circleMap = new HashMap<>();

    public CircleFactory() {
    }


    public Circle getCircle(String color) {
        Circle circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
