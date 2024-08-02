package Task;

import UserInterface.MenuHamburguesaUI;
import Util.Config;

public class MenuHamburguesaTask extends Config {
    public void MenuHamburguesatest() throws InterruptedException {
        MenuHamburguesaUI menuhamburguesa = new MenuHamburguesaUI();
        menuhamburguesa.test.click();
        Thread.sleep(20_000);
    }

}
