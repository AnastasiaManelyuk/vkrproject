package steps;

import io.cucumber.java.ru.*;
import pages.BasePage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;

public class FieldSteps {

    private BasePage page;

    @И("я введу в поле {string} значение {string}")
    public void pressButtonAndAddedFile(String fieldName, String value) {
        page.getFieldByName(fieldName).shouldBe(visible).setValue(value);
    }

    @Тогда("я проверю, что поле {string} заполнено значением {string}")
    public void checkFieldValue(String fieldName, String value) {
        page.getFieldByName(fieldName).shouldBe(attribute("value", value));
    }

    @Тогда("я проверю, что поле {string} пустое")
    public void checkFieldNotValue(String fieldName, String value) {
        page.getFieldByName(fieldName).shouldBe(attribute("value", ""));
    }
}
