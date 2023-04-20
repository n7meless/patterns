package creational.factoryabstract;

import creational.factoryabstract.buttons.Button;
import creational.factoryabstract.checkboxes.Checkbox;
import creational.factoryabstract.factories.GUIFactory;

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