package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.automation.android.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Login implements Task {

    DataUser user;

    public Login(DataUser user) {
        this.user = user;
    }

    public static Login with(DataUser user) {
        return Tasks.instrumented(Login.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getUser()).into(USER_FIELD),
                Enter.theValue(user.getPassword()).into(PASSWORD_FIELD),
                //Click.on(IMG_LOGO),
                WaitUntil.the(BUTTON_LOGIN,isPresent()).forNoMoreThan(15).seconds(),
                Click.on(BUTTON_LOGIN)
        );
    }
}