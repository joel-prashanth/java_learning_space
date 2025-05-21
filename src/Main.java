import controller.HomeController;
import devices.*;
import automation.Scheduler;
import factory.DeviceFactory;
import utils.Logger;

public class Main {
    public static void main(String[] args){
        Light light = new Light("Living Room");
        Thermostat thermostat = new Thermostat("Bedroom");
        SmartDevice d1 = DeviceFactory.create("light", "Kitchen Light");


        HomeController controller = new HomeController();

        controller.addDevice(light);
        controller.addDevice(thermostat);


        light.turnOn();
        thermostat.turnOn();

        controller.showAllStatuses();

        Scheduler scheduler = new Scheduler();

        scheduler.schedule(() -> {
            light.turnOff();
            Logger.log("Light turned off automatically");
        }, 5);
    }
}