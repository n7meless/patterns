package creational.factoryabstract.guru.factories;

import creational.factoryabstract.guru.buttons.Button;
import creational.factoryabstract.guru.buttons.MacOSButton;
import creational.factoryabstract.guru.checkboxes.Checkbox;
import creational.factoryabstract.guru.checkboxes.MacOSCheckbox;

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