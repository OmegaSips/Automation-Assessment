package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddUserPage;
import pages.CloseAddUserPage;
import pages.HomePage;

public class CloseAddUserPageTest extends BaseTest {
    private WebDriver driver;

    @Test(priority = 1)
    public void closebutton() {
        AddUserPage addUserTest = homePage.clickAddUserLink(" Add User");
        addUserTest.clickClosebutton();


    }
}