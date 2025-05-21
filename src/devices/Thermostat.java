package devices;

public class Thermostat extends SmartDevice implements Switchable{
    private boolean isOn = false;

    public Thermostat(String name){
        super(name);
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " thermostat turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " thermostat turned OFF.");
    }

    @Override
    public void showStatus() {
        System.out.println(name + " thermostat is " + (isOn ? "ON" : "OFF"));
    }


}
