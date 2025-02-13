package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class Journal extends BrowserDriver {
    public static void page_title(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("");
    }
}
