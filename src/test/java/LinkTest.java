import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LinkTest extends BeginningTest {
    @Test
    public void FindMyAccount(){ driver.findElement(By.linkText("Hesabım")); }
    @Test
    public void FindMyFavorites(){
        driver.findElement(By.linkText("Favorilerim"));
    }
    @Test
    public void FindMyBasket(){
        driver.findElement(By.linkText("Sepetim"));
    }
}
