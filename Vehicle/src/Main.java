public class Main {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "Model S", "Red");

        tesla.accelerate();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.brake();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.adjustSeat(2);

    }
}
