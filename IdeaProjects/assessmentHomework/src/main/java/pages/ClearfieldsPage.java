package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClearfieldsPage {

    //declare fields
    private WebDriver driver;
    private By firstName = By.name("FirstName");
    private By lastName = By.name("LastName");
    private By userName = By.name("UserName");
    private By password = By.name("Password");
    private By customer1 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]");
    private By customer2 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]");
    // Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[2]")));
    private By roleId1 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[2]");
    private By roleId2 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[3]");
    private By roleId3 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[4]");
    private By email = By.name("Email");
    private By mobilePhone = By.name("Mobilephone");
    //private By saveButton = By.xpath("/html/body/div[3]/div[3]/button[2]");
    private By closeButton = By.xpath("/html/body/div[3]/div[3]/button[1]");

    private By linkToadd = By.cssSelector("body > table > thead > tr:nth-child(2) > td > button");

    //Constructor
    public ClearfieldsPage(WebDriver driver) {
        this.driver = driver;
    }
    public  void linkToadd (){
        driver.findElement(linkToadd).click();
    }

    //Input fields


    public void setFirstName(String inputFirstName) {

        driver.findElement(firstName).sendKeys(inputFirstName);
        driver.findElement(firstName).clear();

    }

    //Input fields
    public void setLastName(String inputLastName) {

        driver.findElement(lastName).sendKeys(inputLastName);
        driver.findElement(lastName).clear();

    }

    //Input fields
    public void setUserName(String inputUsername) {

        driver.findElement(userName).sendKeys(inputUsername);
        driver.findElement(userName).clear();

    }

    //Input fields
    public void setPassword(String inputPassword) {

        driver.findElement(password).sendKeys(inputPassword);
        driver.findElement(password).clear();

    }

    //Input fields
    public void setCustomer1(String inputCustomer) {
        driver.findElement(customer1).click();
        // driver.findElement(customer1).sendKeys(inputCustomer);
        driver.findElement(customer1).clear();

    }

    //Input fields
    public void setRoleId1(String inputRoleId) {
        driver.findElement(roleId1).click();

        driver.findElement(roleId1).clear();


    }

    //Input fields
    public void setEmail(String inputEmail) {

        driver.findElement(email).sendKeys(inputEmail);
        driver.findElement(email).clear();

    }

    //Input fields
    public void setMobilePhone(String inputMobilephone) {

        driver.findElement(mobilePhone).sendKeys(inputMobilephone);
        driver.findElement(mobilePhone).clear();

    }

    }


