import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[contains(text(), 'Sign in')]")
    private WebElement signInButton;

    @FindBy(xpath = "//a[contains(text(), 'Sign in')]/../following-sibling::*")
    private WebElement signUpButton;

    @FindBy(xpath = "//button[contains(text(), 'Sign up for GitHub')]")
    private WebElement signUpForGithubButton;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    private WebElement emailField;

    public LoginPage clickSignInButton() {
        signInButton.click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpButton() {
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpForGithubButton() {
        signUpForGithubButton.click();
        return new SignUpPage(driver);
    }

    public MainPage typeEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public SignUpPage register(String email) {
        this.typeEmail(email);
        this.clickSignUpForGithubButton();
        return new SignUpPage(driver);
    }
}
