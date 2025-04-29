public class Latte extends Coffee{
    String milkType;
    String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor){
        super(name, roast, price);

        this.milkType = milkType;
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    @Override
    public void grindBeans() {
        System.out.println("\nCoarsely grinding beans for your " + name + "...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("\nBrewing your " + name + "...");
        System.out.println("Steaming the " + milkType + " milk...");
        if (!syrupFlavor.equals("no")) {
            System.out.println("Adding " + syrupFlavor + " syrup...");
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");
    }
}
