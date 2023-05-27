package creational.factoryabstract.guru.factories;

import creational.factoryabstract.guru.buttons.Button;
import creational.factoryabstract.guru.buttons.WindowsButton;
import creational.factoryabstract.guru.checkboxes.Checkbox;
import creational.factoryabstract.guru.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}