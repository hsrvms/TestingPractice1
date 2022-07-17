import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test3 extends BaseDriver {

    public static void main(String[] args) {

        startDriver();

       // driver.get("https://www.snapdeal.com/");
        driver.navigate().to("https://www.snapdeal.com/");

        WebElement popUpDeny = driver.findElement(By.id("pushDenied"));
        popUpDeny.click();

        WebElement searchBox = driver.findElement(By.id("inputValEnter"));
        searchBox.click();
        searchBox.sendKeys("teddy bear");

        WebElement searchButton = driver.findElement(By.className("searchformButton"));
        searchButton.click();

      // WebElement searchResult = driver.findElement(By.xpath("//body/div[@id='content_wrapper']/div[7]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]"));
      // System.out.println(searchResult.getText());

        waitAndClose();
    }

}
