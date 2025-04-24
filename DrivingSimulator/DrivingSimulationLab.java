package DrivingSimulator;
import java.util.Scanner;

// DrivingSimulation class implements the Driving Simulation which includes various actions like turn the engine on/off, accelerate (i.e. increase the speed) and apply the breaks.
public class DrivingSimulationLab {

    public static String gear = "P";
    public static int speed = 0;
    public static boolean isEngineOn = false;
    public static Scanner keyBoard = new Scanner(System.in);

    public static void startSimulation() {
        boolean displayMenu = true;
        while (displayMenu) {
            displayDashboard();
            int choice = getUserChoice();
            processChoice(choice);
            System.out.println();
        }
    }

    public static void displayDashboard() {
        System.out.println("------ Car Dashboard ------");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Engine: " + (isEngineOn ? "On" : "Off"));
        System.out.println("Gear: " + gear);
        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");
    }

    public static int getUserChoice() {
        System.out.print("Enter your choice: ");
        return keyBoard.nextInt();
    }

    public static void processChoice(int choice) {
        switch (choice) {
            case 1:
                toggleEngine();
                break;
            case 2:
                changeGear();
                break;
            case 3:
                accelerate();
                break;
            case 4:
                brake();
                break;
            case 5:
                exitSimulation();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void toggleEngine() {
        isEngineOn = !isEngineOn;
        speed = 0;
        gear = "P";
        System.out.println("Engine is now " + (isEngineOn ? "ON" : "OFF"));
    }

    public static void changeGear() {
        if (!isEngineOn) {
            System.out.println("Please start the engine first!");
            return;
        }

        System.out.print("Enter gear (P, D, R): ");
        keyBoard.nextLine(); // consume newline
        String inputGear = keyBoard.nextLine().toUpperCase();

        if (inputGear.equals("P") || inputGear.equals("D") || inputGear.equals("R")) {
            gear = inputGear;
            System.out.println("Gear changed to: " + gear);
        } else {
            System.out.println("Invalid gear! Please enter P, D, or R.");
        }
    }

    public static void accelerate() {
        if (isEngineOn && !gear.equals("P")) {
            speed += 10;
            System.out.println("Accelerated. Speed is now: " + speed + " km/h");
        } else {
            System.out.println("Can't accelerate! Make sure engine is ON and gear is not in P.");
        }
    }

    public static void brake() {
        if (isEngineOn && speed > 0) {
            speed -= 5;
            if (speed < 0) speed = 0;
            System.out.println("Braked. Speed is now: " + speed + " km/h");
        } else {
            System.out.println("Brake can't be applied! Either engine is OFF or car is already stopped.");
        }
    }

    public static void exitSimulation() {
        System.out.println("Exiting driving simulation. Thank you!");
        System.exit(0);
    }

    public static void main(String[] args) {
        startSimulation();
    }
}
