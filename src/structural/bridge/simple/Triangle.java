package structural.bridge.simple;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Треугольник");
        color.fillColor();
    }
}
