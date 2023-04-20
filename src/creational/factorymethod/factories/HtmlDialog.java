package creational.factorymethod.factories;

import creational.factorymethod.buttons.Button;
import creational.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
