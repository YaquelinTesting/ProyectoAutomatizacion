package Task;

import UserInterface.ReservaUI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

import static Util.Config.driver;

public class ReservaTask {
    public void reservatest (String reserva) throws InterruptedException {
        ReservaUI user = new ReservaUI ();
        user.Reserva.click();

    }
}