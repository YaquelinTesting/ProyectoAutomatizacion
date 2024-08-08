package StepDefinitions;

import Task.WebTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Web {
    @Before
    public void setup() {
        WebTask  test = new WebTask();
        test.Browser();
    }
    @After
    public void tearDown(){
        WebTask test =new WebTask();
        test.tear();
    }

    @Given("Ingresamos la url de Booking {}")
    public void Web_booking(String web, String lugar){
        WebTask test = new WebTask();
        test.Web(web, lugar);
    }
}
