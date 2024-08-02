package StepDefinitions;

import Task.MenuHamburguesaTask;
import Task.MenuTask;
import io.cucumber.java.en.Then;


public class MenuHamburguesaSD {
    @Then("precionamos menuhamburguesa")
    public void MenuHamburguesa() throws InterruptedException {
        MenuHamburguesaTask test= new MenuHamburguesaTask();
        test.MenuHamburguesatest();
    }
}
