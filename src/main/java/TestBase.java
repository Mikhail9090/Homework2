import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;


/**
 * Created by Mikhail_Churakov on 5/9/2017.
 */
public abstract class TestBase {
    public static String geckoDrivPath = "C:\\GeckoDriver\\geckodriver.exe";
    public static WebDriver driver;
    public static String testHost = "https://jdi-framework.github.io/tests/";

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.gecko.driver", geckoDrivPath);
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void afterSuite() {
        driver.close();
    }
}
