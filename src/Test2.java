import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends BaseDriver {

    public static void main(String[] args) {

        startDriver();

        driver.navigate().to("https://demo.applitools.com/");
        //driver.get("https://demo.applitools.com/");

        WebElement userNameElement = driver.findElement(By.id("username"));
        userNameElement.click();
        userNameElement.sendKeys("ttechno@gmail.com");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.click();
        passwordElement.sendKeys("techno123.");

        WebElement signInButton = driver.findElement(By.id("log-in"));
        signInButton.click();

       System.out.println(driver.findElement(By.id("time")).getText().contains("Your nearest branch closes in: 30m 5s"));


        waitAndClose();


    }

}
