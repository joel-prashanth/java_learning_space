package devices;

public abstract class SmartDevice {
    protected String name;

    public SmartDevice(String name){
        this.name = name;
    }

    public String getName(){return name; }

    public abstract void showStatus();
}
