package creational.factoryabstract.factories;

import creational.factoryabstract.buttons.Button;
import creational.factoryabstract.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}