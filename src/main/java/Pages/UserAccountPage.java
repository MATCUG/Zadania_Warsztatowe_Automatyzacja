package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountPage2 {

    private WebDriver driver;

    public UserAccountPage2(org.openqa.selenium.WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addresses-link")
    private WebElement addressesBtn;

    public void addressesPageNav2(){
        addressesBtn.click();
    }
}
