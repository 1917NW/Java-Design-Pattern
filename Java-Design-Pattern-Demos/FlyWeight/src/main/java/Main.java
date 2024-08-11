import pattern.Circle;
import pattern.CircleFactory;

public class Main {
    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();

        Circle circle1 = circleFactory.getCircle("Red");
        circle1.setPosition(10, 10);
        circle1.draw();

        Circle circle2 = circleFactory.getCircle("Green");
        circle2.setPosition(20, 20);
        circle2.draw();

        Circle circle3 = circleFactory.getCircle("Red");
        circle3.setPosition(30, 30);
        circle3.draw();

        Circle circle4 = circleFactory.getCircle("Green");
        circle4.setPosition(40, 40);
        circle4.draw();
    }
}
