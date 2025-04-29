public class Espresso extends Coffee{
    int numberOfShorts;

    public Espresso(String name, String roast, double price, int numberOfShorts){
        super(name, roast, price);
        this.numberOfShorts = numberOfShorts;
    }

    @Override
    public void grindBeans() {
        System.out.println("Grinding beans for your " + name + "...");
    }

    @Override
    public void brewCoffee() {
        System.out.println("\nBrewing your " + name + " under high pressure...");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("You asked for " + numberOfShorts + " servings!");
        System.out.println("Every serving of Espresso costs " + price + "$. Your total bill is " + (price * numberOfShorts) + "$.");
    }
}
