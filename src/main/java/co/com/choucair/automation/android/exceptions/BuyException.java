package co.com.choucair.automation.android.exceptions;

public class BuyException extends AssertionError {

    private static final String ERROR_BUY = "Error doing the shopping of a product";

    public BuyException() {}

    public static String buyFail() {
        return ERROR_BUY;
    }
}