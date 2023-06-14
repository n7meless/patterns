package behavioral.visitor.simple;

public class Main {
    /*Посетитель - позволяет добавлять в программу новые операции,
    * не изменяя классы обьектов, над которыми эти операции могут выполняться*/
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        Visitor soundVisitor = new SoundVisitor();
        Visitor actionVisitor = new ActionVisitor();

        cat.accept(soundVisitor);
        dog.accept(soundVisitor);

        cat.accept(actionVisitor);
        dog.accept(actionVisitor);

    }
}
