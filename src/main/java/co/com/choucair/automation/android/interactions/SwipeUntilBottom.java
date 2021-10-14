package co.com.choucair.automation.android.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class SwipeUntilBottom implements Interaction {

    public static SwipeUntilBottom successful() {
        return Tasks.instrumented(SwipeUntilBottom.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i <3;i++) {
            actor.attemptsTo(Swipe.with(Swipe.Direction.valueOf("DOWN")));
        }
    }
}
