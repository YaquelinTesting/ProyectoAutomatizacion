package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.Config.driver;

public class LugarUI extends Config {
    public WebElement buscamoslugar = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
    public WebElement buscamoshabitacion = driver.findElement(By.id(""));
    public WebElement buscamosfechainicio = driver.findElement(By.id("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[4]/span/span"));
    public WebElement buscamosfechafin = driver.findElement(By.id("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[4]/span/span"));
    public WebElement buscamoscantadultos = driver.findElement(By.id("//*[@id=\"xp__guests__toggle\"]/span[2]/span[1]"));
    public WebElement buscamoscantninos = driver.findElement(By.id("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[2]/div/div[2]/span[1]"));

}
