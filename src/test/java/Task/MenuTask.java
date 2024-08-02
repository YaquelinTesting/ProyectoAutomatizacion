package Task;

import UserInterface.MenuUI;
import Util.Config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class MenuTask extends Config {
    public void Menutest() throws InterruptedException {
        MenuUI menu = new MenuUI();
        menu.buscamos_menu.click();


    }
}
