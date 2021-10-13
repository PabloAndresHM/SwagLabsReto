package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.interactions.Swipe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.automation.android.userinterfaces.ShoppingPage.*;

public class AddProduct implements Task {

    public static AddProduct toShoppingCar() {
        return Tasks.instrumented(AddProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCT_ONE),
                Click.on(SHOPPING_CAR),
                Swipe.with(Swipe.Direction.valueOf("DOWN")),
                Click.on(CHECKOUT)
        );
    }
}