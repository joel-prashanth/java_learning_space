package devices;

public class Light extends SmartDevice implements Switchable{
    private boolean isOn = false;

    public Light(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + "light turned ON.");
    }

    @Override
    public void turnOff(){
        isOn = false;
        System.out.println(name + "light turned OFF.");
    }

    @Override
    public void showStatus(){
        System.out.println(name + "light is " + (isOn? "ON" : "OFF"));

    }
}
