package StepDefinitions;

import Task.EleccionTask;
import Task.EleccionTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EleccionSD {
    @Then("elegimos {}")
    public void Eleccion() throws InterruptedException {
        EleccionTask test= new EleccionTask();
        test.Elecciontest();
        Thread.sleep(200_000);
    }
}
