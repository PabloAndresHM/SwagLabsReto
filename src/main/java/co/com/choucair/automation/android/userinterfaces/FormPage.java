package co.com.choucair.automation.android.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static final Target NAME_FIELD=Target.the("FILL WITH NAME").locatedForAndroid(MobileBy.AccessibilityId("test-First Name")).locatedForIOS(By.id(""));
    public static final Target SURNAME_FIELD=Target.the("fill with surname").locatedForAndroid(MobileBy.AccessibilityId("test-Last Name")).locatedForIOS(By.id(""));
    public static final Target ZIP_FIELD=Target.the("fill with ZIP").locatedForAndroid(MobileBy.AccessibilityId("test-Zip/Postal Code")).locatedForIOS(By.id(""));
    public static final Target CONTINUE_BUTTON=Target.the("click on continue").locatedForAndroid(MobileBy.AccessibilityId("test-CONTINUE")).locatedForIOS(By.id(""));

}
