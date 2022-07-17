import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test4 extends BaseDriver {

    public static void main(String[] args) {

        startDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateLink = driver.findElement(By.id("calculate"));
        calculateLink.click();

        WebElement firstNumber = driver.findElement(By.id("number1"));
        firstNumber.click();
        firstNumber.sendKeys("12");

        WebElement secondNumber = driver.findElement(By.id("number2"));
        secondNumber.click();
        secondNumber.sendKeys("23");

        WebElement calculateButton = driver.findElement(By.id("calculate"));
        calculateButton.click();

        WebElement answer = driver.findElement(By.id("answer"));
        System.out.println(answer.getText());


        waitAndClose();

    }

}
