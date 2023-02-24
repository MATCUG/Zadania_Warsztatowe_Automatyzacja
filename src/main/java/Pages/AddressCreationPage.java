package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressCreationPage {

    private WebDriver driver;

    public AddressCreationPage(org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "field-address1")
    private WebElement addressInput;

    @FindBy(id = "field-postcode")
    private WebElement zipCodeInput;

    @FindBy(id = "field-city")
    private WebElement cityInput;

    @FindBy(id = "field-id_country")
    private WebElement countrySelect;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement addressSubmitBtn;

    public void addAddress(String address, String city, String zipCode, String country) {
        addressInput.sendKeys(address);
        zipCodeInput.sendKeys(zipCode);
        cityInput.sendKeys(city);
        countrySelect.click();
        Select countryName = new Select(countrySelect);
        countryName.selectByVisibleText(country);
        addressSubmitBtn.click();
    }
}
