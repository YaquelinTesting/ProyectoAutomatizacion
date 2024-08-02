package Task;

import UserInterface.IdiomasUI;
import Util.Config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.Objects;

public class ConfigEnvironmentTask extends Config {


    public void Browser(){
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);//edgeOptions
        driver.manage().window().maximize();
    }

    public void tear(){
        driver.quit();
    }

    public void Environment(String ambiente, String estable) {
        String url;
        if ("QA".equals(ambiente)) {
            url = "Yes".equals(estable) ? QA : UAT;
        } else if ("UAT".equals(ambiente)) {
            url = "Yes".equals(estable) ? UAT : PROD;
        } else {
            throw new IllegalArgumentException("Ambiente no reconocido: " + ambiente);
        }
        driver.get(url);
    }
}
