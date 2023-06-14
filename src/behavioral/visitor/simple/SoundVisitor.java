package behavioral.visitor.simple;

public class SoundVisitor implements Visitor {
    @Override
    public void visitCat(Cat cat) {
        System.out.println("Meew!");

    }
    @Override
    public void visitDog(Dog dog) {
        System.out.println("Woof");
    }
}
