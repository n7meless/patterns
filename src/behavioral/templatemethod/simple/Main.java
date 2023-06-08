package behavioral.templatemethod.simple;

public class Main {
    public static void main(String[] args) {
        IceStructure iceSlide = new IceSlide();
        iceSlide.build();
        IceStructure snegurochka = new Snegurochka();
        snegurochka.build();
    }
}