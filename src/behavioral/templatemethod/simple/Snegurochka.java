package behavioral.templatemethod.simple;

public class Snegurochka extends IceStructure {
    @Override
    protected void formSnow() {
        System.out.println("сформировать снегурочку");
    }
    // переопределяем хук
    @Override
    protected void additionalAction() {
        System.out.println("поставить на постамент");
    }
}