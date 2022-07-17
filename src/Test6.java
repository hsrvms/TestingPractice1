import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test6 extends BaseDriver {

    public static void main(String[] args) {

        startDriver();

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlertsLink = driver.findElement(By.id("fakealerttest"));
        fakeAlertsLink.click();

        WebElement showModalDialogButton = driver.findElement(By.id("modaldialog"));
        showModalDialogButton.click();

        WebElement okButton = driver.findElement(By.id("dialog-ok"));
        okButton.click();

        waitAndClose();


    }

}
