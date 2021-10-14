package co.com.choucair.automation.android.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastPage {
    public static final Target TEXT_TO_COMPROVE=Target.the("title of last step already complete").locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='CHECKOUT: COMPLETE!']")).locatedForIOS(By.id(""));

}
