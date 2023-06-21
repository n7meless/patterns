package structural.composite.simple2;

public class TestCompositePattern {
    /*Композитный шаблон — это один из структурных шаблонов проектирования.
    Составной шаблон проектирования используется,
    когда нам нужно представить иерархию часть-целое.*/

    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }

}