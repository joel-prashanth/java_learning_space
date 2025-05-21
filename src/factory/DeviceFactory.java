package factory;

import devices.Light;
import devices.SmartDevice;
import devices.Thermostat;

public class DeviceFactory {
    public static SmartDevice create(String type, String name){
        return switch (type.toLowerCase()){
            case "light" -> new Light(name);
            case "thermostat" -> new Thermostat(name);
            default -> throw new IllegalArgumentException("Unknown device type: " + type);
        };
    }
}
