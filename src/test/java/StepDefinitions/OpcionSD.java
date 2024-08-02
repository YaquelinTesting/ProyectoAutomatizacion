package StepDefinitions;

import Task.OpcionTask;
import Task.SubMenuTask;
import io.cucumber.java.en.Then;

public class OpcionSD {
    @Then("elegimos opcion {}")
    public void opcion(String opcion) throws InterruptedException {
        OpcionTask test= new OpcionTask();
        test.Opciontest(opcion);
    }
}
