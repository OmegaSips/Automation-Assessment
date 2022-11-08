package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By addUserLink = By.cssSelector("body > table > thead > tr:nth-child(2) > td > button");

    public HomePage(WebDriver driver){ this.driver = driver; }

    public AddUserPage clickAddUserLink(String linkText){
        clickLinkText(linkText);
        return new AddUserPage(driver);
    }
    public void clickLinkText(String linkText){driver.findElement(By.cssSelector("body > table > thead > tr:nth-child(2) > td > button")).click();
    }

    public ClearfieldsPage clickclearuserLink(String linkText){
        clickLinkText(linkText);
        return  new ClearfieldsPage(driver);
    }
    public CloseAddUserPage clickCloseButton(String linkText){
        clickClosebuttonLink(linkText);
        return new CloseAddUserPage(driver);
    }
    public void clickClosebuttonLink(String linkText) {
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[1]")).click();
    }

}
