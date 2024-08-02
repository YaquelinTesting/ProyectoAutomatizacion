package Task;

import UserInterface.MenuUI;
import UserInterface.SubMenuUI;
import Util.Config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Objects;

public class SubMenuTask extends Config {
    public void SubMenutest(String modulo) throws InterruptedException {
        SubMenuUI submenu = new SubMenuUI();

        if (Objects.equals(modulo, "M&V Billing")){
        submenu.elegimos_modulo2.click();
        Thread.sleep(30_000);
        }else {
            System.out.println("Se ha enviado un valor diferente: "+modulo);
        }
    }
}

