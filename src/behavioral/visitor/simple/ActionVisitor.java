package behavioral.visitor.simple;

public class ActionVisitor implements Visitor {
    @Override
    public void visitCat(Cat cat){
        System.out.println("Playing with the cat!");

    }
    @Override
    public void visitDog(Dog dog) {
        System.out.println("Taking the dog for a walk");
    }
}
