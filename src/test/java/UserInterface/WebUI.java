package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebUI extends Config {
    public WebElement seleccionamosweb= driver.findElement(By.xpath("//*[@id=\"ss\"]"));
    public WebElement fechainicio = driver.findElement(By.id("fechainicio"));
    public WebElement fechafin = driver.findElement(By.id("fechafin"));
}
