import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class KBAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Patrik\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.kb.cz/cs/obcane");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Kliknutí na tlačítko "Přihlásit"
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Přihlásit')]")));
            System.out.println("Klikám na tlačítko 'Přihlásit'");
            loginButton.click();

            // Kliknutí na "Internetové bankovnictví"
            WebElement internetBankingButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Internetové bankovnictví')]")));
            System.out.println("Klikám na 'Internetové bankovnictví'");
            internetBankingButton.click();

            // Kliknutí na "Nepamatuji si uživatelské jméno"
            WebElement forgotUsernameLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Nepamatuji si uživatelské jméno')]")));
            System.out.println("Klikám na 'Nepamatuji si uživatelské jméno'");
            forgotUsernameLink.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
