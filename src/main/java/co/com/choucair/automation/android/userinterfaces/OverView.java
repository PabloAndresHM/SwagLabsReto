package co.com.choucair.automation.android.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OverView {
    public static final Target FINISH_BUTTON=Target.the("click on finish").locatedForAndroid(MobileBy.AccessibilityId("test-FINISH")).locatedForIOS(By.id(""));

}
