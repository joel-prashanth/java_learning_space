package controller;
import devices.SmartDevice;
import java.util.ArrayList;
import java.util.List;

public class HomeController {
    private final List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device){
        devices.add(device);
    }

    public void showAllStatuses(){
        for(SmartDevice d: devices){
            d.showStatus();
        }
    }
}
