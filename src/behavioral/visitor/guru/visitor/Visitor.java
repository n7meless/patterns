package behavioral.visitor.guru.visitor;

import behavioral.visitor.guru.shapes.Circle;
import behavioral.visitor.guru.shapes.CompoundShape;
import behavioral.visitor.guru.shapes.Dot;
import behavioral.visitor.guru.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}