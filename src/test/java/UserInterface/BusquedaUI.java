package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BusquedaUI extends Config {
    public WebElement buscamos_busqueda = driver.findElement(By.xpath("//*[@id=\"b2hotelPage\"]/div[3]/div/div/div/div/form/div[1]/div[4]/button"));

}
