package Task;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static Util.Config.driver;

public class EleccionTask {
    public void Elecciontest() throws InterruptedException {
   /* EleccionUI seleccionar = new EleccionUI();
    seleccionar.generate_token_boton.click();
    Thread.sleep(10_000);
    */

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform(); //ELEGIMOS ITEM 2
        Thread.sleep(200_000);
    }
}
