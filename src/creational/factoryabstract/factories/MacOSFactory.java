package creational.factoryabstract.factories;

import creational.factoryabstract.buttons.Button;
import creational.factoryabstract.buttons.MacOSButton;
import creational.factoryabstract.checkboxes.Checkbox;
import creational.factoryabstract.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}