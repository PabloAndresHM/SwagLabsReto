package co.com.choucair.automation.android.interactions;

import co.com.choucair.automation.android.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.automation.android.userinterfaces.ShoppingPage.*;
import static co.com.choucair.automation.android.userinterfaces.ShoppingPage.CONTINUE_BUTTON;

public class FillForm implements Interaction {

    DataUser user;

    public FillForm(DataUser user) {
        this.user = user;
    }

    public static FillForm successful(DataUser user) {
        return Tasks.instrumented(FillForm.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getName()).into(NAME_FIELD),
                Enter.theValue(user.getSurname()).into(SURNAME_FIELD),
                Enter.theValue(user.getZip()).into(ZIP_FIELD),
                Click.on(CONTINUE_BUTTON)
        );
    }
}
