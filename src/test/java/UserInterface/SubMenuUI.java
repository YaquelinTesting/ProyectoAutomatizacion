package UserInterface;

import Util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SubMenuUI extends Config {
    public WebElement escogemos_submenu = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]"));

    //public WebElement elegimos_modulo1 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[2]/a/div/p"));
    public WebElement elegimos_modulo1 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/a/div/p"));
    public WebElement elegimos_modulo2 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/a/div/p"));
    public WebElement elegimos_modulo3 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[5]/a/div/p"));
    public WebElement elegimos_modulo4 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[6]/a/div/p"));
    public WebElement elegimos_modulo5 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[7]/a/div/p"));
    public WebElement elegimos_modulo6 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[8]/a/div/p"));
}
