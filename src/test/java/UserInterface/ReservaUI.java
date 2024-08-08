package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReservaUI extends Config {
    public WebElement Reserva = driver.findElement(By.xpath("//*[@id=\"hp_book_now_button\"]/span[1]"));

}
