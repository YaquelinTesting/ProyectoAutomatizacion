package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

import static Util.Config.driver;

public class ReservareUI {
    public WebElement precionamos_reservare = driver.findElement(By.xpath("//*[@id=\"b_tt_holder_2\"]"));

}
