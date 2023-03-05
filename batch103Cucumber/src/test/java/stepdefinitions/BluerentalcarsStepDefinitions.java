package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalCarsPage;
import utilities.Driver;

public class BluerentalcarsStepDefinitions {

   BlueRentalCarsPage blueRentalCarsPage=new BlueRentalCarsPage();

    @Given("kullanici {string} ya gider")
    public void kullanici_ya_gider(String string) {
        Driver.getDriver().get(string);

    }
    @When("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.waitAndClick(blueRentalCarsPage.login,2);

    }
    @When("kullanıcı adini {string} girer")
    public void kullanıcı_adini_girer(String string) {
        Driver.waitAndSendText(blueRentalCarsPage.email,string,1);

    }
    @When("kullanici sifreyi {string} girer")
    public void kullanici_sifreyi_girer(String string) {

        Driver.waitAndSendText(blueRentalCarsPage.password,string,5);
    }

    @When("kullanici login buttoning basar")
    public void kullanici_login_buttoning_basar() {
        Driver.waitAndClick(blueRentalCarsPage.submitButton,5);
    }
    @Then("kullanici login islemi gerçekleşir")
    public void kullanici_login_islemi_gerçekleşir() {
        Assert.assertTrue(blueRentalCarsPage.login_test.isDisplayed());
        Driver.closeDriver();
    }










    /*USER STORY : US167854_manager_login_test
    NAME:kullanici tum manager login bilgileriyle giriş yapabilmeli
    AC:
    Given kullanici ana sayfada
    When kullanici login sayfasina gider
    And kullanıcı adini girer
    And sifreyi girer
    And login buttoning basar
    Then login islemi gerçekleşir
    ARTIFACT:
    url : https://www.bluerentalcars.com/
    Credentials:
    {"sam.walker@bluerentalcars.com","c!fas_art"},
    {"kate.brown@bluerentalcars.com","tad1$Fas"},
    {"raj.khan@bluerentalcars.com","v7Hg_va^"},
    {“pam.raymond@bluerentalcars.com”,"Nga^g6!"}
    NOT: scenario outline kullanalim
    */



}
