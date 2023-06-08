package behavioral.templatemethod.simple;

public abstract class IceStructure {
    //template method
    public void build() {
        collectSnow();     // шаг 1, собрать снег
        formSnow();        // шаг 2, сформировать снег
        fillWithWater();   // шаг 3, залить водой
        //hook
        additionalAction(); // шаг 4, сделать что-то еще
    }
    protected void collectSnow() {
        System.out.println("собрать снег");
    }
    abstract protected void formSnow();
    protected void fillWithWater() {
        System.out.println("залить водой");
    }
    //hook с пустым телом
    protected void additionalAction() {
    }
}