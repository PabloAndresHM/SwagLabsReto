package co.com.choucair.automation.android.questions;

import co.com.choucair.automation.android.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.automation.android.userinterfaces.LastPage.TEXT_TO_COMPROVE;

public class CompareWith implements Question<Boolean> {

    private final DataUser message;

    public CompareWith(DataUser message) {
        this.message = message;
    }

    public static CompareWith the(DataUser message) {
        return new CompareWith(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String answer = Text.of(TEXT_TO_COMPROVE).viewedBy(actor).asString();
        return message.getMessage().equals(answer);
    }
}