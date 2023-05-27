package creational.factoryabstract.guru.factories;

import creational.factoryabstract.guru.buttons.Button;
import creational.factoryabstract.guru.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}