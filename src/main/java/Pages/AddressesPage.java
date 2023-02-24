package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage {

    private WebDriver driver;
    public AddressesPage(org.openqa.selenium.WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-link-action='add-address']")
    private WebElement addressCreationBtn;

    @FindBy(className = "alert alert-success")
    private WebElement addressCreationAlert;

    @FindBy(xpath = "//a[@alert-successdata-link-action='delete-address']")
    private WebElement addressDelBtn;


    public void addressCreationPageNav(){
        addressCreationBtn.click();
    }

    public String addressCreationAlert(){
        return addressCreationAlert.getText();
    }
    public void addressDelete(){
        addressDelBtn.click();
    }
}
