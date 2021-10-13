package co.com.choucair.automation.android.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitAMoment implements Interaction {

    private int timeToWait;

    public WaitAMoment(int timeToWait) {
        super();
        this.timeToWait = timeToWait;
    }

    public static WaitAMoment unMomento(int timeToWait) {
        return Tasks.instrumented(WaitAMoment.class, timeToWait);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(timeToWait);
    }

}