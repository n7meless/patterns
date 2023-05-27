package creational.factorymethod.guru.factories;

import creational.factorymethod.guru.buttons.Button;
import creational.factorymethod.guru.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
