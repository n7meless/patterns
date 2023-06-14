package behavioral.visitor.simple;

public class Dog implements Animal{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitDog(this);
    }
}
