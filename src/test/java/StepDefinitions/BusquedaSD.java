package StepDefinitions;

import Task.BusquedaTask;
import io.cucumber.java.en.Then;

public class BusquedaSD {
    @Then("Seleccionamos Buscar")
    public void Busqueda() throws InterruptedException {
        BusquedaTask test= new BusquedaTask();
        test.Busquedatest();
        Thread.sleep(200_000);
    }
}

