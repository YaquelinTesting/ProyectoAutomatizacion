package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EleccionUI extends Config {
    public WebElement test = driver.findElement(By.xpath("//*[@id=\"hp_book_now_button\"]/span[1]"));

}
