import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;

public class PhantomJS {

    public static void main(String[] args) {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/usr/local/bin/phantomjs");

        WebDriver driver = new PhantomJSDriver();
        driver.get("http://google.com");
        System.out.println("Page title = " + driver.getTitle());
        driver.close();
        driver.quit();

    }
}
