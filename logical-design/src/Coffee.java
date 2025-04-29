public class Coffee {
    String name;
    String roast;
    int caffineLevelInMg;
    double price;


    public Coffee(String name, String roast, double price){
        this.name = name;
        this.roast = roast;
        this.price = price;
        setCaffineLevel();
    }
    public void setCaffineLevel(){
        switch (roast) {
            case "light" -> caffineLevelInMg += 50;
            case "medium" -> caffineLevelInMg += 100;
            case "dark" -> caffineLevelInMg += 150;
            default -> caffineLevelInMg = 0;
        }
    }
    public void grindBeans(){
        System.out.println("\n Grinding beans for " + name + "...");
    }

    public void brewCoffee(){
        System.out.println("\n Brewing your favorite " + name + "...");
    }

    public void printInfo() {
        System.out.println("\nYou ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + caffineLevelInMg + " mg.");
    }
}
