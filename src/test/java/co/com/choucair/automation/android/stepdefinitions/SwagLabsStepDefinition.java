package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.exceptions.BuyException;
import co.com.choucair.automation.android.models.DataUser;
import co.com.choucair.automation.android.questions.CompareWith;
import co.com.choucair.automation.android.tasks.AddProduct;
import co.com.choucair.automation.android.tasks.CompleteThePurchase;
import co.com.choucair.automation.android.tasks.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SwagLabsStepDefinition {

    @Given("^that (.*) login to application to buy a product$")
    public void thatUserLoginToAplicationToBuyAProduct(String actor,List<DataUser> listDataUser) {
        theActorCalled(actor).wasAbleTo(Login.with(listDataUser.get(0)));
    }

    @When("^he add the product, he go to the shopping car to finish his buy$")
    public void heAddTheProductHeGoToTheShoppingCarToFinishHisBuy(List<DataUser> listDataUser) {
        theActorInTheSpotlight().attemptsTo(
                AddProduct.toShoppingCar(),
                CompleteThePurchase.followingTheSteps(listDataUser.get(0))
        );
    }

    @Then("^you should see the message that indicate that the shop is successful$")
    public void youShouldSeeTheMessageThatIndicateThatTheShopIsSuccesful(List<DataUser> message) {
        theActorInTheSpotlight().should(seeThat(CompareWith.the(message.get(0)))
                .orComplainWith(BuyException.class,BuyException.buyFail()));
    }
}