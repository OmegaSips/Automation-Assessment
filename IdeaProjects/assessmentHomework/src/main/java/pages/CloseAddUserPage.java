package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CloseAddUserPage {
    private WebDriver driver;
    private By closeButton = By.cssSelector("body > div.modal.ng-scope > div.modal-footer > button.btn.btn-danger");

    private By linkToadd = By.cssSelector("body > table > thead > tr:nth-child(2) > td > button");

    //Constructor
    public CloseAddUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickClosebutton() {
        driver.findElement(closeButton).click();


    }
}


