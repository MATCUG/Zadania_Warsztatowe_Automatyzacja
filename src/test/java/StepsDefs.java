import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import java.time.Duration;

public class StepsDefs {

    private WebDriver driver;

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl");
        pages.MainPage mainPage = new pages.MainPage(driver);
        mainPage.loginPageNav();
        pages.LoginPage loginPage = new pages.LoginPage(driver);
        loginPage.userSignIn("qazkl@bb.com", "zank5b");
    }

    @After
    public void clanUp() {
        driver.quit();
    }

    @When("User add address using proper credentials: address {}, city {}, zipCode {}, country {}")
    public void userAddAddress(String address, String city, String zipCode, String country) {
        pages.UserAccountPage userAccountPage = new pages.UserAccountPage(driver);
        userAccountPage.addressesPageNav();
        pages.AddressesPage addressesPage = new pages.AddressesPage(driver);
        addressesPage.addressCreationPageNav();
        pages.AddressCreationPage addressCreationPage = new pages.AddressCreationPage(driver);
        addressCreationPage.addAddress(address, city, zipCode, country);
        Assert.assertEquals("Address successfully added!", addressesPage.addressCreationAlert());

    }

    @When("User deletes account")
    public void user_deletes_account() {
        pages.AddressesPage addressesPage = new pages.AddressesPage(driver);
        addressesPage.addressDelete();
        throw new io.cucumber.java.PendingException();
    }

    @Then("Alert {} shows up")
    public void addressDelAlert(String alert) {
        pages.AddressesPage addressesPage = new pages.AddressesPage(driver);
        Assert.assertEquals(alert, addressesPage.addressCreationAlert());
        throw new io.cucumber.java.PendingException();
    }


}
