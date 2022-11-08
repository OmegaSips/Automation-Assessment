package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AddUserPage {
    //declare fields
    private WebDriver driver;
    private By firstName = By.name("FirstName");
    private By lastName = By.name("LastName");
    private By userName = By.name("UserName");
    private By password = By.name("Password");
    private By customer1 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input");
    private By customer2 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]");
   // Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[2]")));
    private By roleId1 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[2]");
    private By roleId2 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[3]");
    private By roleId3 = By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[4]");
    private By email = By.name("Email");
    private By mobilePhone = By.name("Mobilephone");
    private By saveButton = By.xpath("/html/body/div[3]/div[3]/button[2]");
    private By closeButton = By.xpath("/html/body/div[3]/div[3]/button[1]");

    private By linkToadd = By.cssSelector("body > table > thead > tr:nth-child(2) > td > button");

    //Constructor
    public AddUserPage(WebDriver driver) {
        this.driver = driver;
    }
    public  void linkToadd (){
        driver.findElement(linkToadd).click();
    }

    //Input fields


    public void setFirstName(String inputFirstName) {
        //driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(inputFirstName);

    }

    //Input fields
    public void setLastName(String inputLastName) {
        //driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(inputLastName);

    }

    //Input fields
    public void setUserName(String inputUsername) {
        //driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys(inputUsername);

    }

    //Input fields
    public void setPassword(String inputPassword) {
        //driver.findElement(password).clear();
        driver.findElement(password).sendKeys(inputPassword);

    }

    //Input fields
    public void setCustomer1(String inputCustomer1) {
        //driver.findElement(customer1).clear();
        driver.findElement(customer1).click();
       // driver.findElement(customer1).sendKeys(inputCustomer);


    }

    //Input fields
    public void setRoleId1(String inputRoleId) {
        //driver.findElement(roleId1).clear();
        driver.findElement(roleId1).click();
       // driver.findElement(roleId1).sendKeys(inputRoleId);
        //dropdown.selectByIndex(2);



    }

    //Input fields
    public void setEmail(String inputEmail) {
        //driver.findElement(email).clear();
        driver.findElement(email).sendKeys(inputEmail);

    }

    //Input fields
    public void setMobilePhone(String inputMobilephone) {
        //driver.findElement(mobilePhone).clear();
        driver.findElement(mobilePhone).sendKeys(inputMobilephone);

    }

    //Clicking save button
    public AddUserPage clickSavebutton() {
        driver.findElement(saveButton).click();

        return new AddUserPage(driver);
    }

    //Clicking close button
    public AddUserPage clickClosebutton() {
        driver.findElement(closeButton).click();

       return  new AddUserPage(driver);
    }
}
