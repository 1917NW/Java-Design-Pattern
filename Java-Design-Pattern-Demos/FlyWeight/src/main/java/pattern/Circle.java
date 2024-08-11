package pattern;

public class Circle {
    private String color;

    private int x;

    private int y;

    public Circle(String color) {
        this.color = color;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;

    }

   public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y);
    }
}
