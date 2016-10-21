import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
//comment
public class ScreenShotsTests {
    @Test
    public void ScreenShotsTests() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://USER:PASS@pfizerproitdev5.prod.acquia-sites.com/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_emailAddress")).sendKeys("common_user");
        driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_password")).sendKeys("PASS");
        driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_signInButton")).click();
        ScreenShot((TakesScreenshot) driver);
        driver.close();
    }


    public void ScreenShot(TakesScreenshot driver) {
        File scrFile = driver.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("/Users/lvlmd/SeleniumTestTrainign/MavenWithTestNGAndSelenium/shots/"+"scr_"+ Calendar.getInstance().getTime() +".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
