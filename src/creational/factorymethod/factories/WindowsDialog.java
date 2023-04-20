package creational.factorymethod.factories;

import creational.factorymethod.buttons.Button;
import creational.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
