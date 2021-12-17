import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeginningTest {

    protected WebDriver driver;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.beymen.com");
        driver.manage().window().maximize();
    }
    @AfterAll
    public void Done(){
        driver.quit();
    }
}
