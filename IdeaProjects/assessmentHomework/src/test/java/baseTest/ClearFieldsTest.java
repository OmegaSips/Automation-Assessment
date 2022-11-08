package baseTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddUserPage;
import pages.ClearfieldsPage;
import pages.HomePage;

    public class ClearFieldsTest extends BaseTest {
        private WebDriver driver;

        @Test(priority = 1, dataProvider = "ClearFields")
        public void clearFields(String FirstName, String LastName, String Username,
                                            String Password, String Customer1, String RoleId1,
                                            String Email, String MobilePhone){
            ClearfieldsPage clearfields = homePage.clickclearuserLink(" Add User");


            clearfields.setFirstName(FirstName);
            clearfields.setLastName(LastName);
            clearfields.setUserName(Username);
            clearfields.setPassword(Password);
            //clearfields.setCustomer1(Customer1);
            //clearfields.setRoleId1(RoleId1);
            clearfields.setEmail(Email);
            clearfields.setMobilePhone(MobilePhone);
            //addUserTest.clickSavebutton();

        }
        @DataProvider()
        public Object[][] ClearFields(){
            Object[][] data = new Object[1][8];
            data[0][0] = "FName1"; data[0][1] = "LName1"; data[0][2] = "User1"; data[0][3] = "Pass1"; data[0][4] = "";
            data[0][5] = ""; data[0][6] = "admin@mail.com"; data[0][7] = "082555";


            return data;

        }


}
