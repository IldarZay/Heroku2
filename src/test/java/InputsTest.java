import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {

    @Test
    public void testInputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputField = driver.findElement(By.tagName("input"));

        inputField.sendKeys("123");
        inputField.sendKeys(Keys.ARROW_UP);
        inputField.sendKeys(Keys.ARROW_DOWN);

        inputField.clear();
        inputField.sendKeys("abc");
        inputField.sendKeys(Keys.ARROW_UP);
        inputField.sendKeys(Keys.ARROW_DOWN);
    }
}