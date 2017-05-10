import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Created by Mikhail_Churakov on 5/9/2017.
 */
public class LoginTests extends TestBase {

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(testHost);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-user']")));
        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
    }

    @AfterMethod
    public void afterMethod() {
        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
    }

    @Test(dataProvider = "correctData", dataProviderClass = DataProviders.class)
    public void posLogin(String loginName, String password, String userName) {
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.id("Login")).sendKeys(loginName);
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.xpath("//i[@class='fa fa-sign-in']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Piter Chailovskii')]"));
        driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
    }

    @Test(dataProvider = "incorrectDataCsv", dataProviderClass = DataProviders.class)
    public void negLogin(String loginName, String password) {
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.id("Login")).sendKeys(loginName);
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.xpath("//i[@class='fa fa-sign-in']")).click();
        driver.findElement(By.xpath("//span[@class='login-txt']"));
        driver.findElement(By.id("Login")).clear();
        driver.findElement(By.id("Password")).clear();
    }
}
