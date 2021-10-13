package co.com.choucair.automation.android.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingPage {

    public static final Target PRODUCT_ONE=Target.the("Add product to car product one").locatedForAndroid(MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")).locatedForIOS(By.id(""));
    public static final Target SHOPPING_CAR=Target.the("button to go to list of products in car").locatedForAndroid(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")).locatedForIOS(By.id(""));
    public static final Target CHECKOUT=Target.the("go to order").locatedForAndroid(MobileBy.AccessibilityId("test-CHECKOUT")).locatedForIOS(By.id(""));
    public static final Target NAME_FIELD=Target.the("FILL WITH NAME").locatedForAndroid(MobileBy.AccessibilityId("test-First Name")).locatedForIOS(By.id(""));
    public static final Target SURNAME_FIELD=Target.the("fill with surname").locatedForAndroid(MobileBy.AccessibilityId("test-Last Name")).locatedForIOS(By.id(""));
    public static final Target ZIP_FIELD=Target.the("fill with ZIP").locatedForAndroid(MobileBy.AccessibilityId("test-Zip/Postal Code")).locatedForIOS(By.id(""));
    public static final Target CONTINUE_BUTTON=Target.the("click on continue").locatedForAndroid(MobileBy.AccessibilityId("test-CONTINUE")).locatedForIOS(By.id(""));
    public static final Target FINISH_BUTTON=Target.the("click on finish").locatedForAndroid(MobileBy.AccessibilityId("test-FINISH")).locatedForIOS(By.id(""));
    public static final Target TEXT_TO_COMPROVE=Target.the("title of last step already complete").locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='CHECKOUT: COMPLETE!']")).locatedForIOS(By.id(""));
}
