package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpcionUI extends Config {
    public WebElement elegimos_opcion3 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/ul/li[3]/a/div"));


}
