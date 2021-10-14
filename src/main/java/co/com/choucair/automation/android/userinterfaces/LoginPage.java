package co.com.choucair.automation.android.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USER_FIELD = Target.the("place to introduce username").locatedForAndroid(MobileBy.AccessibilityId("test-Username")).locatedForIOS(By.id(""));
    public static final Target PASSWORD_FIELD = Target.the("place to introduce password").locatedForAndroid(MobileBy.AccessibilityId("test-Password")).locatedForIOS(By.id(""));
    public static final Target BUTTON_LOGIN = Target.the("button to login").locatedForAndroid(MobileBy.AccessibilityId("test-LOGIN")).locatedForIOS(By.id(""));
}
