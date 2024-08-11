import color.impl.Red;
import color.impl.Yellow;
import shape.impl.Circle;
import shape.impl.Square;

public class Main {
    public static void main(String[] args) {
        // 基于桥接模式，组合类的数量只有一个，即 BridgeClass
        new BridgeClass(new Square(), new Red()).draw();
        new BridgeClass(new Circle(), new Yellow()).draw();
        new BridgeClass(new Square(), new Yellow()).draw();
        new BridgeClass(new Circle(), new Red()).draw();
    }
}
