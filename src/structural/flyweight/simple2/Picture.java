package structural.flyweight.simple2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Не разделяемый приспособленец - изображение.
 */
public class Picture implements Primitive {
    private List<Primitive> childrens;

    public Picture(Primitive ...primitives) {
        this.childrens = new LinkedList<Primitive>();
        this.childrens.addAll(Arrays.asList(primitives));
    }

    @Override
    public void draw(Context context) {
        for (Primitive p: childrens) {
            p.draw(context);
        }
    }
}