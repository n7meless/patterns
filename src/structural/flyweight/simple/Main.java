package structural.flyweight.simple;

public class Main {
    /*Легковес - это структурный паттерн, который
    * предлагает использовать разделение
    * для эффективной поддержки множества мелких объектов*/
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        factory.getSymbol("j", "Arial")
                .drawSymbol(new PositionExternalContext(0,0));
        factory.getSymbol("a", "Arial")
                .drawSymbol(new PositionExternalContext(0,1));
        factory.getSymbol("v", "Arial")
                .drawSymbol(new PositionExternalContext(0,2));
        factory.getSymbol("a", "Arial")
                .drawSymbol(new PositionExternalContext(0,3));

    }
}
