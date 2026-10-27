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
}
