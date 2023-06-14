package behavioral.visitor.guru.shapes;


import behavioral.visitor.guru.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
