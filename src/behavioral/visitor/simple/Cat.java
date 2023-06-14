package behavioral.visitor.simple;

public class Cat implements Animal{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCat(this);
    }
}
