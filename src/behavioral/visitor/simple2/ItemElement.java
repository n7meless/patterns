package behavioral.visitor.simple2;

public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}