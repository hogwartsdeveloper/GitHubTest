import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//h1[@class='sr-only']");
    private By emailField = By.xpath("//input[@id='email']");

    public String getHeading() {
        return driver.findElement(heading).getText();
    }
}
