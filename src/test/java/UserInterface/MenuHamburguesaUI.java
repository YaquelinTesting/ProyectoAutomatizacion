package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuHamburguesaUI extends Config {

    public WebElement test = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/button/i"));

}

