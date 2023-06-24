package structural.flyweight.simple2;

/*
 * Разделяемый приспособленец - Квадрат.
 * Внутренее состояние - высота, ширина.
 */
public class Square implements Primitive {
    private int height, width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Context context) { }
}