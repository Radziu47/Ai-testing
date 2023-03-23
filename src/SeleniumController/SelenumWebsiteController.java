package SeleniumController;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenumWebsiteController {

    public static void SendTextToWebsite(String TEXT){
        System.out.println(TEXT);
    }

    public static void OpenBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
    }
}
