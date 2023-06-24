package structural.flyweight.simple2;

/*
 * Окружнсоть - разделяемый приспособленец. Внутреннее состояние - радиус
 */
public class Circle implements Primitive {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Context context) { }
}