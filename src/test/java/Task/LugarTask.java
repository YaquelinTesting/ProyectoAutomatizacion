package Task;

import UserInterface.LugarUI;
import UserInterface.ReservareUI;
import Util.Config;

public class LugarTask extends Config {

    public void Lugar(String lugar) throws InterruptedException {
        LugarUI test = new LugarUI ();
        test.buscamoslugar.click();
        //  Thread.sleep(2_000); -- importar
        Thread.sleep(20_000);
    }
    public void habitacion (String habitacion) throws InterruptedException {
        LugarUI test = new LugarUI();
        test.buscamoshabitacion.click();
        test.buscamoshabitacion.click();
        Thread.sleep(2_000);
    }
    public void fechainicio(String fechainicio) throws InterruptedException {
        LugarUI test = new LugarUI();
        test.buscamosfechainicio.click();
        test.buscamosfechainicio.click();
        Thread.sleep(2_000);
    }
    public void fechafin(String fechafin) throws InterruptedException {
        LugarUI test = new LugarUI();
        test.buscamosfechafin.click();
        test.buscamosfechafin.click();
        Thread.sleep(2_000);
    }
    public void cantadultos(String cantadultos) throws InterruptedException {
        LugarUI test = new LugarUI();
        test.buscamoscantadultos.click();
        test.buscamoscantadultos.click();
        Thread.sleep(2_000);
    }
    public void cantninos(String cantninos) throws InterruptedException {
        LugarUI test = new LugarUI();
        test.buscamoscantninos.click();
        test.buscamoscantninos.click();
        Thread.sleep(2_000);
    }
}
