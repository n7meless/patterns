package creational.factorymethod.guru.factories;

import creational.factorymethod.guru.buttons.Button;
import creational.factorymethod.guru.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
