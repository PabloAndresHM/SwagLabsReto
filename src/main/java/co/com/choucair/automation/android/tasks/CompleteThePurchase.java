package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.interactions.FillForm;
import co.com.choucair.automation.android.interactions.SwipeUntilBottom;
import co.com.choucair.automation.android.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.automation.android.userinterfaces.OverView.FINISH_BUTTON;

public class CompleteThePurchase implements Task {

    DataUser user;

    public CompleteThePurchase(DataUser user) {
        this.user = user;
    }

    public static CompleteThePurchase followingTheSteps(DataUser user) {
        return Tasks.instrumented(CompleteThePurchase.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                FillForm.successful(user),
                SwipeUntilBottom.successful(),
                Click.on(FINISH_BUTTON)
        );
    }
}