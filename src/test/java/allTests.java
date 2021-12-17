import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class allTests extends BeginningTest{

    @Test
    public void SearchPant() throws InterruptedException {
        WebElement nameSpace = driver.findElement(By.cssSelector("input.o-header__search--input"));
        nameSpace.sendKeys("Pantolon");
        nameSpace.sendKeys(Keys.ENTER);
        Thread.sleep(500);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,8000)", "");
        driver.findElement(By.id("moreContentButton")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()=' Bej Jogger Eşofman']")).click();
        Thread.sleep(500);
        String PagePrice = driver.findElement(By.className("m-price__new")).getText();
        Thread.sleep(300);
        driver.findElement(By.xpath("//span[text()='M']")).click();
        driver.findElement(By.id("addBasket")).click();
        driver.findElement(By.linkText("Sepetim")).click();
        Thread.sleep(500);
        String BasketPrice = driver.findElement(By.className("m-productPrice__salePrice")).getText();
        Assertions.assertEquals(PagePrice,BasketPrice);
        Thread.sleep(700);
        WebElement selectElement = driver.findElement(By.id("quantitySelect0"));
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("2");
        String checkSelectedElement=selectObject.getFirstSelectedOption().getText();
        String text="2 adet";
        Assertions.assertEquals(checkSelectedElement,text);
        Thread.sleep(1000);
        driver.findElement(By.id("removeCartItemBtn0")).click();
        Thread.sleep(1200);
    }
}