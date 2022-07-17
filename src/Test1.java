import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test1 extends BaseDriver{

    public static void main(String[] args) {

        startDriver();

        driver.get("http://demoqa.com/text-box");
        WebElement fullNameElement = driver.findElement(By.id("userName"));
        fullNameElement.click();
        fullNameElement.sendKeys("Automation");

        WebElement emailElement = driver.findElement(By.id("userEmail"));
        emailElement.click();
        emailElement.sendKeys("testing@gmail.com");

        WebElement currentAddressElement = driver.findElement(By.id("currentAddress"));
        currentAddressElement.click();
        currentAddressElement.sendKeys("Testing Current Address");

        WebElement permanentAddressElement = driver.findElement(By.id("permanentAddress"));
        permanentAddressElement.click();
        permanentAddressElement.sendKeys("Testing Permanent Address");

        WebElement submitButtonElement = driver.findElement(By.id("submit"));
        submitButtonElement.click();

        WebElement fullNameText = driver.findElement(By.id("name"));
        WebElement emailText = driver.findElement(By.id("email"));

        System.out.println(fullNameText.getText().contains("Automation"));
        System.out.println(emailText.getText().contains("testing@gmail.com"));


        waitAndClose();
    }

}
