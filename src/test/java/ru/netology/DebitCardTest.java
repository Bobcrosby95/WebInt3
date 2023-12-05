package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


class DebitCardTest {
    @Test
    void debitCardTest1() {
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Дмитрий");
        $("[data-test-id=phone] input").setValue("+79123335587");
        $("[data-test-id=agreement]").click();
        $("button.button").click();
        $("[data-test-id=order-success]").shouldHave(Condition.exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }

    @Test
    void debitCardTest2() {
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Дмитрий Будин");
        $("[data-test-id=phone] input").setValue("+79123335587");
        $("[data-test-id=agreement]").click();
        $("button.button").click();
        $("[data-test-id=order-success]").shouldHave(Condition.exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}