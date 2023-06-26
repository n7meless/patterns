package behavioral.visitor.simple2;


public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}