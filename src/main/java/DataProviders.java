import org.testng.annotations.DataProvider;

/**
 * Created by Mikhail_Churakov on 5/9/2017.
 */
public class DataProviders {

    @DataProvider
    public Object[][] correctData() {
        return new Object[][]{
                {"epam", "1234", "Piter Chailovskii"},
        };
    }

    @DataProvider
    public Object[][] incorrectData() {
        return new Object[][]{
                {"Epam", "1234"},
                {"EPAM", "1234"},
                {"epam", "!@#$"},
        };
    }
}
