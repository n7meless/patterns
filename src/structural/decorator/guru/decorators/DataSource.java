package structural.decorator.guru.decorators;


public interface DataSource {
    void writeData(String data);

    String readData();
}