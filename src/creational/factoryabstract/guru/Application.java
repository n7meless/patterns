package creational.factoryabstract.guru;

import creational.factoryabstract.guru.buttons.Button;
import creational.factoryabstract.guru.checkboxes.Checkbox;
import creational.factoryabstract.guru.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}