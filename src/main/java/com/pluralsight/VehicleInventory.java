package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleInventory {
    static void main() {
        // scanner creation and array builder
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Vehicle> inventory = new ArrayList<>();

        // call preload vehicles
        preloadVehicles(inventory);

        // call display menu
        displayMenu();

        // user input
        int input = myScanner.nextInt();
        myScanner.nextLine();

        switch (input){
            case 1:
                listAllVehicles(inventory);
                break;
            case 2:
                listAllVehicles(inventory);
                break;
            case 3:
                listAllVehicles(inventory);
                break;
            case 4:
                listAllVehicles(inventory);
                break;
            case 5:
                listAllVehicles(inventory);
                break;
            case 6:
                listAllVehicles(inventory);
                break;
            default:
                System.out.println("Not a valid option, try again!");
        }

        // end scanner(good practice)
        myScanner.close();

    }

    // 6 vehicles preload
    static void preloadVehicles(ArrayList<Vehicle> inventory) {
        inventory.add(new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500));
        inventory.add(new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000));
        inventory.add(new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700));
        inventory.add(new Vehicle(101124, "Honda Civic", "White", 70000, 7500));
        inventory.add(new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500));
        inventory.add(new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000));
    }

    // display menu for all 6 options
    static void displayMenu() {
        System.out.print("""
                What do you want to do?
                 1 - List all vehicles
                 2 - Search by make/model
                 3 - Search by price range
                 4 - Search by color
                 5 - Add a vehicle
                 6 - Quit
                Enter your command: 
                """);
    }

    // option 1: list all vehicles
    static void listAllVehicles(ArrayList<Vehicle> inventory) {
        for(Vehicle vehicle : inventory){
            System.out.printf("Id: %d, Make Model: %s, Color: %s, Odometer: %d, Price: $%.2f%n", vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getOdometerReading(), vehicle.getPrice());
        }
    }

    // option 2: search vehicles by make or model.
    static void findVehiclesByMakeModel(ArrayList<Vehicle> inventory, Scanner myScanner) {
        System.out.println("Enter a make or model: ");
        String search = myScanner.nextLine().trim().toLowerCase();

    }

    // option 3: search vehicles within price
    static void findVehiclesByPrice(ArrayList<Vehicle> inventory, Scanner myScanner) {

    }

    // option 4: search vehicles by color
    static void findVehiclesByColor(ArrayList<Vehicle> inventory, Scanner myScanner) {

    }

    // option 5: add a vehicle to the inventory
    static void addVehicle(ArrayList<Vehicle> inventory, Scanner myScanner) {

    }

}
