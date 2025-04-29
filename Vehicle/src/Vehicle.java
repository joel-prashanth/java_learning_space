class Vehicle {
    String make;
    String model;
    String color;
    int speed;

    // Parameterized constructor
    public Vehicle(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
        System.out.println("Vehicle created.");
    }

    public void accelerate () {
        System.out.println("The vehicle is speeding up.");
        this.speed += 5;
    }

    public void brake() {
        System.out.println("The vehicle is slowing down.");
        this.speed -= 5;
    }

    public void turn(String direction) {
        System.out.println("Turning " + direction);
    }

    public int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle{
    int seatPosition;

    public Car(String make, String model, String color){
        super(make, model, color);
        this.seatPosition = 0;
        System.out.println("Car created!");
    }

    public void adjustSeat(int adjustment){
        this.seatPosition += adjustment;

        if(adjustment > 0){
            System.out.println("Moving seat forward...");
        }
        else if(adjustment < 0){
            System.out.println("Moving seat backwards...");
        }
        else{
            System.out.println("Seat position not changed.");
        }
    }
}