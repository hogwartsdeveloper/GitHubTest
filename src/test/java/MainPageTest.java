import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\jannu\\IdeaProjects\\TestSelenium\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    @Ignore
    public void signIn() {
        LoginPage loginPage = mainPage.clickSignInButton();
        String heading = loginPage.getHeading();
        Assert.assertEquals("Sign in to GitHub", heading);
    }

    @Test
    public void signUpTest() {
        SignUpPage signUpPage = mainPage.register("jannuraidynuly@gmail.com");
        String heading = signUpPage.getHeading();
        Assert.assertEquals("Welcom to GitHub! Let's begin the adventure", heading);
    }
}
