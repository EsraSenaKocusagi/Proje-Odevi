import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OpenPageTest extends BeginningTest {
    @Test
    public void correctPage(){
        Assertions.assertEquals(driver.getTitle(), "Beymen.com – Lifestyle Destination");
    }
}
