import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test5 extends BaseDriver {

    public static void main(String[] args) {

        startDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlertsLink = driver.findElement(By.id("fakealerttest"));
        fakeAlertsLink.click();

        WebElement showAlertBoxButton = driver.findElement(By.id("fakealert"));
        showAlertBoxButton.click();

        WebElement okButton = driver.findElement(By.id("dialog-ok"));
        okButton.click();

        waitAndClose();

    }

}
