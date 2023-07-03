package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
    private String titleText = "Student Registration Form";
    public RegistrationPage openPage() {

        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(titleText));
        executeJavaScript("$('#fixedban').remove()"); // удаление банеров рекламы со страницы
        executeJavaScript("$('footer').remove()"); // удаление банеров рекламы со страницы

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        $("#firstName").setValue(value); // [id=userName] = #userName [class=userName] = .userName

        return this;
    }

    public RegistrationPage setLastName(String value) {

        $("#LastName").setValue(value);

        return this;
    }
    public RegistrationPage setEmail(String value) {

        $("#userEmail").setValue(value);

        return this;
    }
    public RegistrationPage setGender(String value) {

        $("#genterWrapper").$(byText(value)).click(); // не очень хороший пример с выбором кнопки для определ локали

        return this;
    }

    public RegistrationPage setNumber(String value) {

        $("#userNumber").setValue(value);

        return this;
    }
}
