package creational.factoryabstract.factories;

import creational.factoryabstract.buttons.Button;
import creational.factoryabstract.buttons.WindowsButton;
import creational.factoryabstract.checkboxes.Checkbox;
import creational.factoryabstract.checkboxes.WindowsCheckbox;

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