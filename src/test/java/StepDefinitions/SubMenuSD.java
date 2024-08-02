package StepDefinitions;

import Task.MenuTask;
import Task.SubMenuTask;
import io.cucumber.java.en.Then;

public class SubMenuSD {
    @Then("escogemos submenu {}")
    public void SubMenu(String modulo) throws InterruptedException {
        SubMenuTask test= new SubMenuTask();
        test.SubMenutest(modulo);
    }
}
