package co.com.choucair.automation.android.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingPage {

    public static final Target PRODUCT_ONE=Target.the("Add product to car product one").locatedForAndroid(MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")).locatedForIOS(By.id(""));
    public static final Target SHOPPING_CAR=Target.the("button to go to list of products in car").locatedForAndroid(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")).locatedForIOS(By.id(""));
    public static final Target CHECKOUT=Target.the("go to order").locatedForAndroid(MobileBy.AccessibilityId("test-CHECKOUT")).locatedForIOS(By.id(""));
}
