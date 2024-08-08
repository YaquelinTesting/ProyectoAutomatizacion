package StepDefinitions;
import Task.ReservaTask;
import Task.ReservaTask;
import Task.ReservaTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ReservaSD {
    @Then("reservamos {}")
    public void Reserva (String reserva) throws InterruptedException {
        ReservaTask test= new ReservaTask();
        test.reservatest(reserva);
        Thread.sleep(200_000);

    }
}
