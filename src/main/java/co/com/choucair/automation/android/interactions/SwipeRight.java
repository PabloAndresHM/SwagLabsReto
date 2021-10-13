package co.com.choucair.automation.android.interactions;

import java.time.Duration;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Dimension;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class SwipeRight extends AppiumObject implements Interaction {

    @Override
    @Step("{0} swipes down screen")
    public <T extends Actor> void performAs(T actor) {

        Dimension size = getScreenSize(actor);

        int startY = (int) (size.getHeight() / 2.0);
        int startX = (int) (size.getWidth() * 0.05);
        int endX = (int) (size.getWidth() * 0.90);

        withAction(actor)
                .longPress(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endX, startY))
                .release().perform();
    }

    protected Dimension getScreenSize(Actor actor) {
        return BrowseTheWeb.as(actor).getDriver().manage().window().getSize();
    }

}