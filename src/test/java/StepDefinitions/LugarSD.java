package StepDefinitions;

import Task.LugarTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class LugarSD {
    @And("Buscamos {},{},{},{},{}")
    public void Lugar(String lugar,String habitacion,String fechainicio,String fechafin,String cantadultos,String cantninos) throws InterruptedException, IOException {
        LugarTask test= new LugarTask();
        test.Lugar(lugar);
        Thread.sleep(200_000);
    }
}
