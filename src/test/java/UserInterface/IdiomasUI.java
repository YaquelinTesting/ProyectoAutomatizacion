package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IdiomasUI extends Config {
    public WebElement seleccionamosidiomas= driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_0\"]/span/span"));

}
