package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuUI extends Config {
    public WebElement buscamos_menu = driver.findElement(By.xpath("//*[@id=\"btn-menu\"]"));


}
