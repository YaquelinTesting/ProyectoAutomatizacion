package StepDefinitions;

import Task.CredencialesTask;
import Task.IdiomasTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class IdiomasSD {
    @And("seleccionamos {}")
    public void Idiomas (String idioma) throws InterruptedException {
        IdiomasTask test= new IdiomasTask();
        test.idiomastest(idioma);

    }
}
