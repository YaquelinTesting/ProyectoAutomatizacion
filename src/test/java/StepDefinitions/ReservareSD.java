package StepDefinitions;

import Task.ReservareTask;
import io.cucumber.java.en.Then;

public class ReservareSD {
    @Then("precionamos reservare")
    public void Reservare() throws InterruptedException {
        ReservareTask test= new ReservareTask();
        test.Reservaretest();
        Thread.sleep(200_000);
    }
}
