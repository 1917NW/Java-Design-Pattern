import color.Color;
import shape.Shape;
// 桥接类
// 多种分类的方式
// 采用组合，而非继承
public class BridgeClass {

public BridgeClass(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    private Color color;

    private Shape shape;

    public void draw() {
        shape.draw();
        color.fill();
    }
}
