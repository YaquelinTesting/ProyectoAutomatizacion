package Task;

import UserInterface.WebUI;
import Util.Config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

import static Util.Config.WebBooking;
import static Util.Config.driver;

public class WebTask {

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
    public void Web(String web, String estable) {
        String url;
        if ("booking".equals(web)) {
            url = "Yes".equals(estable) ? WebBooking : WebBooking;
        } else if ("Booking".equals(web)) {
            url = "Yes".equals(estable) ? WebBooking : WebBooking;
        } else {
            throw new IllegalArgumentException("web booking: " + web);
        }
        driver.get(url);
    }
}