package structural.flyweight.simple;

public final class ConcreteFlyweight implements SymbolFlyweight {
    private final String symbol;
    private final String symbolStyle;

    public ConcreteFlyweight(String symbol, String symbolStyle) {
        this.symbol = symbol;
        this.symbolStyle = symbolStyle;
    }

    @Override
    public void drawSymbol(PositionExternalContext position) {
        System.out.printf("Отображаем символ: %s " +
                        "в стиле: %s в координатах: x и y, как %d %d",
                symbol, symbolStyle, position.getX(), position.getY());
        System.out.println();
    }
}
