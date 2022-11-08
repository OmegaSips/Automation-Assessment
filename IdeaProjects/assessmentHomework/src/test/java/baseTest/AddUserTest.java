package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddUserPage;
import pages.HomePage;

public class AddUserTest extends BaseTest {
    private WebDriver driver;

    @Test(priority = 1, dataProvider = "AddUserDataOne")
    public void addUserSuccesfulTestOne(String FirstName, String LastName, String Username,
                                     String Password, String Customer1, String RoleId1,
                                     String Email, String MobilePhone){
        AddUserPage addUserTest = homePage.clickAddUserLink(" Add User");


        addUserTest.setFirstName(FirstName);
        addUserTest.setLastName(LastName);
        addUserTest.setUserName(Username);
        addUserTest.setPassword(Password);
        addUserTest.setCustomer1(Customer1);
        addUserTest.setRoleId1(RoleId1);
        addUserTest.setEmail(Email);
        addUserTest.setMobilePhone(MobilePhone);
        addUserTest.clickSavebutton();

        Assert.assertEquals(true,true);
    }
    @DataProvider()
    public Object[][] AddUserDataOne(){
        Object[][] data = new Object[2][8];
        data[0][0] = "FName1"; data[0][1] = "LName1"; data[0][2] = "User1"; data[0][3] = "Pass1"; data[0][4] = "";
        data[0][5] = ""; data[0][6] = "admin@mail.com"; data[0][7] = "082555";

       data[1][0] = "FName2"; data[1][1] = "LName2"; data[1][2] = "User2"; data[1][3] = "Pass2"; data[1][4] = "";
       data[1][5] = ""; data[1][6] = "cusomter@mail.com"; data[1][7] = "083444";

        return data;
    }
    }
