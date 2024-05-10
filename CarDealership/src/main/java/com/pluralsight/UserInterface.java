//package com.pluralsight;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.io.*;
//import java.util.ArrayList;
//
//public class UserInterface {
//    //  dealership : Dealership();
//    private static final String FILE_PATH = "vehicles.txt"; // File path for storing vehicle data
//    private static final String DELIMITER = "|";
//    // Delimiter for parsing data in the file
//    private static Dealership dealership;
//    static  Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//// Initialize the dealership with data from the file
//        //dealership = new Dealership(FILE_PATH, DELIMITER);
//// Start the application
//        startApplication();
//    }
//
//    public static void startApplication() {
//       // Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        while (!quit) {
//            displayMenu();
//            int choice =
//                    scanner.nextInt();
//            scanner.nextLine();
//// Consume newline
//            switch (choice) {
//                case 1:
//                    processFindByPrice();
//                    break;
//                case 2:
//                    processFindByMakeModel();
//                    break;
//
//                case 3:
//                    processFindByYearRange();
//                    break;
//                case 4:
//                    processFindByColor();
//                    break;
//                case 5:
//                    processFindByMileageRange();
//                    break;
//                case 6:
//                    processFindByType();
//                    break;
//                case 7:
//                    processListAllVehicles();
//                    break;
//                case 8:
//                    processAddVehicle();
//                    break;
//                case 9:
//                    processRemoveVehicle();
//                    break;
//                case 99:
//                    quit = true;
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//// Save the updated vehicle data back to the file before quitting dealership.saveToFile(FILE_PATH, DELIMITER);
//        scanner.close();
//    }
//
//    public static void displayMenu() {
//        System.out.println("\nDealership Application Menu:");
//        System.out.println("1. Find vehicles within a price range");
//        System.out.println("2. Find vehicles by make / model");
//        System.out.println("3. Find vehicles by year range");
//        System.out.println("4. Find vehicles by color");
//        System.out.println("5. Find vehicles by mileage range");
//        System.out.println("6. Find vehicles by type");
//        System.out.println("7. List all vehicles");
//        System.out.println("8. Add a vehicle");
//        System.out.println("9. Remove a vehicle");
//        System.out.println("99. Quit");
//        System.out.print("Enter your choice: ");
//    }
//    public static void processFindByPrice(){
//        // Implement logic to find vehicles by price range
//        System.out.println("Enter minimum price: ");
//        double minPrice = scanner.nextDouble();
//        System.out.println("Enter minimum price: ");
//        double maxPrice = scanner.nextDouble();
//
//        ArrayList<Vehicle> vehicles = dealership.();//findVehiclesByPriceRange
//        if (Vehicle.isEmpty()){
//            System.out.println("No vehicle found within the range:");
//        } else {
//            System.out.println("Vehicle within the price range:");
//            for (Vehicle vehicle : vehicles){
//                System.out.println(vehicle);
//            }
//        }
//    }
//    public static void processFindByMakeModel(){
//        // Implement logic to find vehicles by Make Model
//
//    }
//    public static void processFindByYearRange(){
//        // Implement logic to find vehicles by year range
//
//    }
//    public static void processFindByColor(){
//        // Implement logic to find vehicles by color
//
//    }
//    public static void processFindByMileageRange(){
//        // Implement logic to find vehicles by Mileage range
//
//    }
//    public static void processFindByType(){
//        // Implement logic to find vehicles by Type
//
//    }
//    public static void processListAllVehicles(){
//        // Implement logic to list all vehicles
//
//    }
//    public static void processAddVehicle(){
//        // Implement logic to add a vehicles
//
//    }
//    public static void processRemoveVehicle(){
//        // Implement logic to remove a vehicles
//
//
//    }
//
//}
