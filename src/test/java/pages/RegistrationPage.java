package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
    private String titleText = "Student Registration Form";
    public void openPage() {

        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(titleText));
        executeJavaScript("$('#fixedban').remove()"); // удаление банеров рекламы со страницы
        executeJavaScript("$('footer').remove()"); // удаление банеров рекламы со страницы


    }

    public void setFirstName(String value) {
        $("#firstName").setValue(value); // [id=userName] = #userName [class=userName] = .userName
    }

    public void setLastName(String value) {

        $("#LastName").setValue(value);
    }
    public void setEmail(String value) {

        $("#userEmail").setValue(value);

    }
    public void setGender(String value) {

        $("#genterWrapper").$(byText(value)).click(); // не очень хороший пример с выбором кнопки для определ локали

    }

    public void setNumber(String value) {

        $("#userNumber").setValue(value);

    }

}
