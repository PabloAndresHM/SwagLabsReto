package co.com.choucair.automation.android.interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import net.serenitybdd.screenplay.Actor;

public class AppiumObject extends ProxiedDriver<AppiumDriver<MobileElement>> {

    @SuppressWarnings("rawtypes")
    public TouchAction withAction(Actor actor) {
        return new TouchAction(getDriver(actor));
    }

    public void back(Actor actor) {
        getDriver(actor).navigate().back();
    }
}