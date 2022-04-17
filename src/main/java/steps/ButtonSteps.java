package steps;

import io.cucumber.java.ru.И;
import pages.BasePage;

public class ButtonSteps {

    private BasePage page;

    @И("я нажму на кнопку {string}")
    public void pressButton(String buttonName){
        page.getButtonByName(buttonName).click();
    }

}
