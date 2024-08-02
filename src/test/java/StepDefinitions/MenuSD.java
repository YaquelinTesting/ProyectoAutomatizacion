package StepDefinitions;

import Task.LogeoTask;
import Task.MenuTask;
import io.cucumber.java.en.Then;

public class MenuSD {

    @Then("buscamos menu")
    public void Menu() throws InterruptedException {
        MenuTask test= new MenuTask();
        test.Menutest();
    }
}
