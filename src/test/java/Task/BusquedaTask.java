package Task;

import UserInterface.BusquedaUI;

public class BusquedaTask {
    public void Busquedatest() throws InterruptedException {
        BusquedaUI busqueda = new BusquedaUI();
        busqueda.buscamos_busqueda.click();
        Thread.sleep(200_000);
    }

}
