package pages;

import com.codeborne.selenide.SelenideElement;
import elements_objects.*;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class BasePage {
    private final Element button = new Buttons();
    private final Element field = new Fields();
    private final Element radio = new RadioButtons();

    public SelenideElement getButtonByName(String buttonName){
        return $x(format(button.getXPATH(), buttonName));
    }

    public SelenideElement getFieldByName(String fieldName){
        return $x(format(field.getXPATH(), fieldName));
    }

    public SelenideElement getRadioButtonByName(String radioButtonName){
        return $x(format(radio.getXPATH(), radioButtonName));
    }
}
